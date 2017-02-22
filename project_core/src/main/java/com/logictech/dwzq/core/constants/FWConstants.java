package com.logictech.dwzq.core.constants;

import java.util.HashMap;
import java.util.Map;

public class FWConstants {

    /**
     * 登录用户信息的sessionId
     */
    public static final String        SLOGIN                                = "suserinfo";

    /**
     * 登录用户信息的sessionId
     */
    public static final String        FLOGIN                                = "fuserinfo";

    public static final String        URI_MODULE                            = "module";

    public static final String        URI_MENU                              = "menu";

    public static final String        USER_ADMIN                            = "admin";

    public static final String        REQ_KEY_MAP                           = "reqParamMap";

    public static final String        REQ_KEY_ACMPINFODTO                   = "reqAcmpInfoDto";

    public static final String        REQ_KEY_USERID                        = "reqUserId";

    /**
     * 系统默认分隔符
     */
    public static final String        DEFAULT_SPLIT                         = "@;";

    /**
     * 文件分隔符
     */
    public static final String        SEPARATOR_FILE                        = "_";

    /**
     * 第一级分割符
     */
    public static final String        SPLITFLG1                             = "@;";

    /**
     * 第二级分割符
     */
    public static final String        SPLITFLG2                             = "#;";

    /**
     * 故障现象等筛选框分隔符
     */
    public static final String        DROPDOWN_FAULT_PHENOMENON_SPLIT       = "-";

    /**
     * SQL LIKE符号
     */
    public static final String        SQLLIKE                               = "%";

    /**
     * 百分比符号
     */
    public static final String        PERSENT                               = "%";

    /**
     * 省略号
     */
    public static final String        TOOCHANGESTRING                       = "...";

    /**
     * 百分比计算
     */
    public static final int           PERSENT_MULTIPLY                      = 100;

    /**
     * 小数点
     */
    public static final String        BIGDECIMAL_POINT                      = ".";

    /**
     * 小数点 split
     */
    public static final String        BIGDECIMAL_POINT_SPLIT                = "\\.";

    /**
     * 内部类区分表示
     */
    public static final String        INNER_CLASS_SEPARATOR                 = "$";

    /**
     * 文件后缀名前的点
     */
    public static final String        FILE_EXTENSION_SEPARATOR              = ".";

    /**
     * 登录Action method
     */
    public static final String        LOGIN_METHOD                          = "login";

    /**
     * Session 过期Action
     */
    public static final String        SESSION_EXPIRED_SHOW                  = "showSessionExpired";

    /**
     * 文件下载
     */
    public static final String        DOWNLOAD_METHOD                       = "download";

    /**
     * 文件打开
     */
    public static final String        OPEN_DOWNLOAD_METHOD                  = "openDownloadFile";

    /**
     * 页面显示数据量
     */
    public static final String        PAGE_SIZE                             = "page_size";

    public static final String        PRO_TYPE                              = "AAAA";

    /** map key 当前时间 */
    public static final String        MAP_KEY_CURRENT                       = "current";

    /**
     * 自定义标签TextInput Pattern类型
     */
    public static final String        TAG_TEXTINPUT_PATTERN_TYPE_FIRST      = "1";

    /**
     * 只能输入半角英文、数字和符号
     */
    public static final String        TAG_TEXTINPUT_PATTERN_TYPE_SECOND     = "2";

    /**
     * 只能输入半角英文、数字和符号
     */
    public static final String        TAG_TEXTINPUT_PATTERN_TYPE_THIRD      = "3";

    /**
     * Excel 最大行数
     */
    public static final Integer       EXCEL_MAX_ROW                         = 60000;

    //文件上传返回参数 的map key 返回标志 true： 成功 false：上传失败
    public static final String        FILE_UPLOAD_RESULT_RETURN_FLAG        = "returnFlag";

    //文件上传返回参数 的map key 加密后的相对路径
    public static final String        FILE_UPLOAD_RESULT_FILE_RELATIVE_PATH = "fileRelativePath";

    //文件上传返回参数 的map key 绝对路径
    public static final String        FILE_UPLOAD_RESULT_FILE_REAL_PATH     = "fileRealPath";

    //文件上传返回参数 的map key 重命名后的文件名
    public static final String        FILE_UPLOAD_RESULT_FILE_RENAME        = "fileRename";

    //文件上传返回参数的map key 唯一编码  
    public static final String        FILE_UPLOAD_RESULT_UUID               = "fileUuid";

    /**
     * 初始化方法
     */
    public static String              INIT_METHOD                           = "init";

    public static Map<String, String> ACTION_DB_LOG                         = new HashMap<String, String>();

    /** 删除 */
    public static final String        IS_DELETE_DELETED                     = "1";

    /** 有效 */
    public static final String        IS_DELETE_ACTIVE                      = "0";

    /** 中划线 */
    public static final String        MIDDLE_LINE                           = "-";

    /** 下载文件编码 导出文件用 */
    public static final String        UTF_8                                 = "UTF-8";

    /** ISO-8859-1 */
    public static final String        ISO_8859_1                            = "ISO-8859-1";

    /** 下划线 导出文件用 */
    public static final String        BOTTOM_LINE                           = "_";

    /** 空字符串 导出文件用 */
    public static final String        EMPPTY_STR                            = "";

    /** 导出文件时间格式 导出文件用 */
    public static final String        EMPORT_EXCEL_FORMAT                   = "yyyyMMddHHmmss";

    /** 文档类型文件大小1M */
    public static final Double        FILE_EXCEL_CHECKSIZE                  = 1024.0;

    /** 图片类型文件大小200K */
    public static final Double        FILE_IMG_CHECKSIZE                    = 200.0;

    /** 验证用半角空格 */
    public static final String        DBC_SPACE                             = " ";

    /** 验证用全角空格 */
    public static final String        SBC_SPACE                             = "　";

    /**
     * 元数据类型 枚举
     */
    public static final String        META_DATA_TYPE_EUNM                   = "ENUM";

    /**
     * 小数点
     */
    public static final String        DECIMAL_POINT                         = ".";

    /** 未失效标志 */
    public static final byte          IS_NOT_DELETE                         = 0;

    /** 失效标志 */
    public static final byte          IS_DELETE                             = 1;

    /**
     * 文件上传时文件名长度限制
     */
    public static final int           FILE_UPLOAD_NAME_LENGTH_LIMIT         = 20;

    /**
     * 文件上传相对路径（其他）
     */
    public static final String        UPLOAD_PATH_OTHER                     = "other";

    /** 公共基础数据 生产线 */
    public static final String        MASTER_DATE_PROLINE                   = "ProLine";

    /** 公共基础数据 生产线 */
    public static final String        MASTER_DATE_LINESTORAGE               = "LineStorage";

    /** 公共基础数据 生产线 */
    public static final String        MASTER_DATE_SYSPARAMETER              = "SysParameter";

    /** 公共基础数据 生产线 */
    public static final String        MASTER_DATE_CONTAINERTYPE             = "ContainerType";

    /** 缓存过期时间（小时） */
    public static final int           MASTER_DATA_OUTTIME_HOUR              = 2;

    /** 数据库是否——是 */
    public static final String        STR_YES                               = "Y";

    /** 数据库是否——否 */
    public static final String        STR_NO                                = "N";

    /** 页面分隔符 */
    public static final String        PAGE_STR_SPLIT                        = "/";

    /** 竖线分隔符 */
    public static final String        VERTICAL_LINE_SPLIT                   = "\\|";

    /** 自动采番类别 发料单号 */
    public static final String        SN_CATEGORY_ISSUEBILL                 = "IssueBillNO";

    /** 自动采番类别 批次编号 */
    public static final String        SN_CATEGORY_LOT                       = "LotNO";

    /** 自动采番类别 CPLS生产计划编号 */
    public static final String        SN_CATEGORY_PROPLAN                   = "ProPlanCode";

    /** 数据录入类别 平台 */
    public static final byte          INPUTTYPE_WEBPT                       = 1;

    /** 数据录入类别 移动 */
    public static final byte          INPUTTYPE_MOBILE                      = 2;

    /** 数据录入类别 其他 */
    public static final byte          INPUTTYPE_OTHER                       = 9;

    /** 登录模式 AD域 */
    public static final String        LOGIN_MODE_AD                         = "0";

    /** 登录模式 系统 */
    public static final String        LOGIN_MODE_SYS                        = "1";

    /** 审核类型——场地 */
    public static final String        AUDIT_CATEGORY_VENUE                  = "Venue";

    /** 审核类型——场馆 */
    public static final String        AUDIT_CATEGORY_PAVILION               = "Pavilion";

    /** 审核类型——系统公告 */
    public static final String        AUDIT_CATEGORY_NOTICE                 = "Notice";

    /** 审核类型——广告 */
    public static final String        AUDIT_CATEGORY_AD                     = "AD";

    /** 审核类型——专题 */
    public static final String        AUDIT_CATEGORY_TOPIC                  = "Topic";

    /** 审核类型——项目 */
    public static final String        AUDIT_CATEGORY_PROJECT                = "Project";

    /** 审核类型——场次 */
    public static final String        AUDIT_CATEGORY_SESSION                = "Session";

    /** 文件类型——场地 */
    public static final String        FILE_TYPE_VENUE                       = "Venue";

    /** 文件类型——场馆 */
    public static final String        FILE_TYPE_PAVILION                    = "Pavilion";

    /** 文件类型——区域 */
    public static final String        FILE_TYPE_AREA                        = "Area";

    /** 文件类型——场地运营 */
    public static final String        FILE_TYPE_VENUEMANAGE                 = "VenueManage";

    /** 文件类型——院团管理 */
    public static final String        FILE_TYPE_PERFORMGROUP                = "PerformGroup";

    /** 文件类型——参数管理 */
    public static final String        FILE_TYPE_PARAMETER                   = "Parameter";

    /** 文件类型——广告 */
    public static final String        FILE_TYPE_AD                          = "AD";

    /** 文件类型——专题 */
    public static final String        FILE_TYPE_TOPIC                       = "Topic";

    /** 文件类型——项目 */
    public static final String        FILE_TYPE_PROJECT                     = "Project";

    /** 文件类型——场馆热区图 */
    public static final String        FILE_TYPE_HOTAREA                     = "HotArea";

    /** 特殊采番——项目 */
    public static final Integer       SPECIAL_SN_TYPE_AREA                  = 1;

    /** 特殊采番——场次 */
    public static final Integer       SPECIAL_SN_TYPE_SESSION               = 2;

    /** 特殊采番——票券 */
    public static final Integer       SPECIAL_SN_TYPE_TICKET                = 3;

    /** 登录用户类型——ERP用户 */
    public static final Integer       LOGIN_USER_TYPE_ERP                   = 1;

    /** 登录用户类型——EC用户 */
    public static final Integer       LOGIN_USER_TYPE_EC                    = 2;

    //========================平台用数据 s=====================//
    //当前平台标示
    public static String              currentPtNo                           = "AA";

    //当前平台是否子平台
    public static boolean             subFlag                               = false;

    //当前平台url
    public static String              mianPtUrl                             = "http://localhost:8080/SHWGServer/WS/";

    //========================平台用数据 e=====================//

    //------------------------手机端----------------------------//
    public static final Integer       SYSTEMERRORCODE                       = -1;

    public static final Integer       SYSTEMSUCCESSCODE                     = 1;

    //-------------------------------------------------------//
    public static final String        SENSOR_SPLIT                          = ",";

    public static String[]            SENSOR_NO_TRANSMIT                    = { "", "" };

    //---------------------importSerials----------------------------------//
    //序列号
    public static String              importSerials_serialNo                = "serialNo";

    //验证码
    public static String              importSerials_verificationCode        = "vc";

    //类型
    public static String              importSerials_type                    = "type";

    //设备类型
    public static String              importSerials_devType                 = "devType";

    //RedisListKey 成就监控URI列表
    public static String              RLK_ACMPAPIURI                        = "rk_acmpApiUri";

    //RedisListKey 银行信息列表
    public static String              RLK_BANKINFO                          = "rk_bankInfo";

    //RedisListKey 成就信息Dto列表
    public static String              RLK_ACMPINFOREDISDTO                  = "rk_acmpInfoRedisDto";

    //RedisListKey 行为积分信息
    public static String              RLK_ACTIONPOINTSINFO                  = "rk_actionPointsInfo";

    //RedisListKey 行情数据列表
    public static String              RLK_MARKETINFODTO                     = "rk_marketInfoDto";

    //RedisListKey 每日任务列表
    public static String              RLK_DAILYMISSION                      = "rk_dailyMission";

    //RedisListKey 手机号码与用户ID对应关系信息列表
    public static String              RLK_MOBILEUSERIDRELDTO                = "rk_mobileUserIdRelDto";

    //RedisListKey 组合的当天收益率
    public static String              RLK_PORTFOLIOEXINFODTO                = "rk_portfolioExInfoDto";

    // 东吴投顾账号默认
    public static String              ADVISER_PID                           = "DW_adviser";

    // 东吴证券邮箱后缀
    public static String              DWZQ_MAIL                             = "@dwzq.com.cn";
}
