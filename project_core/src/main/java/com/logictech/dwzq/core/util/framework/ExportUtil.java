package com.logictech.dwzq.core.util.framework;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logictech.dwzq.core.constants.APIConstants;
import com.logictech.dwzq.core.util.data.ConfigUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

import com.logictech.dwzq.core.annotations.ExportDescription;
import com.logictech.dwzq.core.util.data.DateUtils;

/**
 * excel导出工具类
 *
 * @date 2014-12-08 下午1:20:13
 * @author wangc
 * @version 1.0
 * @param <T>
 */
public class ExportUtil<T> {
    // 默认excel文件名后缀
    private final String       EXCEL_FIX = ".xls";
    
    private final String       EXPORT_NO_DATA = "导出数据为空。";

    // 日志记录
    protected static final Log logger    = LogFactory.getLog(ExportUtil.class);
    
    public String export(List<T> dataList, HttpServletRequest req, HttpServletResponse resp, String fileName,
            String sheetName) throws Exception {
        return export(dataList, req, resp, fileName, sheetName, null);
    }
    
    public String export(List<T> dataList, HttpServletRequest req, HttpServletResponse resp, String fileName) throws Exception {
        return export(dataList, req, resp, fileName, null, null);
    }
    
    public String export(List<T> dataList, HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return export(dataList, req, resp, null, null, null);
    }

    @SuppressWarnings("unchecked")
    public String export(List<T> dataList, HttpServletRequest req, HttpServletResponse resp, String fileName,
            String sheetName, String[] expValues) throws Exception {
        String path = ConfigUtils.getSysConfig("exportTempPath");
        // 创建工作簿对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 文件名准备 如果缺省 则使用默认时间戳作为文件名
        if (StringUtils.isEmpty(fileName)) {
            fileName = String.valueOf(new Date().getTime()) + EXCEL_FIX;
        }
        if (!fileName.endsWith(EXCEL_FIX)) {
            fileName += EXCEL_FIX;
        }
        String realPath = path + APIConstants.RIGHT_SLASH + fileName;
        // 创建.xls文件
        FileOutputStream fos = new FileOutputStream(realPath);
        // 创建工作表
        HSSFSheet sheet = workbook.createSheet(StringUtils.isEmpty(sheetName) ? "sheet1" : sheetName);
        // 设置工作表列宽
        sheet.setDefaultColumnWidth(12);
        // 获取列头样式对象
        HSSFCellStyle columnTopStyle = this.getColumnTopStyle(workbook);
        // 单元格样式对象
        HSSFCellStyle style = this.getStyle(workbook);
        // 导出数据对象不为空
        if (dataList == null || dataList.size() == 0) {
            // 流关闭
            fos.close();
            return EXPORT_NO_DATA;
        }
        // 获取第一条数据 对注解进行解析
        T data = dataList.get(0);
        List<ExportData> list = new ArrayList<ExportData>();
        Method getMethod = null;
        Class<T> cls = (Class<T>) data.getClass();
        // 没有初始导出字段定义
        if (expValues == null) {
            Field[] fields = cls.getDeclaredFields();
            ExportDescription an;
            ExportData expData;
            for (Field f : fields) {
                an = f.getAnnotation(ExportDescription.class);
                if (an != null) {
                    expData = new ExportData();
                    expData.setSort(an.index());
                    expData.setTitle(an.title());
                    expData.setName(f.getName());
                    list.add(expData);
                }
            }
            Collections.sort(list, new Comparator<ExportData>() {
                public int compare(ExportData o1, ExportData o2) {
                    return o1.getSort() > o2.getSort() ? 1 : -1;
                }
            });
        }
        int index = 0;
        // 循环赋值
        for (int i = 0, siz = dataList.size(); i < siz; i++) {
            if (i == 0) {
                HSSFRow row = sheet.createRow(i);
                HSSFCell cell1 = null;
                for(int n = 0, len = list.size(); n < len; n++){
                    cell1 = row.createCell(n);
                    cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
                    cell1.setCellValue(list.get(n).getTitle());
                    cell1.setCellStyle(columnTopStyle);
                }
            }
            // 循环数据List
            data = dataList.get(i);
            cls = (Class<T>) data.getClass();
            HSSFRow row = sheet.createRow(i + 1);
            for (ExportData d : list) {
                HSSFCell cell = row.createCell(index++, HSSFCell.CELL_TYPE_STRING);
                getMethod = cls.getMethod("get" + upperCaseInitial(d.getName()));
                autoSetCell(getMethod.invoke(data), cell, style);
            }
            index = 0;
        }
        
        workbook.write(fos);
        // 缓冲
        fos.flush();
        // 流关闭
        fos.close();
        // 导出
        if(workbook !=null){
            resp.addHeader("Content-type","application/ms-excel,charset=utf-8");
            resp.addHeader("Content-Disposition", "filename=" + new String(fileName.getBytes("gbk"), "iso8859-1"));
            workbook.write(resp.getOutputStream());
        }

        File f = new File(realPath);
        if (f != null && f.exists()) {
            f.delete();
        }
        return null;
    }

    private void autoSetCell(Object invoke, HSSFCell cell, HSSFCellStyle style) {
        cell.setCellStyle(style);
        if (invoke == null) {
            cell.setCellValue(StringUtils.EMPTY);
            return;
        }
        if (invoke instanceof String) {
            String val = (String) invoke;
            cell.setCellValue(val);
        }
        else if (invoke instanceof Double) {
            Double val = (Double) invoke;
            cell.setCellValue(val);
        }
        else if (invoke instanceof Integer) {
            Integer val = (Integer) invoke;
            cell.setCellValue(val);
        }
        else if (invoke instanceof Boolean) {
            Boolean val = (Boolean) invoke;
            cell.setCellValue(val);
        }
        else if (invoke instanceof BigDecimal) {
            BigDecimal val = (BigDecimal) invoke;
            cell.setCellValue(val.doubleValue());
        }
        else if (invoke instanceof Date) {
            Date val = (Date) invoke;
            cell.setCellValue(DateUtils.formatString(val, DateUtils.PATTEN_YMD));
        }
        else if (invoke instanceof Long) {
            Long val = (Long) invoke;
            cell.setCellValue(val.toString());
        }
        else {
            logger.error(DateUtils.getCurrentDateString() + " ExcelUtil.autoSetCell方法，导出类型不合法.请检查实体类.");
        }
    }

    /**
     * 列头单元格样式
     */
    private HSSFCellStyle getColumnTopStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        font.setFontHeightInPoints((short) 11);
        //字体加粗
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        //设置字体名字 
        font.setFontName("Courier New");
        //设置样式; 
        HSSFCellStyle style = workbook.createCellStyle();
        //设置底边框;
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        //设置底边框颜色;  
        style.setBottomBorderColor(HSSFColor.BLACK.index);
        //设置左边框;   
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        //设置左边框颜色; 
        style.setLeftBorderColor(HSSFColor.BLACK.index);
        //设置右边框; 
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        //设置右边框颜色; 
        style.setRightBorderColor(HSSFColor.BLACK.index);
        //设置顶边框; 
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        //设置顶边框颜色;  
        style.setTopBorderColor(HSSFColor.BLACK.index);
        //在样式用应用设置的字体;  
        style.setFont(font);
        //设置自动换行; 
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //设置垂直对齐的样式为居中对齐; 
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        return style;
    }

    /**
     * 列数据信息单元格样式
     */
    private HSSFCellStyle getStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        //font.setFontHeightInPoints((short)10);
        //字体加粗
        //font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        //设置字体名字 
        font.setFontName("Courier New");
        //设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        //设置底边框;
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        //设置底边框颜色;  
        style.setBottomBorderColor(HSSFColor.BLACK.index);
        //设置左边框;   
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        //设置左边框颜色; 
        style.setLeftBorderColor(HSSFColor.BLACK.index);
        //设置右边框; 
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        //设置右边框颜色; 
        style.setRightBorderColor(HSSFColor.BLACK.index);
        //设置顶边框; 
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        //设置顶边框颜色;  
        style.setTopBorderColor(HSSFColor.BLACK.index);
        //在样式用应用设置的字体;  
        style.setFont(font);
        //设置自动换行; 
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //设置垂直对齐的样式为居中对齐; 
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        return style;
    }

    private String upperCaseInitial(String src) {
        if (StringUtils.isBlank(src)) {
            return "";
        }
        char[] c = src.toCharArray();
        c[0] -= 32;
        return String.valueOf(c);
    }
}
class ExportData {
    protected int    sort;

    protected String name;

    protected String title;

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
