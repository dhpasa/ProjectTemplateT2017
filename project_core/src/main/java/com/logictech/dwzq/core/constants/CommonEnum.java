package com.logictech.dwzq.core.constants;

import java.util.ArrayList;
import java.util.List;

import com.logictech.dwzq.core.util.data.StringUtils;
import com.logictech.dwzq.dto.DropDownDto;

public final class CommonEnum {

    /** 不提供构造函数 */
    private CommonEnum()
    {
    }

    /**
     * 删除标志
     */
    public enum Flag implements IEnum {
        /** 正常 */
        NORMAL("正常", "0"),
        /** 已删除 */
        DELETED("已删除", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Flag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Flag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Flag c : Flag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Flag c : Flag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Flag c : Flag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 手机平台
     */
    public enum MobilePlatform implements IEnum {
        /** android */
        ANDROID("android", "0"),
        /** ios */
        IOS("ios", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MobilePlatform";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MobilePlatform(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MobilePlatform c : MobilePlatform.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MobilePlatform c : MobilePlatform.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MobilePlatform c : MobilePlatform.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否
     */
    public enum YesOrNo implements IEnum {
        /** 是 */
        YES("是", "1"),
        /** 否 */
        NO("否", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "YesOrNo";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private YesOrNo(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (YesOrNo c : YesOrNo.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (YesOrNo c : YesOrNo.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (YesOrNo c : YesOrNo.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 发布状态
     */
    public enum Publish implements IEnum {
        /** 未发布 */
        UNPUBLISHED("未发布", "0"),
        /** 已发布 */
        PUBLISHED("已发布", "1"),
        /** 已取消 */
        CANCEL("已取消", "2");
        /** 已同步 */
        /* SYNCHRONOUS("已同步", "3"); */

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Publish";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Publish(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Publish c : Publish.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Publish c : Publish.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Publish c : Publish.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 审核状态
     */
    public enum CheckStatus implements IEnum {
        /** 一审 */
        ONEINSTANCE("一审", "0"),
        /** 二审 */
        TWOINSTANCE("二审", "3"),
        /** 审核完成 */
        COMPLETE("审核完成", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CheckStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CheckStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CheckStatus c : CheckStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CheckStatus c : CheckStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CheckStatus c : CheckStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 开户状态
     */
    public enum OpenStatus implements IEnum {
        /** 上传证件照片完成 */
        UPLOADIMG("上传证件照片完成", "uploadimg"),
        /** 提交客户资料完成 */
        IDCONFIRM("提交客户资料完成", "idconfirm"),
        /** 双相视频见证完成 */
        WITNESS("双相视频见证完成", "witness"),
        /** 数字证书安装完 */
        CERTINTALL("数字证书安装完成", "certintall"),
        /** 选择开立账户完成 */
        STKACCT("选择开立账户完成", "stkacct"),
        /** 设置密码完成 */
        SETPWD("设置密码完成", "setpwd"),
        /** 选择绑定三方存管完成 */
        TPBANK("选择绑定三方存管完成", "tpbank"),
        /** 风险评测完成 */
        RISKSURVEY("风险评测完成", "risksurvey"),
        /** 客户前端流程结束 */
        VISITSURVEY("客户前端流程结束", "visitsurvey"),
        /** 开户完成 */
        FINISH("开户完成", "finish");
        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "OpenStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private OpenStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (OpenStatus c : OpenStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (OpenStatus c : OpenStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (OpenStatus c : OpenStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 审核状态
     */
    public enum CheckFlag implements IEnum {
        /** 未发布 */
        UNPUBLISHED("未审核", "0"),
        /** 发布取消 */
        CANCEL("审核通过", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CheckFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CheckFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CheckFlag c : CheckFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CheckFlag c : CheckFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CheckFlag c : CheckFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 执行状态
     */
    public enum ExecuteStatus implements IEnum {
        /** 失败 */
        FAILURE("失败", "0"),
        /** 成功 */
        SUCCESS("成功", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ExecuteStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ExecuteStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ExecuteStatus c : ExecuteStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ExecuteStatus c : ExecuteStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ExecuteStatus c : ExecuteStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 显示状态
     */
    public enum ShowStatus implements IEnum {
        /** 不显示 */
        NODIS("不显示", "0"),
        /** 显示 */
        DISPLAY("显示", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ShowStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ShowStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ShowStatus c : ShowStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ShowStatus c : ShowStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ShowStatus c : ShowStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否关注
     */
    public enum AttentionFlag implements IEnum {
        /** 不关注 */
        NOATT("不关注", "0"),
        /** 关注 */
        ATT("关注", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AttentionFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AttentionFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AttentionFlag c : AttentionFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AttentionFlag c : AttentionFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AttentionFlag c : AttentionFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 客户类型
     */
    public enum CustomerType implements IEnum {
        /** 个人用户 */
        PERSON("个人用户", "1"),
        /** 企业用户 */
        COMPANY("企业用户", "2"),
        /** 企业子账号 */
        CHILD("企业子账号", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CustomerType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CustomerType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CustomerType c : CustomerType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CustomerType c : CustomerType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CustomerType c : CustomerType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否激活
     */
    public enum ActiveFlag implements IEnum {
        /** 未激活 */
        UNACTIVE("未激活", "0"),
        /** 激活 */
        ACTIVE("激活", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ActiveFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ActiveFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ActiveFlag c : ActiveFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ActiveFlag c : ActiveFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ActiveFlag c : ActiveFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 状态
     */
    public enum Status implements IEnum {
        /** 失效 */
        INVALID("失效", "0"),
        /** 生效 */
        VALID("生效", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Status";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Status(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Status c : Status.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Status c : Status.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Status c : Status.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 模板类型
     */
    public enum TempletType implements IEnum {
        /** 后台设置模板 */
        ADMIN("后台设置模板", "0"),
        /** 客户自定义模板 */
        CUST("客户自定义模板", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TempletType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TempletType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TempletType c : TempletType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TempletType c : TempletType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TempletType c : TempletType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 传感器类型
     */
    public enum SensorType implements IEnum {
        /** 数值型 */
        NUMBER("数值型", "1"),
        /** 逻辑型 */
        LOGIC("逻辑型", "2"),
        /** 图片型 */
        IMG("图片型", "3"),
        /** 泛型 */
        TEXT("泛型", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SensorType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SensorType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SensorType c : SensorType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SensorType c : SensorType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SensorType c : SensorType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 传感器显示状态
     */
    public enum SensorStatus implements IEnum {
        /** 不显示 */
        INVALID("不显示", "0"),
        /** 显示 */
        VALID("显示", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SensorStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SensorStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SensorStatus c : SensorStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SensorStatus c : SensorStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SensorStatus c : SensorStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 上下架状态
     */
    public enum ShelfStatus implements IEnum {
        /** 下架 */
        UNSHELF("下架", "0"),
        /** 上架 */
        ONSHELF("上架", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ShelfStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ShelfStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ShelfStatus c : ShelfStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ShelfStatus c : ShelfStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ShelfStatus c : ShelfStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 报修单状态
     */
    public enum RepairStatus implements IEnum {
        /** 已提交 */
        COMMIT("已提交", "0"),
        /** 处理中 */
        DEAL("处理中", "1"),
        /** 已寄出 */
        SEND("已寄出", "2"),
        /** 已完成 */
        COMPLETE("已完成", "3"),
        /** 取消处理 */
        CANCEL("取消处理", "-1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "RepairStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private RepairStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (RepairStatus c : RepairStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (RepairStatus c : RepairStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (RepairStatus c : RepairStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 报修单状态
     */
    public enum SerialType implements IEnum {
        /** 正常 */
        NORMAL("正常", "1"),
        /** 样机 */
        MODEL("样机", "2"),
        /** 试用机 */
        TRY("试用机", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SerialType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SerialType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SerialType c : SerialType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SerialType c : SerialType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SerialType c : SerialType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 系统日志模块
     */
    public enum SysLogType implements IEnum {
        /** 个人用户 */
        SigleCust("个人用户", "1"),
        /** 企业用户 */
        EnterpriseCust("企业用户", "2"),
        /** 代理商 */
        Agent("代理商", "3"),
        /** 序列号 */
        Serial("序列号", "4"),
        /** 设备 */
        Device("设备", "5"),
        /** 维修单 */
        Repair("维修单", "6"),
        /** 文字类型 */
        CmsCate("文字类型", "7"),
        /** 文章发布 */
        Cms("文章发布", "8"),
        /** 文件类型 */
        FileCate("文件类型", "9"),
        /** 文件 */
        File("文件", "10"),
        /** 广告 */
        Advertisement("广告", "11"),
        /** 设备类型 */
        DevType("设备类型", "12"),
        /** 设备类型模板 */
        DevTypeTemp("设备类型模板", "13"),
        /** 设备传感器配置 */
        DevTypeSensor("设备传感器配置", "14"),
        /** 设备设置配置 */
        DevTypeConf("设备设置配置", "15"),
        /** 设备图片 */
        DevImg("设备图片", "16"),
        /** 快递 */
        Express("快递", "17"),
        /** 用户 */
        User("用户", "18"),
        /** 角色 */
        Role("角色", "19");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SysLogType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SysLogType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SysLogType c : SysLogType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SysLogType c : SysLogType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SysLogType c : SysLogType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 系统日志操作类型
     */
    public enum SysLogOptType implements IEnum {
        /** 新增 */
        Insert("新增", "1"),
        /** 更新 */
        Update("更新", "2"),
        /** 删除 */
        Delete("删除", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SysLogOptType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SysLogOptType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SysLogOptType c : SysLogOptType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SysLogOptType c : SysLogOptType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SysLogOptType c : SysLogOptType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 根据枚举type和key取得枚举显示值
     * 
     * @param enumType String
     * @param enumKey String
     * @return String
     */
    @SuppressWarnings("rawtypes")
    public static String getCommonEnumLabel(String enumType, String enumKey) {
        for (Class cls : CommonEnum.class.getClasses()) {
            String clsName = cls.getName();
            clsName = clsName.substring(clsName.lastIndexOf(FWConstants.INNER_CLASS_SEPARATOR) + 1);
            if (cls.isEnum() && StringUtils.isEqual(clsName, enumType)) {
                for (Object o : cls.getEnumConstants()) {
                    IEnum enumTmp = (IEnum) o;
                    if (StringUtils.isEqual(enumKey, enumTmp.getCode())) {
                        return enumTmp.getLabel();
                    }
                }
            }
        }
        return "";
    }

    /**
     * 根据枚举type和值取得枚举显示code
     * 
     * @param enumType String
     * @param enumLabel String
     * @return String
     */
    @SuppressWarnings("rawtypes")
    public static String getCommonEnumCode(String enumType, String enumLabel) {
        for (Class cls : CommonEnum.class.getClasses()) {
            String clsName = cls.getName();
            clsName = clsName.substring(clsName.lastIndexOf(FWConstants.INNER_CLASS_SEPARATOR) + 1);
            if (cls.isEnum() && StringUtils.isEqual(clsName, enumType)) {
                for (Object o : cls.getEnumConstants()) {
                    IEnum enumTmp = (IEnum) o;
                    if (StringUtils.isEqual(enumLabel, enumTmp.getLabel())) {
                        return enumTmp.getCode();
                    }
                }
            }
        }
        return "";
    }

    /**
     * 根据枚举type取得DropDownList
     * 
     * @param enumType String
     * @return String
     */
    @SuppressWarnings("rawtypes")
    public static List<DropDownDto> getCommonDropDownList(String enumType) {
        List<DropDownDto> resultList = new ArrayList<DropDownDto>();
        for (Class cls : CommonEnum.class.getClasses()) {
            String clsName = cls.getName();
            clsName = clsName.substring(clsName.lastIndexOf(FWConstants.INNER_CLASS_SEPARATOR) + 1);
            if (cls.isEnum() && StringUtils.isEqual(clsName, enumType)) {
                for (Object o : cls.getEnumConstants()) {
                    IEnum enumTmp = (IEnum) o;
                    DropDownDto dto = new DropDownDto();
                    dto.setId(enumTmp.getCode());
                    dto.setName(enumTmp.getLabel());
                    resultList.add(dto);
                }
                return resultList;
            }
            else {
                continue;
            }
        }
        return resultList;
    }

    /**
     * 验证码类型
     */
    public enum VerifyCodeType implements IEnum {

        /** 手机找回密码 */
        RETRIEVE("手机找回密码", "1"),
        /** 注册会员 */
        REGISTER("注册会员", "2"),
        /** 修改密码 */
        MODIFY("修改手机", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "VerifyCodeType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private VerifyCodeType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (VerifyCodeType c : VerifyCodeType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (VerifyCodeType c : VerifyCodeType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (VerifyCodeType c : VerifyCodeType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 收支类别
     */
    public enum FinancialType implements IEnum {

        /** 收入 */
        INCOME("收入", "1"),
        /** 支出 */
        PAY("支出", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "FinancialType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private FinancialType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (FinancialType c : FinancialType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (FinancialType c : FinancialType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (FinancialType c : FinancialType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否暂停
     */
    public enum IsPause implements IEnum {

        /** 正常 */
        NORMAL("正常", "0"),
        /** 暂停 */
        PAUSE("暂停", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsPause";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsPause(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsPause c : IsPause.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsPause c : IsPause.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsPause c : IsPause.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 行为区分
     */
    public enum ActionSign implements IEnum {

        /** 初次行为 */
        FIRST("初次行为", "1"),
        /** 每日初次行为 */
        FIRSTEVERYDAY("每日初次行为", "2"),
        /** 每日二次行为 */
        TWICEEVERYDAY("每日二次行为", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ActionSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ActionSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ActionSign c : ActionSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ActionSign c : ActionSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ActionSign c : ActionSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 行为ID
     */
    public enum ActionId implements IEnum {

        /** A01 */
        A01("A01", "A01"),
        /** A02 */
        A02("A02", "A02"),
        /** A03 */
        A03("A03", "A03"),
        /** A04 */
        A04("A04", "A04"),
        /** A05 */
        A05("A05", "A05"),
        /** A06 */
        A06("A06", "A06"),
        /** A07 */
        A07("A07", "A07"),
        /** A08 */
        A08("A08", "A08"),
        /** A10 */
        A10("A10", "A10"),
        /** A15 */
        A15("A15", "A15"),
        /** A19 */
        A19("A19", "A19"),
        /** A20 */
        A20("A20", "A20"),
        /** A0201 */
        A0201("A0201", "A0201"),
        /** A0301 */
        A0301("A0301", "A0301"),
        /** A0401 */
        A0401("A0401", "A0401"),
        /** A0402 */
        A0402("A0402", "A0402"),
        /** A1001 */
        A1001("A1001", "A1001"),
        /** A1002 */
        A1002("A1002", "A1002"),
        /** A1901 */
        A1901("A1901", "A1901");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ActionId";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ActionId(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ActionId c : ActionId.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ActionId c : ActionId.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ActionId c : ActionId.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 有效标识
     */
    public enum IsUsed implements IEnum {

        /** 可用 */
        USABLE("可用", "1"),
        /** 不可用 */
        DISABLE("不可用", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsUsed";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsUsed(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsUsed c : IsUsed.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsUsed c : IsUsed.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsUsed c : IsUsed.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 关联账户状态 0：正常关联，1：解除关联
     */
    public enum AccountBindStauts implements IEnum {

        /** 正常关联 */
        NORMAL("正常关联", "0"),
        /** 解除关联 */
        REMOVE("解除关联 ", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AccountBindStauts";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AccountBindStauts(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AccountBindStauts c : AccountBindStauts.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AccountBindStauts c : AccountBindStauts.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AccountBindStauts c : AccountBindStauts.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 关联账号类型 1：理财账号、2：交易账号
     */
    public enum AccountType implements IEnum {

        /** 收入 */
        FINANCING("理财账号", "1"),
        /** 理财 */
        DEAL("交易账号", "2"),
        /** 两者时 */
        ALLCOUNTTYPE("两者时", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AccountType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AccountType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AccountType c : AccountType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AccountType c : AccountType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AccountType c : AccountType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 协议类别 1：秀财用户注册协议
     */
    public enum ContractType implements IEnum {

        /** 秀财用户注册协议 */
        XIUCAI("秀财用户注册协议", "1"),
        /** 理财开户协议 */
        LICAI("理财开户协议", "2"),
        /** 秀财网用户注册协议 */
        XIUCAIWANG("秀财网用户注册协议", "11");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ContractType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ContractType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ContractType c : ContractType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ContractType c : ContractType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ContractType c : ContractType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 周期性类别
     */
    public enum CycleType implements IEnum {

        /** 月 */
        MONTH("月", "1"),
        /** 季度 */
        SEASON("季度", "2"),
        /** 年 */
        YEAR("年", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CycleType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CycleType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CycleType c : CycleType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CycleType c : CycleType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CycleType c : CycleType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 周期性更新方法
     */
    public enum CylUpSign implements IEnum {

        /** 保持原值 */
        KEEP("保持原值", "0"),

        /** 当前这一笔 */
        CURRENT("当前这一笔", "1"),

        /** 当前这一笔及以后所有 */
        CURRENTANDAFTERALL("当前这一笔及以后所有", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CylUpSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CylUpSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CylUpSign c : CylUpSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CylUpSign c : CylUpSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CylUpSign c : CylUpSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 开户状态
     */
    public enum Khzt implements IEnum {
        /** 身份验证OK */
        IDENTITY_TEST("身份验证OK", "1"),
        /** 理财账户开户OK */
        FINANCE_TEST("理财账户开户OK", "2"),
        /** 支付密码设置OK */
        PAYPASSWORD("支付密码设置OK", "3"),
        /** 银行卡信息本地登记OK */
        LANDBANKINFO("银行卡信息本地登记OK", "4"),
        /** 产品支付账户同步OK */
        PAYACCOUNT("产品支付账户同步OK", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Khzt";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Khzt(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Khzt c : Khzt.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Khzt c : Khzt.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Khzt c : Khzt.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 成就ID
     */
    public enum AcmId implements IEnum {

        C0010("秀财！秀财！", "C0010"), C0020("我有账号", "C0020"), C0030("不再迷糊", "C0030"), C0040("小小秀", "C0040"), C0050("这就是我",
                "C0050"), C0060("理财之路", "C0060"), C0070("交易账号", "C0070"), C0080("升级之路", "C0080"), C0090("君子爱财", "C0090"), C0100(
                "有盼头", "C0100"), C0110("我爱爆款", "C0110"), C0120("理财达人", "C0120"), C0130("理财神通", "C0130"), C0140("投资两千",
                "C0140"), C0150("投资五千", "C0150"), C0160("投资一万", "C0160"), C0170("投资二万", "C0170"), C0180("投资十万", "C0180"), C0190(
                "投资五十万", "C0190"), C0200("有理有据", "C0200"), C0210("常来看看", "C0210"), C0220("连续不断", "C0220"), C0230(
                "活跃一族", "C0230"), C0240("持之以恒50", "C0240"), C0250("持之以恒100", "C0250"), C0260("持之以恒200", "C0260"), C0270(
                "持之以恒300", "C0270"), C0280("养成好习惯", "C0280"), C0290("贵在坚持", "C0290"), C0300("我爱记账", "C0300"), C0310(
                "记账达人100", "C0310"), C0320("记账达人200", "C0320"), C0330("记账达人300", "C0330"), C0340("10次而已", "C0340"), C0350(
                "分享有我", "C0350"), C0360("我爱分享", "C0360"), C0370("分享帝100", "C0370"), C0380("分享帝200", "C0380"), C0390(
                "分享帝300", "C0390"), C0400("一个不剩", "C0400"), C0410("接二连三", "C0410"), C0420("天天向上", "C0420"), C0430(
                "任务达人", "C0430"), C0440("兢兢业业", "C0440"), C0450("新的突破", "C0450"), C0460("学而不厌", "C0460"), C0470("分析专家",
                "C0470"), C0480("读万卷书", "C0480"), C0490("先知", "C0490"), C0500("先知100", "C0500"), C0510("先知200", "C0510"), C0520(
                "先知300", "C0520"), C0530("初出茅庐", "C0530"), C0540("小试身手", "C0540"), C0550("大展拳脚", "C0550"), C0560(
                "我爱投资", "C0560"), C0570("101次", "C0570"), C0580("我也能行", "C0580"), C0590("我有内幕", "C0590"), C0600("尝到甜头",
                "C0600"), C0610("前景可观", "C0610"), C0620("红红火火", "C0620"), C0630("这不是梦", "C0630"), C0640("轻而易举5",
                "C0640"), C0650("轻而易举10", "C0650"), C0660("发财的节奏5", "C0660"), C0670("发财的节奏10", "C0670"), C0680("一生一世",
                "C0680"), C0690("步步高升", "C0690"), C0700("谨慎为王", "C0700"), C0710("我就是二", "C0710"), C0720("有钱就任性",
                "C0720"), C0730("小玩怡情", "C0730"), C0750("股神", "C0750"), C0760("基神", "C0760"), C0770("见好就收", "C0770"), C0740(
                "我是土豪", "C0740"), C0780("末班车", "C0780"), C0790("割就割", "C0790"), C0800("抄底咯", "C0800"), C0810("涨上天",
                "C0810"), C0820("1%！", "C0820"), C0830("2%！", "C0830"), C0840("3%！", "C0840"), C0850("4%！", "C0850"), C0860(
                "5%！", "C0860"), C0870("6%！", "C0870"), C0880("7%！", "C0880"), C0890("8%！", "C0890"), C0900("9%！",
                "C0900"), C0910("10%！", "C0910"), C0920("11%！", "C0920"), C0930("12%！", "C0930"), C0940("13%！", "C0940"), C0950(
                "14%！", "C0950"), C0960("15%！", "C0960"), C0970("16%！", "C0970"), C0980("17%！", "C0980"), C0990("18%！",
                "C0990"), C1000("19%！", "C1000"), C1010("20%！", "C1010"), C1020("在秀财过生日", "C1020"), C1030("财色兼收",
                "C1030"), C1040("值得投资", "C1040"), C1050("不怕失败", "C1050"), C1060("屡败屡战", "C1060"), C1070("我不会放弃",
                "C1070"), C1080("谁有我惨", "C1080"), C1090("亏，不怕", "C1090"), C1100("不怕亏", "C1100"), C1110("有输有赢", "C1110"), C1120(
                "忍痛割爱", "C1120"), C1130("脱离苦海", "C1130"), C1140("真惨", "C1140"), C1150("谁来抱抱我", "C1150"), C1160("没法过了",
                "C1160"), C1170("没天理啊", "C1170"), C1180("求温暖", "C1180"), C1190("求施舍", "C1190"), C1200("新年的期待", "C1200");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AcmId";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AcmId(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AcmId c : AcmId.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AcmId c : AcmId.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AcmId c : AcmId.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 成就类型
     */
    public enum AcmpType implements IEnum {

        FIRST("我的初次", "1"), HOLD("坚持不懈", "2"), FINAL("终极玩家", "3"), HIDE("隐藏", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AcmpType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AcmpType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AcmpType c : AcmpType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AcmpType c : AcmpType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AcmpType c : AcmpType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 分类id
     */
    public enum ChannelId implements IEnum {

        /** 帮助指引 */
        GUIDE("帮助指引", "2"),
        /** 理财入学宝典 */
        BIBLE("理财入学宝典 ", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ChannelId";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ChannelId(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ChannelId c : ChannelId.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ChannelId c : ChannelId.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ChannelId c : ChannelId.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 商品状态
     */
    public enum CommodityStatus implements IEnum {

        /** 未上架 */
        NOTPUTAWAY("未上架", "1"),
        /** 已上架 */
        SHELVE("已上架", "2"),
        /** 已暂停 */
        PAUSE("已暂停 ", "3"),
        /** 已下架 */
        UNSHELVE("已下架", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CommodityStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CommodityStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CommodityStatus c : CommodityStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CommodityStatus c : CommodityStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CommodityStatus c : CommodityStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 商品兑换状态
     */
    public enum CommodityExchangeStatus implements IEnum {

        /** 未使用 */
        UNUSED("未使用", "0"),
        /** 已使用 */
        USED("已使用", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CommodityExchangeStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CommodityExchangeStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CommodityExchangeStatus c : CommodityExchangeStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CommodityExchangeStatus c : CommodityExchangeStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CommodityExchangeStatus c : CommodityExchangeStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 设置小类型
     */
    public enum SmallType implements IEnum {

        /** 新手赠送 */
        PRESENT("新手赠送", "101"),
        /** 新手专享 */
        EXCLUSIVE("新手专享", "102"),
        /** 爆款 */
        EXPLOSION("爆款", "103");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SmallType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SmallType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SmallType c : SmallType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SmallType c : SmallType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SmallType c : SmallType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 当日积分领取情况
     */
    public enum PointsIsGet implements IEnum {

        /** 已领取 */
        GET("已领取", "1"),
        /** 未领取 */
        NOTGET("未领取", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointsIsGet";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointsIsGet(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointsIsGet c : PointsIsGet.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointsIsGet c : PointsIsGet.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointsIsGet c : PointsIsGet.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 成就组ID
     */
    public enum AcmpGroupId implements IEnum {

        GROUP10("秀财！秀财！", "10"), GROUP20("我有账号", "20"), GROUP30("不再迷糊", "30"), GROUP40("小小秀", "40"), GROUP50("这就是我",
                "50"), GROUP60("理财之路", "60"), GROUP70("交易账号", "70"), GROUP80("升级之路", "80"), GROUP90("君子爱财", "90"), GROUP100(
                "有盼头", "100"), GROUP110("我爱爆款", "110"), GROUP120("收益不是梦", "120"), GROUP130("看我的投资", "130"), GROUP140(
                "有理有据", "140"), GROUP150("活跃一族", "150"), GROUP160("持之以恒", "160"), GROUP170("养成好习惯", "170"), GROUP180(
                "贵在坚持", "180"), GROUP190("分享有我", "190"), GROUP200("一个不剩", "200"), GROUP210("任务天天做", "210"), GROUP220(
                "兢兢业业", "220"), GROUP230("学而不厌", "230"), GROUP240("我爱投资", "240"), GROUP250("前景可观", "250"), GROUP260(
                "投资有道", "260"), GROUP270("发财的节奏", "270"), GROUP280("一生一世", "280"), GROUP290("我就是二", "290"), GROUP300(
                "有钱就任性", "300"), GROUP310("小玩怡情", "310"), GROUP320("我是土豪", "320"), GROUP330("股神", "330"), GROUP340(
                "基神", "340"), GROUP350("见好就收", "350"), GROUP360("末班车", "360"), GROUP370("割就割", "370"), GROUP380("抄底咯",
                "380"), GROUP390("在秀财过生日", "390"), GROUP400("财色兼收", "400"), GROUP410("值得投资", "410"), GROUP420("我不会放弃",
                "420"), GROUP430("你我皆凡人", "430"), GROUP440("新年的期待", "440");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AcmpGroupId";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AcmpGroupId(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AcmpGroupId c : AcmpGroupId.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AcmpGroupId c : AcmpGroupId.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AcmpGroupId c : AcmpGroupId.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 商品类型
     */
    public enum CommodityType implements IEnum {

        /** 电子抵用券 */
        VOUCHERS("电子抵用券", "0"),
        /** 实物商品 */
        ENTITY("实物商品", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CommodityType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CommodityType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CommodityType c : CommodityType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CommodityType c : CommodityType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CommodityType c : CommodityType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 组标识
     */
    public enum GroupSign implements IEnum {

        /** 电子抵用券 */
        IN("属于组", "1"),
        /** 实物商品 */
        OUT("不属于组", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "GroupSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private GroupSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (GroupSign c : GroupSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (GroupSign c : GroupSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (GroupSign c : GroupSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息类型
     */
    public enum MsgType implements IEnum {

        /** 会员注册短信 */
        REGISTER("会员注册短信", "1"),
        /** 找回密码短信 */
        PASSWORD("找回密码短信", "2"),
        /** 预约提醒 */
        WARN("预约提醒", "3"),
        /** 批处理执行失败 */
        BATCH("批处理执行失败", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MsgType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MsgType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MsgType c : MsgType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MsgType c : MsgType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MsgType c : MsgType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 证件类型
     */
    public enum CardType implements IEnum {

        /** 身份证 */
        IDCARD("身份证", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CardType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CardType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CardType c : CardType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CardType c : CardType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CardType c : CardType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 特色秀ID
     */
    public enum ShowId implements IEnum {

        /** 穿越纪念。获得发财利器“秀财”。 */
        S010("穿越纪念。获得发财利器“秀财”。", "S010"),
        /** 我的可用资金超出了我的投资资金。 */
        S020("我的可用资金超出了我的投资资金。", "S020"),
        /** 我的投资资金超出了我的可用资金。 */
        S030("我的投资资金超出了我的可用资金。", "S030"),
        /** 热推产品展示。 */
        S040("热推产品展示。", "S040"),
        /** 投入股市能让我仅有的才华得以绽放，所以我果断出手了 */
        S050("投入股市能让我仅有的才华得以绽放，所以我果断出手了。", "S050"),
        /** 稳定且客观的收益才是王道，基金是我的不二之选。 */
        S060("稳定且客观的收益才是王道，基金是我的不二之选。", "S060"),
        /** 最近30天内进行过2次牛币兑换。 */
        S070("最近30天内进行过2次牛币兑换。", "S070"),
        /** 最近3天内看了5篇文章。 */
        S080("最近3天内看了5篇文章。", "S080"),
        /** 最近3天内记过1次账。 */
        S090("最近3天内记过1次账。", "S090"),
        /** 最近7天内攒够800牛币。 */
        S100("最近7天内攒够800牛币。", "S100");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ShowId";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ShowId(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ShowId c : ShowId.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ShowId c : ShowId.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ShowId c : ShowId.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 广告版位
     */
    public enum Adspace implements IEnum {

        /** 知财首页 */
        ZHICAI("知财首页", "1"),
        /** 理财首页 */
        FINANCIAL("理财首页", "3"),
        /** 插屏广告 */
        TABLESCREEN("插屏广告", "5"),
        /** 插屏广告 */
        BOOTPAGE("启动页广告位", "6");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Adspace";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Adspace(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Adspace c : Adspace.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Adspace c : Adspace.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Adspace c : Adspace.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 广告打开方式
     */
    public enum HasWindow implements IEnum {
        /** 1：外部浏览器 */
        OUTURL("外部浏览器", "1"),
        /** 2：内部浏览器 */
        INURL("内部浏览器", "2"),
        /** 3：内部原生页 */
        INPAGE("内部原生页", "3"),
        /** 4：url地址 */
        URLADDRESS("url地址", "4"),
        /** 5：自主编辑 */
        EDITBYMY("自主编辑", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "HasWindow";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private HasWindow(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (HasWindow c : HasWindow.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (HasWindow c : HasWindow.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (HasWindow c : HasWindow.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 视频打开方式
     */
    public enum OpenVideo implements IEnum {
        /** 1：url地址 */
        URLADDR("url地址", "1"),
        /** 2：自主编辑 */
        EDITBYMYSELF("自主编辑", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "OpenVideo";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private OpenVideo(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (OpenVideo c : OpenVideo.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (OpenVideo c : OpenVideo.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (OpenVideo c : OpenVideo.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 提醒方式
     */
    public enum WarnWay implements IEnum {
        /** 站内闹钟 */
        CLOCK("站内闹钟", "1"),
        /** 短信提醒 */
        NOTE("短信提醒", "2"),
        /** 两者都勾 */
        ALL("两者都勾", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "WarnWay";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private WarnWay(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (WarnWay c : WarnWay.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (WarnWay c : WarnWay.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (WarnWay c : WarnWay.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 申报结果
     */
    public enum DeclareStatus implements IEnum {
        /** 未申报 */
        UNDECLARED("未申报", "0"),
        /** 申报中 */
        INUNDECLARE("申报中", "1"),
        /** 已申报 */
        DECLARED("已申报", "2"),
        /** 非法委托 */
        ILLEGALCOMMISSION("非法委托", "3"),
        /** 撤单失败 */
        BADCANCEL("撤单失败", "4"),
        /** 部分成交 */
        PARTOFTRADED("部分成交", "5"),
        /** 全部成交 */
        TRADED("全部成交", "6"),
        /** 部分撤单 */
        PARTOFCANCELLED("部分撤单", "7"),
        /** 全部撤单 */
        CANCELLED("全部撤单", "8"),
        /** 已撤 */
        CANCELLED2("已撤销", "-1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "DeclareStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private DeclareStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (DeclareStatus c : DeclareStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (DeclareStatus c : DeclareStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (DeclareStatus c : DeclareStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 委托状态(理财)
     */
    public enum EntrustStatus implements IEnum {

        UNDECLARED("未报", "0"), READYDECLARED("待报", "1"), DECLARED("已报", "2"), DECLAREDREADYWITHDRAW("已报待撤", "3"), PARTSUCCESSREADYWITHDRAW(
                "部成待撤", "4"), PARTWITHDRAW("部撤", "5"), WITHDRAW("已撤", "6"), PARTSUCCESS("部成", "7"), SUCCESS("已成", "8"), WASTEORDER(
                "废单", "9"), NOWDECLARED("正报", "10"), CANCEL("撤废", "11"), DEALEX("单腿成交", "12"), CONFIRMCANCEL("已确认待撤",
                "13"), CONFIRM("已确认", "14"), READYCONFIRM("待确认", "15"), PREPAREDEAL("预成交", "16"), BACKCONFIRM("购回待确认",
                "17"), BACK("已购回", "18");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "EntrustStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private EntrustStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (EntrustStatus c : EntrustStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (EntrustStatus c : EntrustStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (EntrustStatus c : EntrustStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 委托状态(理财)
     */
    public enum TradeSign implements IEnum {
        /** 认购申请 */
        SUBSCRIBE1("1", "44020"),
        /** 认购确认 */
        SUBSCRIBE2("1", "44120"),
        /** 申购申请 */
        APPLY1("1", "44022"),
        /** 申购确认 */
        APPLY2("1", "44122"),
        /** 赎回申请 */
        SELL1("2", "44024"),
        /** 赎回确认 */
        SELL2("2", "44124");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TradeSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TradeSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TradeSign c : TradeSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TradeSign c : TradeSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TradeSign c : TradeSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 兑换牛币msg
     */
    public enum VerifyCommodity implements IEnum {
        /** 剩余牛币不足 */
        LACK("剩余牛币不足", "2"),
        /** 兑换次数已达上限 */
        LIMIT("兑换次数已达上限", "3"),
        /** 兑换活动已经结束 */
        OVER("兑换活动已经结束", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "VerifyCommodity";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private VerifyCommodity(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (VerifyCommodity c : VerifyCommodity.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (VerifyCommodity c : VerifyCommodity.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (VerifyCommodity c : VerifyCommodity.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 销售渠道
     */
    public enum SalesChannels implements IEnum {
        /** 0:不显示 */
        BLANK("不显示", "0"),
        /** 1：秀财APP */
        XIUCAIAPP("秀财APP", "1"),
        /** 2：秀财网 */
        XIUCAIWEB("秀财网", "2");
        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SalesChannels";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SalesChannels(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SalesChannels c : SalesChannels.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SalesChannels c : SalesChannels.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SalesChannels c : SalesChannels.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 处理类别
     */
    public enum DealType implements IEnum {
        /** 0：未解决 */
        NOSOULTION("未解决", "0"),
        /** 1：已解决 */
        SOULTION("已解决", "1"),
        /** 9：拒绝 */
        REFUSE("拒绝", "9");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "DealType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private DealType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (DealType c : DealType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (DealType c : DealType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (DealType c : DealType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否最新版本
     */
    public enum IsLatest implements IEnum {
        /** 1：是 */
        YES("是", "1"),
        /** 0:不是 */
        NO("不是", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsLatest";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsLatest(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsLatest c : IsLatest.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsLatest c : IsLatest.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsLatest c : IsLatest.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否强制更新
     */
    public enum IsMustUpdate implements IEnum {
        /** 1：是 */
        YES("是", "1"),
        /** 0:不是 */
        NO("不是", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsMustUpdate";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsMustUpdate(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsMustUpdate c : IsMustUpdate.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsMustUpdate c : IsMustUpdate.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsMustUpdate c : IsMustUpdate.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 登录类型
     */
    public enum LoginType implements IEnum {
        /** 1:注册登录 */
        REGISTERLOGIN("注册登录", "1"),
        /** 2:会员登录 */
        MEMBERLOGIN("会员登录", "2"),
        /** 9:游客登陆 */
        VISITORSLOGIN("游客登陆", "9");
        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "LoginType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private LoginType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (LoginType c : LoginType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (LoginType c : LoginType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (LoginType c : LoginType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 修改标识
     */
    public enum XGBS implements IEnum {
        /** 0：未修改 */
        NO("未修改", "0"),
        /** 1：已修改 */
        YES("修改", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "XGBS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private XGBS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (XGBS c : XGBS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (XGBS c : XGBS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (XGBS c : XGBS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 内部产品标识
     */
    public enum SJBZ implements IEnum {
        /** 1：登记未完成 */
        UNFINISH("登记未完成", "1"),
        /** 2.：产品已登记 */
        REGISTER("产品已登记", "2"),
        /** 3. 未提交审批 */
        UNAPPROVAL("未提交审批", "3"),
        /** 4.入库审批中 */
        APPROVALING("入库审批中", "4"),
        /** 5.入库审批通过 */
        APPROVALOVER("入库审批通过", "5"),
        /** 6.产品已入库 */
        PUTSTORAGE("产品已入库", "6"),
        /** 7.上架审批中 */
        PUTAWAYING("上架审批中", "7"),
        /** 8.产品已上架 */
        PUTAWAYFINISH("产品已上架", "8"),
        /** 9.产品已下架 */
        UNPUTAWAYFINISH("产品已下架", "9");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SJBZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SJBZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SJBZ c : SJBZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SJBZ c : SJBZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SJBZ c : SJBZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品风险等级
     */
    public enum FXJB implements IEnum {
        /** 1：低风险-低 */
        LOWRISKLOW("低风险-低", "1"),
        /** 2;低风险-中 */
        LOWRISKMID("低风险-中", "2"),
        /** 3;低风险-高 */
        LOWRISKHIG("低风险-高", "3"),
        /** 4;中风险-低 */
        MIDRISKLOW("中风险-低", "4"),
        /** 5;中风险-中 */
        MIDRISKMID("中风险-中", "5"),
        /** 6;高风险-低 */
        HIGRISKLOW("高风险-低", "6"),
        /** 7;高风险-中低 */
        HIGRISKMIDLOW("高风险-中低", "7"),
        /** 8;高风险-中 */
        HIGRISKMID("高风险-中", "8"),
        /** 9;高风险-中高 */
        HIGRISKMIDHIG("高风险-中高", "9"),
        /** 10;高风险-高 */
        HIGRISKHIG("高风险-高", "10");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "FXJB";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private FXJB(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (FXJB c : FXJB.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (FXJB c : FXJB.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (FXJB c : FXJB.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 销售市场
     */
    public enum JYS implements IEnum {
        /** 0：内部 */
        INNER("内部", "0"),
        /** 1;沪市 */
        HUSHI("沪市", "1"),
        /** 2;深市 */
        SHENSHI("深市", "2"),
        /** 3;银行 */
        BANK("银行", "3"),
        /** 4;协会 */
        XIEHUI("协会", "4"),
        /** 5;中登 */
        ZHONGDENG("中登", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "JYS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private JYS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (JYS c : JYS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (JYS c : JYS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (JYS c : JYS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 投资品种
     */
    public enum TZPZ implements IEnum {
        /** 1：股票、混合型基金、偏股型基金、股票型基金等权益类投资品种 */
        GUPIAO("股票、混合型基金、偏股型基金、股票型基金等权益类投资品种", "1"),
        /** 2;债券、货币市场基金、债券基金等固定收益类投资品种 */
        ZHAIQUAN("债券、货币市场基金、债券基金等固定收益类投资品种", "2"),
        /** 4;期货、融资融券 */
        QIHUO("期货、融资融券", "4"),
        /** 8;复杂金融产品 */
        JIRONG("复杂金融产品", "8"),
        /** 16;其他产品 */
        OTHER("其他产品", "16");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TZPZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TZPZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TZPZ c : TZPZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TZPZ c : TZPZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TZPZ c : TZPZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 收益类型
     */
    public enum SYLX implements IEnum {
        /** 1：非保本浮动收益 */
        UNFUDOONG("非保本浮动收益", "1"),
        /** 2;保本浮动收益 */
        FUDOONG("保本浮动收益", "2"),
        /** 3;保本保底收益 */
        BAODI("保本保底收益", "3"),
        /** 4;保本固定收益 */
        GUDING("保本固定收益", "4"),
        /** 5;非保本固定收益 */
        UNGUDING("非保本固定收益", "5"),
        /** 6;其他 */
        OTHER("其他", "6");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SYLX";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SYLX(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SYLX c : SYLX.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SYLX c : SYLX.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SYLX c : SYLX.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品阶段
     */
    public enum CPZT implements IEnum {
        /* *//** 1：预热期 */
        /*
         * YURE("预热期", "1"),
         *//** 2;预售期 */
        /*
         * YUSHOU("预售期", "2"),
         *//** 3;募集期 */
        /*
         * MOJI("募集期", "3"),
         *//** 4;存续期 */
        /*
         * CUNXU("存续期", "4"),
         *//** 5;清盘期 */
        /*
         * CLEAN("清盘期", "5"),
         *//** 6;结束期 */
        /*
         * OVER("结束期", "6"),
         *//** 7;封闭期 */
        /*
         * FENGBI("封闭期", "7");
         */

        ZHONGZHI("终止", "-1"),

        YUSHOU("预售期", "0"),

        RENGOU("认购期", "1"),

        KAIFANG("开放期", "2"),

        FENBI("封闭期", "3"),

        OVER("结束", "4"),

        SHOP("在售", "10"),

        STOPSHOP("停售", "11");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CPZT";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CPZT(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CPZT c : CPZT.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CPZT c : CPZT.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CPZT c : CPZT.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 交易状态
     */
    public enum JYZT implements IEnum {
        /** -1：终止 */
        ZHONGZHI("终止", "-1"),
        /** 0;预售 */
        YUSHOU("预售", "0"),
        /** 1;认购 */
        RENGOU("认购", "1"),
        /** 2;可申赎 */
        SHENSHU("可申赎", "2"),
        /** 3;封闭 */
        FENBI("封闭", "3"),
        /** 4;结束 */
        OVER("结束", "4"),
        /** 5;停止申购 */
        STOPSHENGOU("停止申购", "5"),
        /** 6;停止赎回 */
        STOPSHUHUI("停止赎回", "6"),
        /** 10;在售 */
        SHOP("在售", "10"),
        /** 11;停售 */
        STOPSHOP("停售", "11");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "JYZT";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private JYZT(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (JYZT c : JYZT.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (JYZT c : JYZT.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (JYZT c : JYZT.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 签约方式
     */
    public enum QYFS implements IEnum {
        /** 0：无需合同 */
        NO("无需合同", "0"),
        /** 1;电子合同 */
        ELECTRON("电子合同", "1"),
        /** 2;纸质合同 */
        PAPER("纸质合同", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "QYFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private QYFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (QYFS c : QYFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (QYFS c : QYFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (QYFS c : QYFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 允许交易通道
     */
    public enum WTFS implements IEnum {
        /** 1：电话委托 */
        TELEPHONE("电话委托", "1"),
        /** 2;刷卡委托 */
        SHUAKA("刷卡委托", "2"),
        /** 4;热键委托 */
        REJIAN("热键委托", "4"),
        /** 8;柜台委托 */
        GUITAI("柜台委托", "8"),
        /** 16;远程委托 */
        YUANCHEGN("远程委托", "16"),
        /** 32;网上交易 */
        WEB("网上交易", "32"),
        /** 64;手机交易 */
        PHONEJIAO("手机交易", "64"),
        /** 128;恒生委托 */
        HENSHENG("恒生委托", "128"),
        /** 256;电话内线 */
        NEIXIAN("电话内线", "256"),
        /** 512;其他自助 */
        ZIZHU("其他自助", "512"),
        /** 1024;其他外围 */
        WAIWEI("其他外围", "1024"),
        /** 2048;备用 */
        BEIYONG("备用", "2048"),
        /** 4096;ETF委托 */
        ETF("ETF委托", "4096"),
        /** 8192;网站交易 */
        WEBJIAO("网站交易", "8192"),
        /** 16384;量化交易 */
        LIANGHUA("量化交易", "16384"),
        /** 32768;网上商城 */
        ECSHOP("网上商城", "32768");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "WTFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private WTFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (WTFS c : WTFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (WTFS c : WTFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (WTFS c : WTFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 资金投向
     */
    public enum ZJYT implements IEnum {
        /** 0：其他 */
        OTHER("其他", "0"),
        /** 1;股票基金 */
        GUPIAO("股票基金", "1"),
        /** 2;债券 */
        ZHAIQUAN("债券", "2"),
        /** 3;商贸流通 */
        SHANGHUO("商贸流通", "3"),
        /** 4;农林牧渔 */
        NONGLIN("农林牧渔", "4"),
        /** 5;能源 */
        RESOURCE("能源", "5"),
        /** 6;旅游餐饮 */
        LVYOU("旅游餐饮", "6"),
        /** 7;科教文卫 */
        KEJIAO("科教文卫", "7"),
        /** 8;金融 */
        JINRONG("金融", "8"),
        /** 9;交通运输; */
        TRAFFIC("交通运输", "9"),
        /** 10;基础设施 */
        JICHU("基础设施", "10"),
        /** 11;工商企业 */
        GONGSHANG("工商企业", "11"),
        /** 12;工矿企业 */
        GONGKUANG("工矿企业", "12"),
        /** 13;房地产 */
        FANGDICAHGN("房地产", "13");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ZJYT";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ZJYT(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ZJYT c : ZJYT.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ZJYT c : ZJYT.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ZJYT c : ZJYT.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 分红方式
     */
    public enum FHFS implements IEnum {
        /** 1：红利转投 */
        HONGLI("红利转投", "1"),
        /** 2;现金分红 */
        CASH("现金分红", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "FHFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private FHFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (FHFS c : FHFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (FHFS c : FHFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (FHFS c : FHFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否逐笔签约
     */
    public enum CLFS implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2;是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CLFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CLFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CLFS c : CLFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CLFS c : CLFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CLFS c : CLFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 转让方式
     */
    public enum ZRFS implements IEnum {
        /** 1：协议方式 */
        XIEYI("协议方式", "1"),
        /** 2;报价方式 */
        BAOJIA("报价方式", "2"),
        /** 4;做市方式 */
        ZUOSHI("做市方式", "4"),
        /** 8;拍卖方式 */
        PAIMAI("拍卖方式", "8"),
        /** 16;标购方式 */
        BIAOGOU("标购方式", "16"),
        /** 32;分段竞价 */
        FENDUAN("分段竞价", "32");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ZRFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ZRFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ZRFS c : ZRFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ZRFS c : ZRFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ZRFS c : ZRFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 承销关系
     */
    public enum LX implements IEnum {
        /** 1：直销 */
        DIRECT("直销", "1"),
        /** 2;代销 */
        REPLACE("代销", "2"),
        /** 3;居间 */
        MID("居间", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "LX";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private LX(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (LX c : LX.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (LX c : LX.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (LX c : LX.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否需要专业知识评测
     */
    public enum PCKZ implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2;是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PCKZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PCKZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PCKZ c : PCKZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PCKZ c : PCKZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PCKZ c : PCKZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 买卖限制
     */
    public enum MMXZ implements IEnum {
        /** 5：禁止个人买入 */
        PERSON("禁止个人买入", "5"),
        /** 6;禁止机构买入 */
        ORANIZATION("禁止机构买入", "6");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MMXZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MMXZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MMXZ c : MMXZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MMXZ c : MMXZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MMXZ c : MMXZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 新产品
     */
    public enum SFXCP implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2;是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SFXCP";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SFXCP(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SFXCP c : SFXCP.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SFXCP c : SFXCP.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SFXCP c : SFXCP.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否允许多次购
     */
    public enum SFYXDCGM implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2;是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SFYXDCGM";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SFYXDCGM(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SFYXDCGM c : SFYXDCGM.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SFYXDCGM c : SFYXDCGM.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SFYXDCGM c : SFYXDCGM.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否允许多次预约
     */
    public enum SFYXDCYY implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2;是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SFYXDCYY";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SFYXDCYY(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SFYXDCYY c : SFYXDCYY.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SFYXDCYY c : SFYXDCYY.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SFYXDCYY c : SFYXDCYY.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 撤单控制
     */
    public enum CDKZ implements IEnum {
        /** 1：仅允许当日撤单 */
        PROMITTODAY("仅允许当日撤单", "1"),
        /** 2;禁止当日撤单 */
        FORBIDTODAY("禁止当日撤单", "2"),
        /** 3;允许撤单 */
        PROMIT("允许撤单", "3"),
        /** 4;禁止撤单 */
        FORBID("禁止撤单", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CDKZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CDKZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CDKZ c : CDKZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CDKZ c : CDKZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CDKZ c : CDKZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 超风险禁止委托
     */
    public enum FXBPPXZ implements IEnum {
        /** 0：允许购买 */
        PROMIT("允许购买", "0"),
        /** 1;禁止购买 */
        FORBID("禁止购买", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "FXBPPXZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private FXBPPXZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (FXBPPXZ c : FXBPPXZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (FXBPPXZ c : FXBPPXZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (FXBPPXZ c : FXBPPXZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 允许持仓外围展示
     */
    public enum CCWWZS implements IEnum {
        /** 1：否 */
        NO("否", "1"),
        /** 2:是 */
        YES("是", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CCWWZS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CCWWZS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CCWWZS c : CCWWZS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CCWWZS c : CCWWZS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CCWWZS c : CCWWZS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 支付方式
     */
    public enum ZFFS implements IEnum {
        /** 1：保证金 */
        ENSURE("保证金", "1"),
        /** 2:银行转账 */
        BANK("银行转账", "2"),
        /** 4:理财资金 */
        FINANCIAL("理财资金", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ZFFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ZFFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ZFFS c : ZFFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ZFFS c : ZFFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ZFFS c : ZFFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 收费方式
     */
    public enum SFFS implements IEnum {
        /** 1：前端收费 */
        BEFORE("前端收费", "1"),
        /** 2:后端收费 */
        AFTER("后端收费", "2"),
        /** 3:前后端收费 */
        BEFOREAFTER("前后端收费", "3"),
        /** 4:C类收费 */
        CTYPE("C类收费", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SFFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SFFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SFFS c : SFFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SFFS c : SFFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SFFS c : SFFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否货币基金
     */
    public enum SFHBJJ implements IEnum {
        /** 0|否 */
        NO("否", "0"),
        /** 1|是 */
        YES("是", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SFHBJJ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SFHBJJ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SFHBJJ c : SFHBJJ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SFHBJJ c : SFHBJJ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SFHBJJ c : SFHBJJ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 运作方式
     */
    public enum YZFS implements IEnum {
        /** 1|开放式 */
        OPEN("开放式", "1"),
        /** 2|封闭式 */
        CLOSE("封闭式", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "YZFS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private YZFS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (YZFS c : YZFS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (YZFS c : YZFS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (YZFS c : YZFS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 推荐热度
     */
    public enum TJRD implements IEnum {
        // 201 热 202 抢 203 爆
        /** 201 热 */
        HOT("热", "201"),
        /** 202 抢 */
        CAPTURE("抢", "202");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TJRD";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TJRD(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TJRD c : TJRD.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TJRD c : TJRD.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TJRD c : TJRD.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 销售状态
     */
    public enum SaleStatus implements IEnum {
        // 0|已下架 1|已发布
        /** 0|已下架 */
        UNRELEASE("已下架", "0"),
        /** 1|已发布 */
        RELEASE("已发布", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SaleStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SaleStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SaleStatus c : SaleStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SaleStatus c : SaleStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SaleStatus c : SaleStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * batch 状态
     */
    public enum BatchStatus implements IEnum {
        // "":未执行;0：失败；1：成功
        /** ""：未执行 */
        NOTIMPL("未执行", ""),
        /** 0：失败 */
        ERROR("失败", "0"),
        /** 1：成功 */
        SUCCESS("成功", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "BatchStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private BatchStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (BatchStatus c : BatchStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (BatchStatus c : BatchStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (BatchStatus c : BatchStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否显示
     */
    public enum IsDisplay implements IEnum {
        /** 1：显示 */
        YES("显示", "1"),
        /** 0：不显示 */
        NO("不显示", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsDisplay";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsDisplay(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsDisplay c : IsDisplay.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsDisplay c : IsDisplay.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsDisplay c : IsDisplay.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 基金类型
     */
    public enum JJLX implements IEnum {
        /** 1|股票型 */
        JJLX1("股票型", "1"),
        /** 2|混合型 */
        JJLX2("混合型", "2"),
        /** 3|债券型 */
        JJLX3("债券型", "3"),
        /** 4|货币型 */
        JJLX4("货币型", "4"),
        /** 5|指数型 */
        JJLX5("指数型", "5"),
        /** 6|LOF */
        JJLX6("LOF", "6"),
        /** 7|QDII */
        JJLX7("QDII", "7"),
        /** 8|保本型 */
        JJLX8("保本型", "8"),
        /** 9|集合计划 */
        JJLX9("集合计划", "9"),
        /** 99|其它 */
        JJLX99("其它", "99");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "JJLX";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private JJLX(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (JJLX c : JJLX.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (JJLX c : JJLX.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (JJLX c : JJLX.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否有效
     */
    public enum IsValid implements IEnum {

        /** 0：停止 */
        STOP("停止", "0"),
        /** 1：正常 */
        NORMAL("正常", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsValid";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsValid(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsValid c : IsValid.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsValid c : IsValid.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsValid c : IsValid.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 投顾类别
     */
    public enum AdviserType implements IEnum {

        /** 1:金牌投顾 */
        GOLDADVISER("金牌投顾", "1"),
        /** 2：银牌投顾 */
        SILVERADVISER("银牌投顾", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AdviserType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AdviserType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AdviserType c : AdviserType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AdviserType c : AdviserType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AdviserType c : AdviserType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 组合标签
     */
    public enum PortfolioSign implements IEnum {

        /** 1:稳健 */
        STEADY("稳健", "1"),

        /** 2：成长 */
        GROWUP("成长", "2"),

        /** 3：平衡 */
        BALANCE("平衡", "3"),

        /** 4：价值投资 */
        JZTZ("价值投资", "4"),

        /** 5：主题投资 */
        ZTTZ("主题投资", "5"),

        /** 6：国企改革 */
        GQGG("国企改革", "6"),

        /** 7：事件驱动 */
        EVENT("事件驱动", "7"),

        /** 8：量化分析 */
        LHFX("量化分析", "8"),

        /** 9：混合策略 */
        HHCL("混合策略", "9"),

        /** 10：国防军工 */
        GFJG("国防军工", "10"),

        /** 11：消费 */
        CONSUME("消费", "11"),

        /** 12：基础建设 */
        BASEBUILD("基础建设", "12"),

        /** 13：互联网+ */
        INTERNET("互联网+", "13"),

        /** 14：节能环保 */
        JNHB("节能环保", "14"),

        /** 15：医疗改革 */
        YLGG("医疗改革", "15"),

        /** 16：工业4.0 */
        INDUSTRY("工业4.0", "16"),

        /** 17：能源 */
        ENERGY("能源", "17"),

        /** 18：航运 */
        SHIP("航运", "18"),

        /** 19：文化传媒 */
        WHCM("文化传媒", "19"),

        /** 20：大金融 */
        BIGFINANCE("大金融", "20");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PortfolioSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PortfolioSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PortfolioSign c : PortfolioSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PortfolioSign c : PortfolioSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PortfolioSign c : PortfolioSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 交易日标识
     */
    public enum JYRBS implements IEnum {

        /** 0:正常交易交收日 */
        NORMALDEALDELIVERY("正常交易交收日", "0"),
        /** 1:非交易日 */
        NONDEAL("非交易日", "1"),
        /** 2:非交收日 */
        NONDELIVERY("非交收日 ", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "JYRBS";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private JYRBS(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (JYRBS c : JYRBS.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (JYRBS c : JYRBS.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (JYRBS c : JYRBS.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否交易日
     */
    public enum IsMarketDay implements IEnum {

        /** 0：非交易日 */
        NON("非交易日", "0"),
        /** 1：交易日 */
        NORMAL("交易日", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsMarketDay";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsMarketDay(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsMarketDay c : IsMarketDay.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsMarketDay c : IsMarketDay.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsMarketDay c : IsMarketDay.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    public enum IsExecuted implements IEnum {
        /** 0：未完成 */
        NOTEXECUTED("未完成", "0"),
        /** 1：已完成 */
        EXECUTED("已完成", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsExecuted";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsExecuted(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsExecuted c : IsExecuted.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsExecuted c : IsExecuted.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsExecuted c : IsExecuted.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    public enum ExType implements IEnum {

        /** 1：除权 */
        XR("除权", "1"),
        /** 2：除息 */
        XD("除息", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ExType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ExType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ExType c : ExType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ExType c : ExType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ExType c : ExType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 股票状态
     */
    public enum TPBZ implements IEnum {

        /** 0:正常 */
        NORMAL("正常", "0"),
        /** 1:停牌 */
        STOP("停牌", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TPBZ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TPBZ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TPBZ c : TPBZ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TPBZ c : TPBZ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TPBZ c : TPBZ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 股票状态
     */
    public enum IsSend implements IEnum {

        /** 0:未推送 */
        NO("未推送", "0"),
        /** 1:已推送 */
        YES("已推送", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsSend";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsSend(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsSend c : IsSend.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsSend c : IsSend.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsSend c : IsSend.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 反馈类别
     */
    public enum FeedbackType implements IEnum {

        /** 1：建议 */
        ADVICE("建议", "1"),
        /** 2：错误 */
        ERROR("错误", "2"),
        /** 3：求助 */
        HELP("求助", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "FeedbackType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private FeedbackType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (FeedbackType c : FeedbackType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (FeedbackType c : FeedbackType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (FeedbackType c : FeedbackType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 客户端系统类型
     */
    public enum SystemType implements IEnum {
        /** 1：android */
        ANDROID("android", "1"),
        /** 2：ios */
        IOS("ios", "2"),
        /** 3：pc */
        PC("pc", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SystemType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SystemType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SystemType c : SystemType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SystemType c : SystemType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SystemType c : SystemType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 记录类型
     */
    public enum RecordType implements IEnum {
        /** 1：注册登录 */
        REGISTER("注册登录 ", "1"),
        /** 2：会员登录 */
        MEMBER("会员登录", "2"),
        /** 3：游客登陆 */
        VISITOR("游客登陆", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "RecordType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private RecordType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (RecordType c : RecordType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (RecordType c : RecordType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (RecordType c : RecordType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 风险等级
     */
    public enum fxjbFlag implements IEnum {
        /** 低风险-低 */
        LowRisk_L("低风险-低", "1"),
        /** 低风险-中 */
        LowRisk_M("低风险-中", "2"),
        /** 低风险-高 */
        LowRisk_H("低风险-高", "3"),
        /** 中风险-低 */
        MediumRisk_L("中风险-低", "4"),
        /** 中风险-中 */
        MediumRisk_M("中风险-中", "5"),
        /** 高风险-低 */
        HighRisk_L("高风险-低", "6"),
        /** 高风险-中低 */
        HighRisk_ML("高风险-中低", "7"),
        /** 高风险-中 */
        HighRisk_M("低风险-低", "8"),
        /** 高风险-中高 */
        HighRisk_MH("高风险-中高", "9"),
        /** 高风险-高 */
        HighRisk_H("高风险-高 ", "10");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "fxjbFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private fxjbFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (fxjbFlag c : fxjbFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (fxjbFlag c : fxjbFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (fxjbFlag c : fxjbFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 基金类型
     */
    public enum fundType implements IEnum {
        /** 全部 */
        AllType("全部", "0"),
        /** 股票型 */
        StockType("股票型", "1"),
        /** 混合型 */
        MixedType("混合型", "2"),
        /** 债券型 */
        BondType("债券型", "3"),
        /** 货币型 */
        CurrencyType("货币型", "4"),
        /** 指数型 */
        ExponentialType("指数型", "5"),
        /** LOF */
        LOFType("LOF", "6"),
        /** QDII */
        QDIIType("QDII", "7"),
        /** 保本型 */
        GuaranteedType("保本型", "8"),
        /** 其它 */
        OtherType("其它", "99");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "fundType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private fundType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (fundType c : fundType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (fundType c : fundType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (fundType c : fundType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 注销标识
     */
    public enum IsLogOut implements IEnum {

        /** 0:未注销 */
        NO("未注销", "0"),
        /** 1:注销 */
        YES("注销", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsLogOut";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsLogOut(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsLogOut c : IsLogOut.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsLogOut c : IsLogOut.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsLogOut c : IsLogOut.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 秀才网秀才app开户绑定状态
     */
    public enum Channel implements IEnum {

        /** 11:秀财APP理财账号开户 */
        APP_LICAI_OPEN("秀财APP理财账号开户", "11"),
        /** 12:秀财APP理财账号绑定 */
        APP_LICAI_BIND("秀财APP理财账号绑定", "12"),
        /** 13:秀财网理财账号开户 */
        NET_LICAI_OPEN("秀财网理财账号开户", "13"),
        /** 14:秀财网理财账号绑定 */
        NET_LICAI_BIND("秀财网理财账号绑定", "14"),
        /** 21:秀财APP交易账号开户 */
        APP_JIAOYI_OPEN("秀财APP交易账号开户", "21"),
        /** 22:秀财APP交易账户绑定 */
        APP_JIAOYI_BIND("秀财APP交易账户绑定", "22"),
        /** 23:秀财网交易账户开户 */
        NET_JIAOYI_OPEN("秀财网交易账户开户", "23"),
        /** 24:秀财网交易账户绑定 */
        NET_JIAOYI_BIND("秀财网交易账户绑定", "24");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsLogOut";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private Channel(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Channel c : Channel.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Channel c : Channel.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Channel c : Channel.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 客户端id
     */
    public enum ClientID implements IEnum {

        /** 0：手机端 */
        APP("手机端", "0"),
        /** 1：网页端 */
        WEB("网页端", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ClientID";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ClientID(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ClientID c : ClientID.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ClientID c : ClientID.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ClientID c : ClientID.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 基金类别
     */
    public enum JJLB implements IEnum {

        /** 1|场内基金 */
        INNERFUND("场内基金", "1"),
        /** 2|场外基金 */
        OUTTERFUND("场外基金", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "JJLB";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private JJLB(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (JJLB c : JJLB.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (JJLB c : JJLB.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (JJLB c : JJLB.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品分类
     */
    public enum CPLX implements IEnum {

        /** 010101|集合计划 */
        SETPLAN("集合计划", "010101"),
        /** 010103|专项计划 */
        SPECPLAN("专项计划", "010103"),
        /** 010200|银行理财 */
        BANKFINANCE("银行理财", "010200"),
        /** 070100|收益凭证 */
        INCOME("收益凭证", "070100"),
        /** 080100|伞形信托 */
        UMBRELLATRUST("伞形信托", "080100"),
        /** 080200|证券投资类信托 */
        STOCKTRUST("证券投资类信托", "080200"),
        /** 090100|资讯产品 */
        INFOPRO("资讯产品", "090100"),
        /** 020401|股票型基金 */
        STOCKFUND("股票型基金", "020401"),
        /** 020402|混合型基金 */
        MIXTUREFUND("混合型基金", "020402"),
        /** 020403|债券型基金 */
        BONDFUND("债券型基金", "020403"),
        /** 020404|货币型基金 */
        CURRENCYFUND("货币型基金", "020404");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "CPLX";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private CPLX(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (CPLX c : CPLX.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (CPLX c : CPLX.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (CPLX c : CPLX.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 安卓产品发布渠道
     */
    public enum AndroidReleaseChannel implements IEnum {

        /** 100|应用宝 */
        CHANNEL_APPLICATION("应用宝", "100"),
        /** 101|360 */
        CHANNEL_360("360移动助手", "101"),
        /** 102|小米 */
        CHANNEL_MI("小米市场", "102"),
        /** 103|豌豆荚 */
        CHANNEL_BEANS("豌豆荚", "103"),
        /** 105|百度助手 */
        CHANNEL_BAIDU("百度助手", "105"),
        /** 106|其他线上推广版 */
        CHANNEL_OTHERWEB("其他线上推广版", "106"),
        /** 107|建设银行版 */
        CHANNEL_CCB("建设银行版", "107"),
        /** 108|官网 */
        CHANNEL_OW("官网", "108"),
        /** 111|华为市场 */
        CHANNEL_HUAWEI("华为市场", "111"),
        /** 110|工商银行 */
        CHANNEL_ICBC("工商银行版", "110"),
        /** 112|联想 */
        CHANNEL_LENOVO("联想", "112"),
        /** 113|魅族 */
        CHANNEL_MEIZU("魅族", "113"),
        /** 114|三星 */
        CHANNEL_SAMSUNG("三星", "114"),
        /** 115|其他应用市场 */
        CHANNEL_OTHER("其他应用市场", "115"),
        /** 202|电信版 */
        CHANNEL_DIANXIN("电信版", "202");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "AndroidReleaseChannel";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private AndroidReleaseChannel(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (AndroidReleaseChannel c : AndroidReleaseChannel.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (AndroidReleaseChannel c : AndroidReleaseChannel.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (AndroidReleaseChannel c : AndroidReleaseChannel.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * 获取所有id
         * 
         * @return
         */
        public static List<String> getEnumCodes() {
            List<String> list = new ArrayList<String>();
            for (AndroidReleaseChannel c : AndroidReleaseChannel.values()) {
                list.add(c.getCode());
            }
            return list;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * IOS产品发布渠道
     */
    public enum IOSReleaseChannel implements IEnum {

        /** 109|Appstore */
        CHANNEL_APPSTORE("Appstore", "109"),
        /** 108|官网 */
        CHANNEL_OW("官网", "108"),
        /** 107|建设银行版 */
        CHANNEL_CCB("建设银行版", "107"),
        /** 110|工商银行 */
        CHANNEL_ICBC("工商银行版", "110"),
        /** 106|其他线上推广版 */
        CHANNEL_OTHER("其他线上推广版", "106"),
        /** 202|电信版 */
        CHANNEL_DIANXIN("电信版", "202");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IOSReleaseChannel";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IOSReleaseChannel(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IOSReleaseChannel c : IOSReleaseChannel.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IOSReleaseChannel c : IOSReleaseChannel.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IOSReleaseChannel c : IOSReleaseChannel.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * 获取所有id
         * 
         * @return
         */
        public static List<String> getEnumCodes() {
            List<String> list = new ArrayList<String>();
            for (IOSReleaseChannel c : IOSReleaseChannel.values()) {
                list.add(c.getCode());
            }
            return list;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品pdf文件类型
     */
    public enum ProductPDFType implements IEnum {

        /** 1|风险揭示书 */
        RISK("风险揭示书", "1"),
        /** 2|资产管理合同 */
        CONTRACT("资产管理合同", "2"),
        /** 3|产品说明书 */
        PRODUCTINS("产品说明书", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ProductPDFType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ProductPDFType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ProductPDFType c : ProductPDFType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ProductPDFType c : ProductPDFType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ProductPDFType c : ProductPDFType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 性别
     */
    public enum Gender implements IEnum {

        /** 1|男 */
        MALE("男", "1"),
        /** 0|女 */
        FEMALE("女", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         *
         * @return String
         */
        public String getEnumName() {
            return "Gender";
        }

        /**
         * 构造函数
         *
         * @param label String
         * @param code String
         */
        private Gender(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         *
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (Gender c : Gender.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         *
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (Gender c : Gender.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         *
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (Gender c : Gender.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         *
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         *
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         *
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         *
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         *
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 业务代码
     */
    public enum YWDM implements IEnum {
        /** 认购 */
        SUBSCRIPTION("认购", "020"),
        /** 申购 */
        APPLY("申购", "022"),
        /** 赎回 */
        RDMEEM("赎回", "024");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "YWDM";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private YWDM(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (YWDM c : YWDM.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (YWDM c : YWDM.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (YWDM c : YWDM.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 区域投放类别
     */
    public enum ContainFlag implements IEnum {
        /** 1-包含投放 */
        CONTAIN("包含投放", "1"),
        /** 0-排除投放 */
        NOTCONTAIN("排除投放", "0"),
        /** 9-全投 */
        ALL("全投", "9");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ContainFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ContainFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ContainFlag c : ContainFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ContainFlag c : ContainFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ContainFlag c : ContainFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 业务名称
     */
    public enum YWMC implements IEnum {

        DM070("本地调整持仓成本", "070"),

        DM001("开户", "001"),

        DM101("开户", "101"),

        DM102("销户", "102"),

        DM103("账户信息修改", "103"),

        DM104("基金账户冻结", "104"),

        DM105("基金账户解冻", "105"),

        DM106("基金账户卡挂失", "106"),

        DM107("基金账户卡解挂", "107"),

        DM108("增加交易账户", "108"),

        DM109("撤销交易账户", "109"),

        DM120("认购", "120"),

        DM121("预约认购", "121"),

        DM122("申购", "122"),

        DM123("预约申购", "123"),

        DM124("赎回", "124"),

        DM125("预约赎回", "125"),

        DM126("转销售人/机构", "126"),

        DM127("转销售人/机构转入", "127"),

        DM128("转销售人/机构转出", "128"),

        DM129("设置分红方式", "129"),

        DM130("认购结果", "130"),

        DM131("基金份额冻结", "131"),

        DM132("基金份额解冻", "132"),

        DM133("非交易过户", "133"),

        DM134("非交易过户转入", "134"),

        DM135("非交易过户转出", "135"),

        DM136("基金转换", "136"),

        DM137("基金转换转入", "137"),

        DM138("基金转换转出", "138"),

        DM139("定时定额投资", "139"),

        DM140("退款", "140"),

        DM141("补款", "141"),

        DM142("强行赎回", "142"),

        DM143("红利发放", "143"),

        DM144("强行调增", "144"),

        DM145("强行调减", "145"),

        DM146("配号", "146"),

        DM149("募集失败", "149"),

        DM150("基金清盘", "150"),

        DM151("基金终止", "151"),

        DM152("撤单", "152"),

        DM153("撤预约单", "153"),

        DM154("无效资金", "154"),

        DM155("资金清算", "155"),

        DM159("定时定额计划申请", "159"),

        DM160("定时定额计划退出", "160"),

        DM190("参加定时定额申购", "190"),

        DM191("取消定时定额申购", "191"),

        DM002("销户", "002"),

        DM020("认购", "020"),

        DM021("预约认购", "021"),

        DM022("申购", "022"),

        DM023("预约申购", "023"),

        DM024("赎回", "024"),

        DM025("预约赎回", "025"),

        DM026("转销售人/机构", "026"),

        DM027("转销售人/机构转入", "027"),

        DM028("转销售人/机构转出", "028"),

        DM029("设置分红方式", "029"),

        DM003("账户信息修改", "003"),

        DM030("认购结果", "030"),

        DM031("基金份额冻结", "031"),

        DM032("基金份额解冻", "032"),

        DM033("非交易过户", "033"),

        DM034("非交易过户转入", "034"),

        DM035("非交易过户转出", "035"),

        DM036("基金转换", "036"),

        DM037("基金转换转入", "037"),

        DM038("基金转换转出", "038"),

        DM039("定时定额投资", "039"),

        DM004("基金账户冻结", "004"),

        DM040("退款", "040"),

        DM041("补款", "041"),

        DM042("强行赎回", "042"),

        DM043("红利发放", "043"),

        DM044("强行调增", "044"),

        DM045("强行调减", "045"),

        DM046("配号", "046"),

        DM049("募集失败", "049"),

        DM005("基金账户解冻", "005"),

        DM050("基金清盘", "050"),

        DM051("基金终止", "051"),

        DM052("撤单", "052"),

        DM053("撤预约单", "053"),

        DM054("无效资金", "054"),

        DM055("资金清算", "055"),

        DM059("定时定额计划申请", "059"),

        DM006("基金账户卡挂失", "006"),

        DM060("定时定额计划退出", "060"),

        DM600("手续费返还", "600"),

        DM007("基金账户卡解挂", "007"),

        DM008("增加交易账户", "008"),

        DM009("撤销交易账户", "009"),

        DM090("参加定时定额申购计划", "090"),

        DM091("取消定时定额申购", "091"),

        DM180("基金确权", "180"),

        DM080("基金确权", "080");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "YWMC";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private YWMC(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (YWMC c : YWMC.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (YWMC c : YWMC.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ConbineFlag c : ConbineFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 渠道投放类别
     */
    public enum ConbineFlag implements IEnum {
        /** 0-全部 */
        ALL("全部", "0"),
        /** 1-android */
        ANDROID("android", "1"),
        /** 2-ios */
        IOS("ios", "2"),
        /** 3:非全部（既包含android也包含ios） */
        NOTALL("ios、android", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ConbineFlag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ConbineFlag(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ConbineFlag c : ConbineFlag.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ConbineFlag c : ConbineFlag.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ConbineFlag c : ConbineFlag.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 股票对象
     */
    public enum StockTarget implements IEnum {
        /** 1：当前持仓 */
        CURRENT("当前持仓", "1"),
        /** 2：历史持有 */
        HISTORY("历史持有", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "StockTarget";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private StockTarget(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (StockTarget c : StockTarget.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (StockTarget c : StockTarget.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (StockTarget c : StockTarget.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 券商方风险等级
     */
    public enum IFFXDJ implements IEnum {
        /** 0:未设定 */
        NOTSETZERO("未设定", "0"),
        /** 1:激进型 */
        RADICAL("激进型", "1"),
        /** 2:积极型 */
        ACTIVE("积极型", "2"),
        /** 3:稳健型 */
        STEADY("稳健型", "3"),
        /** 4:保守型 */
        CONSERVATIVE("保守型", "4"),
        /** 5:未设定 */
        NOTSET("未设定", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IFFXDJ";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IFFXDJ(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IFFXDJ c : IFFXDJ.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IFFXDJ c : IFFXDJ.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IFFXDJ c : IFFXDJ.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 黑白名单定投条件
     */
    public enum BWFLAG implements IEnum {
        /** 1:测试 */
        TEST("测试", "1"),
        /** 2:白名单 */
        WHITE("白名单", "2"),
        /** 3:黑名单 */
        BLACK("黑名单", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "BWFLAG";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private BWFLAG(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (BWFLAG c : BWFLAG.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (BWFLAG c : BWFLAG.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (BWFLAG c : BWFLAG.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 邀请状态
     */
    public enum InviteStatus implements IEnum {
        /** 正常 */
        NOTREGISTERED("未注册", "0"),
        /** 已删除 */
        REGISTERED("已注册", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "InviteStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private InviteStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (InviteStatus c : InviteStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (InviteStatus c : InviteStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (InviteStatus c : InviteStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 发送方式
     */
    public enum SendCourse implements IEnum {
        /** 1:推送 */
        PUSH("推送", "1"),
        /** 9:不通知 */
        NO_NOTICE("不通知", "9");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SendCourse";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SendCourse(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SendCourse c : SendCourse.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SendCourse c : SendCourse.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SendCourse c : SendCourse.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 发送时间
     */
    public enum SendType implements IEnum {
        /** 1:即时发送 */
        IMM("即时发送", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SendType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SendType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SendType c : SendType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SendType c : SendType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SendType c : SendType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否全员对象
     */
    public enum IsAll implements IEnum {
        /** 1:全员 */
        ALL("全员", "1"),
        /** 0:指定 */
        SPECIFY("指定", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsAll";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsAll(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsAll c : IsAll.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsAll c : IsAll.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsAll c : IsAll.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 来源类别
     */
    public enum OriginType implements IEnum {
        /** 1:系统自动 */
        SYSTEM("系统自动", "1"),
        /** 2:后台维护 */
        BACKGROUND("后台维护", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "OriginType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private OriginType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (OriginType c : OriginType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (OriginType c : OriginType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (OriginType c : OriginType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 操作类别
     */
    public enum OpType implements IEnum {
        /** 1:获取积分 */
        GET("获取积分", "1"),
        /** 2:消耗积分 */
        LOSE("消耗积分", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "Flag";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private OpType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (OpType c : OpType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (OpType c : OpType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (OpType c : OpType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息类别
     */
    public enum MessageType implements IEnum {
        /** 系统 */
        SYSTEM("系统", "1"),
        /** 关注 */
        CONCERN("关注", "2"),
        /** 活动 */
        ACTIVITY("活动", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MessageType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MessageType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MessageType c : MessageType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MessageType c : MessageType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MessageType c : MessageType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息小分类-关注
     */
    public enum ConcernMessageType implements IEnum {
        /** 1:五牛组合调仓 */
        PORTFOLIO("五牛组合调仓", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ConcernMessageType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ConcernMessageType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ConcernMessageType c : ConcernMessageType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ConcernMessageType c : ConcernMessageType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ConcernMessageType c : ConcernMessageType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息小分类-系统
     */
    public enum SystemMessageType implements IEnum {
        /** 1:系统维护 */
        SYSTEMMAINTENANCE("系统维护", "1"),
        /** 2:版本更新 */
        VERSIONUPDATE("版本更新", "2"),
        /** 3:意见反馈 */
        FEEDBACK("意见反馈", "3"),
        /** 4:积分中心 */
        POINTSCENTER("积分中心", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SystemMessageType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SystemMessageType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SystemMessageType c : SystemMessageType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SystemMessageType c : SystemMessageType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SystemMessageType c : SystemMessageType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息小分类-活动
     */
    public enum ActivityMessageType implements IEnum {
        /** 1:活动通知 */
        ACTIVITYNOTICE("活动通知", "1"),
        /** 2:牛币获取 */
        POINTSGET("牛币获取", "2"),
        /** 3:牛币消费 */
        POINTSCONSUME("牛币消费", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ActivityMessageType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ActivityMessageType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ActivityMessageType c : ActivityMessageType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ActivityMessageType c : ActivityMessageType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ActivityMessageType c : ActivityMessageType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 软件下载分类
     */
    public enum SoftDownType implements IEnum {
        /** 1:安卓下载 */
        ANDROID("安卓下载", "1"),
        /** 2:IOS下载 */
        IOS("IOS下载", "2"),
        /** 3:普通软件 */
        NORMAL("普通软件", "3"),
        /** 4:下单程序 */
        ORDER("下单程序", "4"),
        /** 5:个性化软件 */
        INDIVIDUATION("个性化软件", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "SoftDownType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private SoftDownType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (SoftDownType c : SoftDownType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (SoftDownType c : SoftDownType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (SoftDownType c : SoftDownType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 风险客户类型
     */
    public enum RiskCustomerType implements IEnum {
        /** 0:未设定 */
        UNDISABLED("未设定", "0"),
        /** 1:保守型 */
        CONSERVATIVE("保守型", "1"),
        /** 2:相对保守型 */
        CONSERVATIVER("相对保守型", "2"),
        /** 3:稳健性 */
        STEADY("稳健性", "3"),
        /** 4:相对积极型 */
        ACTIVER("相对积极型", "4"),
        /** 5:积极型 */
        ACTIVE("积极型号", "5");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "RiskCustomerType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private RiskCustomerType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (RiskCustomerType c : RiskCustomerType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (RiskCustomerType c : RiskCustomerType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (RiskCustomerType c : RiskCustomerType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务类型
     */
    public enum TaskType implements IEnum {
        /** 1:推荐活动 */
        RECOMMENDEDACTIVITY("推荐活动", "1"),
        /** 2:我的初次 */
        MYFIRST("我的初次", "2"),
        /** 3:我爱我秀 */
        MYSHOW("我爱我秀", "3"),
        /** 4:坚韧不拔 */
        PERSEVERE("坚韧不拔", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TaskType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TaskType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TaskType c : TaskType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TaskType c : TaskType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TaskType c : TaskType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务标签
     */
    public enum TaskLabel implements IEnum {
        /** 1:新任务 */
        NEW("新任务", "1"),
        /** 2:已完成 */
        DONE("已完成", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TaskLabel";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TaskLabel(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TaskLabel c : TaskLabel.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TaskLabel c : TaskLabel.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TaskLabel c : TaskLabel.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 是否已读
     */
    public enum IsRead implements IEnum {
        /** 0:未读 */
        UNREAD("未读", "0"),
        /** 1:已读 */
        READ("已读", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "IsRead";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private IsRead(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (IsRead c : IsRead.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsRead c : IsRead.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (IsRead c : IsRead.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务状态
     */
    public enum TaskStatus implements IEnum {
        /** 0:未完成 */
        UNFINISHED("未完成", "0"),
        /** 1:已完成 */
        FINISHED("已完成", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TaskStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TaskStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TaskStatus c : TaskStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (IsRead c : IsRead.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TaskStatus c : TaskStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 开户状态
     */
    public enum OpenAccountStatus implements IEnum {
        /** 0：未开户 */
        NOTOPEN("未开户", "0"),
        /** 1：已开户 */
        OPENED("已开户", "1"),
        /** 2：重开户 */
        REOPENED("重开户", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "OpenAccountStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private OpenAccountStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (OpenAccountStatus c : OpenAccountStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (OpenAccountStatus c : OpenAccountStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (OpenAccountStatus c : OpenAccountStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 绑定状态
     */
    public enum BindStatus implements IEnum {
        /** 0：未开户 */
        NOTBIND("未绑定", "0"),
        /** 1：已开户 */
        BOUND("已绑定", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "BindStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private BindStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (BindStatus c : BindStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (BindStatus c : BindStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (BindStatus c : BindStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 动作标识
     */
    public enum MoveSign implements IEnum {
        /** 0：不跳转 */
        NOTBIND("不跳转", "0"),
        /** 1：原生 */
        NATIVE("原生", "1"),
        /** 2：H5 */
        H5("H5", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MoveSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MoveSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MoveSign c : MoveSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MoveSign c : MoveSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MoveSign c : MoveSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息中心-动作参数1
     */
    public enum MsgActionParam1 implements IEnum {
        /** 1:五牛组合详情页 */
        PORTFOLIO_DETAIL("五牛组合详情页", "1"),
        /** 1：原生 */
        POINTS_RECORD_LIST("牛币记录列表", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MsgActionParam1";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MsgActionParam1(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MsgActionParam1 c : MsgActionParam1.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MsgActionParam1 c : MsgActionParam1.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MsgActionParam1 c : MsgActionParam1.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品类型
     */
    public enum ProductType implements IEnum {

        /** 1:五牛组合订阅 */
        PORTFOLIO("五牛组合订阅", "1"),
        /** 2:电话卡 */
        TELCARD("电话卡", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ProductType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ProductType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ProductType c : ProductType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ProductType c : ProductType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ProductType c : ProductType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品单位
     */
    public enum ProductUnit implements IEnum {

        /** 如:元;M;个 等 */
        /** 1:元 */
        YUAN("元", "1"),
        /** 2:M */
        M("M", "2"),
        /** 3:个 */
        GE("个", "3");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ProductUnit";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ProductUnit(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ProductUnit c : ProductUnit.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ProductUnit c : ProductUnit.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ProductUnit c : ProductUnit.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 产品上下架
     */
    public enum ProductStatus implements IEnum {

        /** 如:元;M;个 等 */
        /** 0:下架 */
        SHELF_OFF("下架", "0"),
        /** 1:上架 */
        SHELF_ON("上架", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ProductStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ProductStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ProductStatus c : ProductStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ProductStatus c : ProductStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ProductStatus c : ProductStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 积分状态
     */
    public enum PointStatus implements IEnum {

        /** 1:正常；0:冻结 */
        /** 1:正常 */
        NORMAL("正常", "1"),
        /** 0:禁止兑换 */
        FREEZON("冻结", "0");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointStatus c : PointStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointStatus c : PointStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointStatus c : PointStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务分组
     */
    public enum PointsTaskGroup implements IEnum {

        /** G0:安装 */
        ANZHUANG("安装", "G0"),
        /** G1:注册 */
        ZHUCE("注册", "G1"),
        /** G2:每日签到 */
        MEIRIQIANDAO("每日签到", "G2"),
        /** G3:连续签到 */
        LIANXUQIANDAO("连续签到", "G3"),
        /** G4:累计签到 */
        LEIJIQIANDAO("累计签到", "G4"),
        /** G5:分享 */
        FENXIANG("分享", "G5"),
        /** G6:交易账号开户 */
        JIAOYIZHANGHAOKAIHU("交易账号开户", "G6"),
        /** G7:交易账号绑定 */
        JIAOYIZHANGHAOBANGDING("交易账号绑定", "G7"),
        /** G8:投资 */
        TOUZI("投资", "G8");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointsTaskGroup";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointsTaskGroup(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointsTaskGroup c : PointsTaskGroup.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointsTaskGroup c : PointsTaskGroup.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointsTaskGroup c : PointsTaskGroup.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务类型
     */
    public enum PointsTaskType implements IEnum {

        /** 1:推荐活动 */
        TUIJIANHUODONG("推荐活动", "1"),
        /** 2:我的初次 */
        WODECHUCI("我的初次", "2"),
        /** 3:我爱我秀 */
        WOAIWOXIU("我爱我秀", "3"),
        /** 4:坚忍不拔 */
        JIANRENBUBA("坚韧不拔", "4");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointsTaskType";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointsTaskType(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointsTaskType c : PointsTaskType.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointsTaskType c : PointsTaskType.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointsTaskType c : PointsTaskType.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 动作标识
     */
    public enum PointsActionSign implements IEnum {

        /** 0:行没有点击事件 */
        NOONCLICK("行没有点击事件", "0"),
        /** 1:我的初次 */
        TOORIGINFRAME("行点击后跳转到原生页面", "1"),
        /** 2:行点击后跳转H5页面 */
        TOH5FRAME("行点击后跳转H5页面", "2");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointsActionSign";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointsActionSign(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointsActionSign c : PointsActionSign.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointsActionSign c : PointsActionSign.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointsActionSign c : PointsActionSign.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 任务标签
     */
    public enum PointsTaskLabel implements IEnum {

        /** 1:新任务 */
        XINRENWU("新任务", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "PointsTaskLabel";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private PointsTaskLabel(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (PointsTaskLabel c : PointsTaskLabel.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (PointsTaskLabel c : PointsTaskLabel.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (PointsTaskLabel c : PointsTaskLabel.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 商品期限
     */
    public enum ProductTerm implements IEnum {

        /** 30:一个月 */
        ONEMONTH("一个月", "30"),
        /** 60:两个月 */
        TWOMONTH("两个月", "60"),
        /** 90:三个月 */
        THREEMONTH("三个月", "90");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "ProductTerm";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private ProductTerm(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (ProductTerm c : ProductTerm.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (ProductTerm c : ProductTerm.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (ProductTerm c : ProductTerm.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 消息状态
     */
    public enum MsgStatus implements IEnum {

        /** 未发布 */
        UNPUBLISHED("未发布", "0"),
        /** 已发布 */
        PUBLISHED("已发布", "1");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "MsgStatus";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private MsgStatus(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (MsgStatus c : MsgStatus.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (MsgStatus c : MsgStatus.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (MsgStatus c : MsgStatus.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }

    /**
     * 处理结果
     */
    public enum TranStat implements IEnum {

        /** 成功 */
        SUCCESS("成功", "1"),
        /** 失败 */
        FAILURE("失败", "9");

        /** 值 */
        private String label;

        /** 键 */
        private String code;

        /**
         * 取得枚举区分
         * 
         * @return String
         */
        public String getEnumName() {
            return "TranStat";
        }

        /**
         * 构造函数
         * 
         * @param label String
         * @param code String
         */
        private TranStat(String label, String code)
        {
            this.label = label;
            this.code = code;
        }

        /**
         * 根据键取得值
         * 
         * @param code String
         * @return String
         */
        public static String getEnumLabel(String code) {
            for (TranStat c : TranStat.values()) {
                if (StringUtils.isEqual(c.getCode(), code)) {
                    return c.label;
                }
            }
            return null;
        }

        /**
         * 根据值取得第一个匹配的键
         * 
         * @param label String
         * @return String
         */
        public static String getEnumCode(String label) {
            for (TranStat c : TranStat.values()) {
                if (StringUtils.isEqual(c.getLabel(), label)) {
                    return c.code;
                }
            }
            return null;
        }

        /**
         * 取得下拉框列表
         * 
         * @return List
         */
        public static List<DropDownDto> getList() {
            List<DropDownDto> resultList = new ArrayList<DropDownDto>();
            for (TranStat c : TranStat.values()) {
                DropDownDto dto = new DropDownDto();
                dto.setId(c.getCode());
                dto.setName(c.getLabel());
                resultList.add(dto);
            }
            return resultList;
        }

        /**
         * get
         * 
         * @return String
         */
        public String getLabel() {
            return label;
        }

        /**
         * set
         * 
         * @return String
         */
        public String getCode() {
            return code;
        }

        /**
         * String转换，中间加横杠
         * 
         * @return String
         */
        @Override
        public String toString() {
            return this.label;
        }

        /**
         * 转换成value
         * 
         * @return String
         */
        public String toValueString() {
            return String.valueOf(this.code);
        }

        /**
         * 转换成label
         * 
         * @return String
         */
        public String toLabelString() {
            return String.valueOf(this.label);
        }
    }
}
