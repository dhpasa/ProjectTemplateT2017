package com.logictech.dwzq.core.constants;

/**
 * @ClassName: Constants
 * @Description: 公共常量
 * @author
 */
public class APIConstants {

    //============  错误代码    =================
    /** 处理结果 1:成功 */
    public static final int     RESULT_SUCCESS                = 1;

    /** 处理结果 0:失败 */
    public static final int     RESULT_ERROR                  = 0;

    /** 处理结果 9:更新0件、没数据 */
    public static final int     RESULT_NO_DATA                = 9;

    /** 处理结果 9:认证失败 */
    public static final int     RESULT_AUTH_FAILED            = 9;

    /** 处理结果 2:需要确认手机银行验证码 */
    public static final int     RESULT_CONFIRM_VERICODE       = 2;

    /** 处理结果 2:部分成功 */
    public static final int     RESULT_PART_SUCCESS           = 2;

    /** 外部接口 -1152:无此功能服务 */
    public static final int     ERROR_1152                    = -1152;

    /** 外部接口 -204543101:融资额查询 无持仓 */
    public static final int     ERROR_204543101               = -204543101;

    // ============ 自定义常量 =================
    /** 处理标识:0 */
    public static final String  HANDLE_ZERO                   = "0";

    /** 处理标识:1 */
    public static final String  HANDLE_ONE                    = "1";

    /** 处理标识 :2 */
    public static final String  HANDLE_TWO                    = "2";

    /** 处理标识 :3 */
    public static final String  HANDLE_THREE                  = "3";

    /** 排序方式 升序 */
    public static final String  ORDER_WAY_ASC                 = "ascending";

    /** 排序方式 降序 */
    public static final String  ORDER_WAY_DESC                = "descending";

    /** 任务状态 1:已完成 */
    public static final String  MISSION_STATUS_COMPLETED      = "1";

    /** 任务状态 0:未完成 */
    public static final String  MISSION_STATUS_UNCOMPLETED    = "0";

    /** 商品状态0:兑换中 */
    public static final String  COMMODITY_STATUS_EXCHANGING   = "0";

    /** 商品状态1:兑换已满 */
    public static final String  COMMODITY_STATUS_EXCHANGE_MAX = "1";

    /** 商品状态2:即将开始 */
    public static final String  COMMODITY_STATUS_TO_START     = "2";

    /** 商品状态3:兑换已结束 */
    public static final String  COMMODITY_STATUS_END          = "3";

    /** 成就状态：取得 */
    public static final String  ACMP_STATUS_OBTAIN            = "1";

    /** 成就状态：未取得 */
    public static final String  ACMP_STATUS_NOT_OBTAIN        = "0";

    /** 是否显示：1：显示 */
    public static final String  IS_DISPLAY_YES                = "1";

    /** 是否显示：0：不显示 */
    public static final String  IS_DISPLAY_NO                 = "0";

    /** 右斜线 */
    public static final String  RIGHT_SLASH                   = "/";

    /** 左斜线 */
    public static final String  LEFT_SLASH                    = "\\";

    /** 横杠 */
    public static final String  HYPHEN                        = "-";

    /** 转译 半角-竖线 */
    public static final String  VERTICAL_LINE                 = "\\|";

    /** 半角-竖线 */
    public static final String  VERTICAL_LINE_NORMAL          = "|";

    /** #号 */
    public static final String  WELL                          = "#";

    /** 冒号-半角 */
    public static final String  HALF_COLON                    = ":";

    /** 冒号-全角 */
    public static final String  FULL_COLON                    = "：";

    /** -> */
    public static final String  POINTTO                       = "->";

    /** 百分号 */
    public static final String  PERCENT                       = "%";

    /** 半角& */
    public static final String  AMPERSAND                     = "&";

    /** token 用 */
    public static final int     PAD_BELOW                     = 0x10;

    /** token 用 */
    public static final int     TWO_BYTES                     = 0xFF;

    /** 删除标识 --正常 */
    public static final int     DEL_FLAG_NORMAL               = 0;

    /** 删除标识 --删除 */
    public static final int     DEL_FLAG_DELETE               = 1;

    // ============== 日期格式 =================
    public static final String  PATTEN_YM                     = "yyyy年M月";

    public static final String  PATTEN_YMDHMS                 = "yyyyMMddHHmmss";

    public static final String  PATTEN_YMD_HMS                = "yyyy/MM/dd HH:mm:ss";

    // ============== 固定文字 =================
    /** 空文字 */
    public static final String  EMPTY                         = "";

    /** 双横杠 */
    public static final String  DOUBLE_HYPHEN                 = "--";

    /** 下划线 */
    public static final String  UNDERLINE                     = "_";

    /** 验证码 */
    public static final String  AUTH_CODE                     = "验证码";

    /** 协议ID */
    public static final String  CONTRACT_ID                   = "协议ID";

    public static final String  MOBILE                        = "手机号";

    /** 逗号 */
    public static final String  COMMA                         = ",";

    /** 年 */
    public static final String  YEAR                          = "年";

    /** 月 */
    public static final String  MONTH                         = "月";

    /** 日 */
    public static final String  DAY                           = "日";

    /** 今天 */
    public static final String  TODAY                         = "今天";

    /** 昨天 */
    public static final String  YESTERDAY                     = "昨天";

    /** 周期性类别名:每月 */
    public static final String  CYCLE_TYPE_MONTH              = "每月";

    /** 周期性类别名:每季度 */
    public static final String  CYCLE_TYPE_SEASON             = "每季度";

    /** 周期性类别名:每年 */
    public static final String  CYCLE_TYPE_YEAR               = "每年";

    /** 任务状态:已领取 */
    public static final String  POINTS_IS_GET_GET             = "2";

    /** 文件后缀. */
    public static final String  SUFFIX_POINT                  = ".";

    /** 是否激活:yes */
    public static final String  IS_ACTIVE_YES                 = "1";

    /** 是否激活:no */
    public static final String  IS_ACTIVE_NO                  = "0";

    /** 自定义Key:3-关联账号 */
    public static final String  CUSTOM_KEY_ACCOUNTID          = "3";

    /** 自定义Key:4-关联账户资产账号 */
    public static final String  CUSTOM_KEY_ASSETACCOUNT       = "4";

    /** investType-"2":理财 */
    public static final String  INVEST_TYPE_FINANCE           = "2";

    /** investType-"1":投资组合 */
    public static final String  INVEST_TYPE_SHARE             = "1";

    /** 产品类型-2:理财 */
    public static final int     PRODUCT_TYPE_LC               = 2;

    /** 产品类型-1:股票 */
    public static final int     PRODUCT_TYPE_GP               = 1;

    /** 交易类型-1:购买 */
    public static final int     TRADE_TYPE_BUY                = 1;

    /** 交易类型-2:赎回 */
    public static final int     TRADE_TYPE_SELL               = 2;

    /** 组合类型-1 量身定制组合 */
    public static final int     GROUP_TYPE_G                  = 1;

    /** 组合类型-2 五牛组合 */
    public static final int     GROUP_TYPE_ZH                 = 2;

    /** 组合编号-GXXX 量身定制组合 */
    public static final String  GROUP_CODE_G                  = "G";

    /** 组合编号-ZHXXX 五牛组合 */
    public static final String  GROUP_CODE_ZH                 = "ZH";

    public static final String  STRING_FORMAT_00              = "00";

    /** batch-1:自动生成用户周期数据 */
    public static final int     NEW_TALLY_DATA_BYCYCLE        = 1;

    /** batch-2:每日定时初期化会员属性信息 */
    public static final int     INIT_USER_ATTR_DATA           = 2;

    /** batch-3:针对用户设置的预约提醒方式，自动进行 */
    public static final int     AUTO_WARN                     = 3;

    /** batch-4:获取银行列表信息 */
    public static final int     INIT_BANK_INFO_LIST           = 4;

    /** batch-5:手机号码与用户ID对应关系信息 */
    public static final int     INIT_MOBILE_USER_ID_REL       = 5;

    /** batch-6:发布新版本时，重新初始化Redis版本信息 */
    public static final int     RESET_SYSTEM_VERSION_INFO     = 6;

    /** batch-7:计算当天收益率 */
    public static final int     CALCULATE_PORTFOLIO_SYL       = 7;

    /** batch-8:交易日DB维护 */
    public static final Integer MAINTENANCE_MARKET_DAY        = 8;

    /** batch-9:取得沪深300数据 */
    public static final Integer MAINTENANCE_AVAILABLE_NUM     = 9;

    /** batch-10:除权除息 */
    public static final Integer XRXD                          = 10;

    /** batch-11:用户渠道日报表 */
    public static final Integer DAILY_REPORT                  = 11;

    /** batch-12:同步更新CIF营业部信息 */
    public static final Integer SYNCHRO_CIF_DEP_INFO          = 12;

    /** batch-13:同步更新产品中心数据 */
    public static final Integer SYNCHRO_PRODUCT_INFO          = 13;

    /** batch-14:消息定期处理 */
    public static final Integer MAINTENANCE_MSG_INFO          = 14;

    /** batch-15:完成开户相关任务获取积分 */
    public static final Integer DISTRIBUTE_POINTS             = 15;

    /** batch-16:每周一重置积分任务相关数据 */
    public static final Integer RESET_POINTS_TASK_INFO        = 16;

    /** 理财手机号 */
    public static final String  ACCOUNT_MOBILE                = "5";

    /** 产品项目 */
    public static final String  FID_CPXM                      = "人民币总资产";

    /** 半角空格 */
    public static final String  HALF_SPACE                    = " ";

    /** 左半角括号 */
    public static final String  LEFT_BRACKET                  = "(";

    /** 右半角括号 */
    public static final String  RIGHT_BRACKET                 = ")";

    /** 两位小数默认值 */
    public static final String  HANDLE_ZERO_POINT_ZZ          = "0.00";

    /** 四位小数默认值 */
    public static final String  HANDLE_ZERO_POINT_FOUR        = "0.0000";

    /** 9:30字符串表示 */
    public static final String  TIME_NINE_HALF                = "093000";

    /** 初始资金 */
    public static final String  INITIAL_CAPITAL               = "100000";

    /** 初始关注人数 */
    public static final String  INITIAL_CONCERNEDQUANTITY     = "10000";

    /** 初始版本号 */
    public static final String  INITIAL_VERSION               = "100000";

    public static final String  EXCEL_TEXT                    = "EXCEL内容";

    public static final String  EXCEL_NAME                    = "姓名";

}
