package com.logictech.dwzq.core.constants;

/**
 * @ClassName: Constants
 * @Description: 公共常量
 * @author
 */
public class FROConstants {

    //============  错误代码    =================
    /** 处理结果 1:成功 */
    public static final int    RESULT_SUCCESS   = 1;

    /** 处理结果 -1:失败 */
    public static final int    RESULT_TOKEN_ERROR        = -1;
    
    /** 处理结果 0:失败 */
    public static final int    RESULT_ERROR     = 0;

    /** 秀财网登录页 */
    public static final int    XIUCAI_LOGIN     = 111;

    /** 秀财注册页 */
    public static final int    XIUCAI_REGISTER  = 112;

    /** 空字符串 */
    public static final String EMPTY            = "";

    /** 手机端 */
    public static final String CLIENT_ID_PHONE  = "0";

    /** 网页端 */
    public static final String CLIENT_ID_WEB    = "1";

    /** 允许联系 */
    public static final String ALLOW_CONTACT    = "1";

    /** 不允许联系 */
    public static final String NO_ALLOW_CONTACT = "0";

    /** 性别女code */
    public static final String SEX_FEMALE_CODE  = "0";

    /** 性别男code */
    public static final String SEX_MALE_CODE    = "1";

    // ============ 自定义常量 =================
    /** 秀才网会员登录信息的sessionId */
    public static final String LOGIN_INFO       = "userInfo";

    /** 加减月份区分标志 */
    public static final String ADD_MONTH        = "A";

    public static final String MINUS_MONTH      = "M";
    
    /** 允许图片格式 */
    /*public static final String IMAGE_URL        = ".jpg,.gif,.png,.jpeg,.bmp";*/

    // ============== 格式 =================
    public static final String PATTEN_YMD_HM    = "yyyy-MM-dd HH:mm";
    
    /** 金额格式化2位小数 */
    public static final String AMOUNT_FORMAT_2SD    = "###,###,###.00";

    // ============== 固定文字 =================
    public static final String SEX_MALE         = "男";

    public static final String SEX_FEMALE       = "女";
    
    public static final String USER_ID          = "用户ID";
    
    public static final String PASSWORD         = "密码";
    
    public static final String PRODUCT_INFO     = "产品信息";
    
    public static final String PRODUCT_CODE     = "产品编码";
    
    public static final String PRODUCT_COMPANY  = "产品发行机构";
    
    public static final String IP_ADDRESS       = "IP地址";
    
    //基金类别
    public static final String JJLB             = "基金类别";
    
    //处理标识:未关联交易帐号跳转到新老客户选择画面
    public static final String HANDLE_NOTBIND   = "0";

    //处理标识:已关联交易帐号，已签约或不需要签约。
    public static final String HANDLE_SIGN      = "1";

    //处理标识:已关联交易帐号，未签约。
    public static final String HANDLE_NOTSIGN   = "2";
    
    // 牛吧广告版位
    public static final String   BBS_ADSPACE_ID ="120"; 
    
    /** 下划线*/
    public static final String  UNDERLINE       ="_";
    
    /** 手机号 */
    public static final String  TYPE_MOBILE       ="M";
    
    /** 密码 */
    public static final String  TYPE_PASSWORD       ="P";
    
    /** 验证码 */
    public static final String  TYPE_VERIFY       ="V";
    
    /** 交易状态：2|可申赎 */
    public static final String  TYPE_JYZT_KSS       ="2";
    
    /** 交易状态：5|停止申购 */
    public static final String  TYPE_JYZT_TZSG       ="5";
    
    /** 可赎回 */
    public static final String  CAN_REDEEM       ="1";
    
    /** 停止赎回 */
    public static final String  STOPSHUHUI       ="6";
    
    /** 绑定账号 */
    public static final String  BIND_ACCOUNT = "1";
    
    /** 未绑定账号 */
    public static final String  UNBOUND_ACCOUNT = "0";
    
    /** 判断是否绑定理财账号sessionId*/
    public static final String  ACCOUNT_LICAI = "IsBindingFundFlg";
    
    /** 判断是否绑定交易账号sessionId*/
    public static final String  ACCOUNT_JIAOYI = "IsBindingStockFlg";
    
    /** 成就用URL-个人信息取得 */
    public static final String  MYINFO_GETPAGE = "asset/getAssetSummary";
    
    /** 成就用URL-理财支付 */
    public static final String  PAYCONFIRM_PAYFROMFINANCE = "trade/payFromFinance";
    
    /** 成就用URL-注册成功 */
    public static final String  REGISTER_USERREGISTER = "login/registerAndLoginUser";
    
    /** 成就用URL-理财账户开户或绑定成功 */
    public static final String  ACCOUNT_ACCOUNTAUTHENTICATIONFORFINANCIAL = "account/accountAuthenticationForFinancial";
    
    /** 成就用URL-交易账户开户或绑定成功 */
    public static final String  ACCOUNT_ACCOUNTAUTHENTICATIONTRADING = "account/accountAuthenticationTrading";
    
    /** 成就用URL-用户登录 */
    public static final String  LOGIN_USERLOGIN = "login/loginUserCommon";
    
    /** 反馈类别 */
	public static final String ADVICE_TYPE = "ADVICE_TYPE";

	/** 处理状态 */
	public static final String DEAL_TYPE = "HANDLE_STATUS";

	/** 客户端 */
	public static final String CLIENT_TYPE = "CLIENT_TYPE";

	/** 内容分类 */
	public static final String CONTENT_CLASS = "CONTENT_CLASS";
	/** 内容分类_SUB1 */
	public static final String CONTENT_CLASS_SUB1 = "CONTENT_CLASS_SUB1";
	/** 内容分类_SUB2 */
	public static final String CONTENT_CLASS_SUB2 = "CONTENT_CLASS_SUB2";
	/** 内容分类_SUB3 */
	public static final String CONTENT_CLASS_SUB3 = "CONTENT_CLASS_SUB3";
	/** 内容分类_SUB4 */
	public static final String CONTENT_CLASS_SUB4 = "CONTENT_CLASS_SUB4";
	/** 内容分类_SUB50 */
	public static final String CONTENT_CLASS_SUB50 = "CONTENT_CLASS_SUB50";
	/** 内容分类_SUB60 */
	public static final String CONTENT_CLASS_SUB60 = "CONTENT_CLASS_SUB60";
	
	/** 内容分类_SUB1 */
        public static final String CONTENT_CLASS_SUB1_1 = "CONTENT_CLASS_SUB1_1";

	/** 允许联系 */
	public static final String ALLOW_CONTACT_KEY = "ALLOW_CONTACT";

	/** 发布状态 */
	public static final String RELEASE_STATUS = "RELEASE_STATUS";
    
}
