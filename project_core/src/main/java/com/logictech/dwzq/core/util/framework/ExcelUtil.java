package com.logictech.dwzq.core.util.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.logictech.dwzq.core.constants.FWConstants;
import com.logictech.dwzq.core.util.BaseUtils;
import com.logictech.dwzq.core.util.data.DateUtils;
import com.logictech.dwzq.core.util.data.StringUtils;
import com.logictech.dwzq.core.util.io.FileUtil;
import com.logictech.dwzq.dto.ExcelDto;

public class ExcelUtil extends BaseUtils {

    /**
     * 导出excel
     * 
     * @param excelHead excel标题
     * @param dataList 数据
     * @param FileName 文件名
     * @param SheetName sheet名
     */
    public static Map<String, Object> exportExcel(HttpServletResponse response, List<String> excelHead, List<List<String>> dataList, String FileName, String SheetName) {
        try {
            String folder = "tempexportexcel" + File.separator + DateUtils.dateToString("yyyy/MMdd");
            FileUtil.createFolder(folder);

//            String filepath = Envir.getBaseExportPath() + folder;

//            File fnewpath = new File(filepath);
//            if (!fnewpath.exists()) {
//                fnewpath.mkdirs();
//            }

//            String inputPath = filepath + File.separator + FileName + ".xls";
            ServletOutputStream out = response.getOutputStream();
//            FileOutputStream out = new FileOutputStream(inputPath);
            response.setHeader("Content-disposition", "attachment; filename=" + new String(FileName.getBytes("GB2312"), "8859_1") + ".xls");// 设定输出文件头   
            response.setContentType("application/msexcel");// 定义输出类型 
            //建立excel文件
            HSSFWorkbook workBook = new HSSFWorkbook();
            Integer totalCount = dataList.size();
            for (int n = 0; n < (totalCount / FWConstants.EXCEL_MAX_ROW) + 1; n++) {
                HSSFSheet sheet;
                if (n == 0) {
                    //创建一个工作表
                    sheet = workBook.createSheet(SheetName);
                } else {
                    sheet = workBook.createSheet(SheetName + "(" + n + ")");
                }

                //				CellStyle cellStyle = workBook.createCellStyle();
                //				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                //				cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);

                //插入文件头
                if (excelHead != null && excelHead.size() > 0) {
                    HSSFRow row = sheet.createRow(0);
                    for (int i = 0; i < excelHead.size(); i++) {
                        // 在Label对象的子对象中指明单元格的位置和内容      
                        HSSFCell cell = row.createCell(i);
                        cell.setCellValue(excelHead.get(i));
                    }
                }

                //插入数据
                if (dataList != null && dataList.size() > 0) {
                    Integer dataLen = dataList.size() - FWConstants.EXCEL_MAX_ROW * n;
                    if (dataLen > FWConstants.EXCEL_MAX_ROW) {
                        dataLen = FWConstants.EXCEL_MAX_ROW;
                    }
                    for (int i = 0; i < dataLen; i++) {
                        List<String> lineData = dataList.get(i + FWConstants.EXCEL_MAX_ROW * n);
                        Row row = sheet.createRow(i + 1);
                        for (int j = 0; j < lineData.size(); j++) {
                            if (lineData.get(j) != null) {
                                Cell cell = row.createCell(j);
                                cell.setCellValue(lineData.get(j));
                            }
                        }
                    }
                }
            }
            workBook.write(out);
            out.close();

            //	         HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(inputPath));
            //	         // 设置密 码 保 护 ·
            //	         wb.writeProtectWorkbook("123456", "");
            //	         // 写入excel文件
            //	         FileOutputStream fileOut = new FileOutputStream(inputPath);
            //	         wb.write(fileOut);
            //	         fileOut.close();

//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("fileName", FileName);
//            map.put("inputPath", inputPath);
            return null;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    /**
     * 根据模板导出Excel
     * 
     * @param modelPath 模板文件路径
     * @param dataList 数据
     * @param FileName 导出的Excel文件名
     * @param SheetName 操作的Sheet名
     */
    public static Map<String, Object> exportModelExcel(String modelPath, List<List<String>> dataList, String FileName, String SheetName) {
        return exportModelExcel(modelPath, dataList, FileName, SheetName, 2);
    }

    /**
     * 根据模板导出Excel
     * 
     * @param modelPath 模板文件路径
     * @param dataList 数据
     * @param FileName 导出的Excel文件名
     * @param SheetName 操作的Sheet名
     * @param lineCount 开始行数，计数以1开始
     */
    public static Map<String, Object> exportModelExcel(String modelPath, List<List<String>> dataList, String FileName, String SheetName, int lineCount) {
        try {

            String folder = "tempexportexcel" + File.separator + DateUtils.dateToString("yyyyMMddHHmmss");
            FileUtil.createFolder(folder);

            String filepath = Envir.getBaseExportPath() + folder;

            File fnewpath = new File(filepath);
            if (!fnewpath.exists()) {
                fnewpath.mkdirs();
            }

            String inputPath = filepath + File.separator + FileName +".xls";

//            File targetFile = new File(inputPath);
            FileOutputStream out = new FileOutputStream(inputPath);
//            Envir.getResponse().setHeader("Content-disposition", "attachment; filename=" + new String(FileName.getBytes("GB2312"), "8859_1") + ".xls");// 设定输出文件头   
//            Envir.getResponse().setContentType("application/msexcel");// 定义输出类型 
            //建立excel文件
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(modelPath));
            Workbook workBook = new HSSFWorkbook(fs);
            //获取工作表
            Sheet sheet = workBook.getSheet(SheetName);
            //获取第一行的样式
            Row rowStyle = sheet.getRow(lineCount - 1);
            //插入数据
            if (dataList != null && dataList.size() > 0) {
                for (int i = 0; i < dataList.size(); i++) {
                    List<String> lineData = dataList.get(i);
                    Row row = sheet.createRow(i + lineCount - 1);
                    for (int j = 0; j < lineData.size(); j++) {
                        if (rowStyle != null) {
                            
                            Cell cell = row.createCell(j);
                            if (lineData.get(j) != null) {
                                cell.setCellValue(lineData.get(j));
                            } else {
                                cell.setCellValue("");
                            }
                            if(rowStyle.getCell(j) != null){
	                            //获取列的样式
	                            CellStyle cellValueStyle = rowStyle.getCell(j).getCellStyle();
	                            //设置样式
	                            cell.setCellStyle(cellValueStyle);
                            }
                        } else {
                            Cell cell = row.createCell(j);
                            if (lineData.get(j) != null) {
                                cell.setCellValue(lineData.get(j));
                            }
                        }
                    }
                }
            }
            workBook.write(out);
            out.close();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fileName", FileName);
            map.put("inputPath", inputPath);
            return map;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    /**
     * 根据模板导出Excel包含公式
     * 
     * @param modelPath 模板文件路径
     * @param dataList 数据
     * @param FileName 导出的Excel文件名
     * @param SheetName 操作的Sheet名
     * @param lineCount 开始行数，计数以1开始
     */
    public static Map<String, Object> exportModelExcelFormula(String modelPath, List<List<String>> dataList, String FileName, String SheetName, int lineCount) {
        try {

            String folder = "tempexportexcel" + File.separator + DateUtils.dateToString("yyyy/MMdd");
            FileUtil.createFolder(folder);

            String filepath = Envir.getBaseExportPath() + folder;

            File fnewpath = new File(filepath);
            if (!fnewpath.exists()) {
                fnewpath.mkdirs();
            }

            String inputPath = filepath + File.separator + FileName;

//            File targetFile = new File(inputPath);
            FileOutputStream out = new FileOutputStream(inputPath);
//            Envir.getResponse().setHeader("Content-disposition", "attachment; filename=" + new String(FileName.getBytes("GB2312"), "8859_1") + ".xls");// 设定输出文件头   
//            Envir.getResponse().setContentType("application/msexcel");// 定义输出类型 
            //建立excel文件
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(modelPath));
            Workbook workBook = new HSSFWorkbook(fs);
            //获取工作表
            Sheet sheet = workBook.getSheet(SheetName);
            
            //获取第一行的样式
            Row rowStyle = sheet.getRow(lineCount - 1);
            //插入数据
            if (dataList != null && dataList.size() > 0) {
                for (int i = 0; i < dataList.size(); i++) {
                    List<String> lineData = dataList.get(i);
                    Row row = sheet.createRow(i + lineCount - 1);
                    for (int j = 0; j < lineData.size(); j++) {
                        if (rowStyle != null) {
                            
                            Cell cell = row.createCell(j);
                            if (lineData.get(j) != null && StringUtils.isNotEmpty(lineData.get(j))) {
                                if(StringUtils.isEqual(lineData.get(j).substring(0, 1), "=") ) {
                                    cell.setCellFormula(lineData.get(j).substring(1));
                                } else {
                                    cell.setCellValue(lineData.get(j));
                                }
                            } else {
                                cell.setCellValue("");
                            }
                            if(rowStyle.getCell(j) != null){
                                //获取列的样式
                                CellStyle cellValueStyle = rowStyle.getCell(j).getCellStyle();
                                //设置样式
                                cell.setCellStyle(cellValueStyle);
                            }
                        } else {
                            Cell cell = row.createCell(j);
                            if (lineData.get(j) != null && StringUtils.isNotEmpty(lineData.get(j))) {
                                if(lineData.get(j).substring(0, 1) == "=") {
                                    cell.setCellFormula(lineData.get(j).substring(1));
                                } else {
                                    cell.setCellValue(lineData.get(j));
                                }
                            }
                        }
                    }
                }
            }
            workBook.write(out);
            out.close();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fileName", FileName);
            map.put("inputPath", inputPath);
            return map;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
    
    /**
     * 导出excel
     * 
     * @param excelHead excel标题带上属性
     * @param dataList 数据
     * @param FileName 文件名
     * @param SheetName sheet名
     */
    public static Map<String, Object> exportExcelForStyle(List<ExcelDto> excelHead, List<List<String>> dataList, String FileName, String SheetName) {
        try {
            String folder = "tempexportexcel" + File.separator + DateUtils.dateToString("yyyy/MMdd");
            FileUtil.createFolder(folder);

            String filepath = Envir.getBaseExportPath() + folder;

            File fnewpath = new File(filepath);
            if (!fnewpath.exists()) {
                fnewpath.mkdirs();
            }

            String inputPath = filepath + File.separator + FileName + ".xls";

            FileOutputStream out = new FileOutputStream(inputPath);
//            Envir.getResponse().setHeader("Content-disposition", "attachment; filename=" + new String(FileName.getBytes("GB2312"), "8859_1") + ".xls");// 设定输出文件头   
//            Envir.getResponse().setContentType("application/msexcel");// 定义输出类型 
            //建立excel文件
            HSSFWorkbook workBook = new HSSFWorkbook();
            Integer totalCount = dataList.size();
            for (int n = 0; n < (totalCount / FWConstants.EXCEL_MAX_ROW) + 1; n++) {
                HSSFSheet sheet;
                if (n == 0) {
                    //创建一个工作表
                    sheet = workBook.createSheet(SheetName);
                } else {
                    sheet = workBook.createSheet(SheetName + "(" + n + ")");
                }

                //插入文件头
                if (excelHead != null && excelHead.size() > 0) {
                    HSSFRow row = sheet.createRow(0);
                    for (int i = 0; i < excelHead.size(); i++) {

                        // 在Label对象的子对象中指明单元格的位置和内容      
                        HSSFCell cell = row.createCell(i);
                        CellStyle cellStyle = workBook.createCellStyle();
                        Font font = workBook.createFont();
                        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

                        //设置列宽
                        if (excelHead.get(i).getWidth() != null) {
                            sheet.setColumnWidth(i, excelHead.get(i).getWidth());
                        }
                        //设置背景色
                        if (excelHead.get(i).getBackGroundColor() != null) {
                            cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                            cellStyle.setFillForegroundColor(excelHead.get(i).getBackGroundColor());
                        }
                        //字体粗体
                        if (excelHead.get(i).getBoldweight() != null) {
                            font.setBoldweight(excelHead.get(i).getBoldweight());
                        }
                        //字体
                        if (StringUtils.isNotEmpty(excelHead.get(i).getFontName())) {
                            font.setFontName(excelHead.get(i).getFontName());
                        }
                        //字体大小
                        if (excelHead.get(i).getFontSize() != null) {
                            font.setFontHeightInPoints(excelHead.get(i).getFontSize());
                        }

                        cellStyle.setFont(font);
                        //设置粗体
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(excelHead.get(i).getValue());
                    }
                }

                //插入数据
                if (dataList != null && dataList.size() > 0) {
                    Integer dataLen = dataList.size() - FWConstants.EXCEL_MAX_ROW * n;
                    if (dataLen > FWConstants.EXCEL_MAX_ROW) {
                        dataLen = FWConstants.EXCEL_MAX_ROW;
                    }
                    for (int i = 0; i < dataLen; i++) {
                        List<String> lineData = dataList.get(i + FWConstants.EXCEL_MAX_ROW * n);
                        Row row = sheet.createRow(i + 1);
                        for (int j = 0; j < lineData.size(); j++) {
                            if (lineData.get(j) != null) {
                                Cell cell = row.createCell(j);
                                cell.setCellValue(lineData.get(j));
                            }
                        }
                    }
                }
            }
            workBook.write(out);
            out.close();

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fileName", FileName);
            map.put("inputPath", inputPath);
            return map;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    public static boolean isBlankRow(Row row) {
        if (row == null) {
            return true;
        }
        boolean result = true;
        for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
            Cell cell = row.getCell(i, Row.RETURN_BLANK_AS_NULL);
            String value = "";
            if (cell != null) {
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        value = cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        value = String.valueOf((int) cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        value = String.valueOf(cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        value = String.valueOf(cell.getCellFormula());
                        break;
                    //case Cell.CELL_TYPE_BLANK:
                    //    break;
                    default:
                        break;
                }

                if (!value.trim().equals("")) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

}
