package com.logictech.dwzq.core.constants;

/**
 * @ClassName: Constants
 * @Description: 公共常量
 * @author
 */
public class SERConstants {

    //============  错误代码    =================
    /** 处理结果 1:成功 */
    public static final int     RESULT_SUCCESS                 = 1;

    /** 处理结果 0:失败 */
    public static final int     RESULT_ERROR                   = 0;

    /** 处理结果 9:更新0件、没数据 */
    public static final int     RESULT_NO_DATA                 = 9;

    // ============ 自定义常量 =================
    /** 删除标识: 0 未删除 */
    public static final int     CODE_FLG_NO_DELETE             = 0;

    /** 删除标识: 1 删除 */
    public static final int     CODE_FLG_HAS_DELETED           = 1;

    /** 是否可用: 0 不可用 */
    public static final int     CODE_IS_USED_ZERO              = 0;

    /** 是否可用: 1 可用 */
    public static final int     CODE_IS_USED_ONE               = 1;

    /** 客户端: 0 手机端 */
    public static final String  CODE_MOBILE                    = "0";

    /** 客户端: 1 网页端 */
    public static final String  CODE_WEB                       = "1";

    /** editFlg 新规 */
    public static final String  CODE_EDIT_FLG_NEW              = "N";

    /** editFlg 查看 */
    public static final String  CODE_EDIT_FLG_READ             = "R";

    /** editFlg 编辑 */
    public static final String  CODE_EDIT_FLG_UPDATE           = "U";

    /** 发布Flg 发布 */
    public static final String  CODE_RELEASE_FLG_RELEASED      = "R";

    /** 发布Flg 未发布 */
    public static final String  CODE_RELEASE_FLG_UNPUBLISHED   = "U";

    /** 画面迁移来源 菜单 */
    public static final String  CODE_SOURCE_FLG_MENU           = "M";

    /** 画面迁移来源 画面 */
    public static final String  CODE_SOURCE_FLG_PAGE           = "P";

    /** 保留查询条件用 session key （问卷画面） */
    public static final String  CODE_SESSION_QUESTION          = "questionQuCond";

    /** 保留查询条件用 session key （内容画面） */
    public static final String  CODE_SESSION_CONTENT           = "contentQuCond";

    /** 保留查询条件用 session key （内容画面） */
    public static final String  CODE_SESSION_CONTENTS          = "contentQueCond";

    /** 保留查询条件用 session key （资讯画面） */
    public static final String  CODE_SESSION_NEWS              = "newsQuCond";

    /** 保留查询条件用 session key （广告信息画面） */
    public static final String  CODE_SESSION_ADVERT            = "advertQuCond";

    /** 保留查询条件 session key （商品兑换画面） */
    public static final String  CODE_SESSION_COMMODITY         = "commodityQuCond";

    /** 保留查询条件 session key （消息内容模板画面） */
    public static final String  CODE_SESSION_MESSAGE           = "messageQuCond";

    /** 保留查询条件 session key （会员管理画面） */
    public static final String  CODE_SESSION_MEMBER            = "memberQuCond";

    /** 保留查询条件用 session key （系统配置信息维护画面） */
    public static final String  CODE_SESSION_PARAMS            = "systemSettingQuCondDto";

    /** 保留查询条件用 session key （产品信息维护画面） */
    public static final String  CODE_SESSION_PRODUCTS          = "productBaseInfoQuCondDto";

    /** 保留查询条件用 session key （组合信息维护画面） */
    public static final String  CODE_SESSION_PORTFOLIO         = "portfolioSettingQuCondDto";

    /** 保留查询条件用 session key （组合信息历史画面） */
    public static final String  CODE_SESSION_PORTFOLIO_HISTORY = "portfolioSettingHistoryQuCondDto";

    /** 保留查询条件用 session key （版本画面） */
    public static final String  CODE_SESSION_VERSION           = "systemVersion";

    /** 保留查询条件用 session key （批处理画面） */
    public static final String  CODE_SESSION_BATCH             = "batchInfoQuCondDto";

    /** 保留查询条件用 session key （敏感词画面） */
    public static final String  CODE_SESSION_SENSITIVITY       = "sensitivityQuCond";

    /** 保留查询条件用 session key （关键词画面） */
    public static final String  CODE_SESSION_KEYWORD           = "keywordQuCond";

    /** 保留查询条件用 session key （热词画面） */
    public static final String  CODE_SESSION_HOTWORD           = "hotwordQuCond";

    /** 保留查询条件用 session key （反馈画面） */
    public static final String  CODE_SESSION_USER_ADVICE       = "userAdviceQuCondDto";

    public static final String  CODE_SESSION_MASTERINFO        = "masterInfoQuCond";

    public static final String  CODE_SESSION_USERADVICE        = "userAdviceQuCond";

    /** 保留查询条件用 session key (系统公告画面) */
    public static final String  CODE_SESSION_NOTICE            = "noticeQuCond";

    /** 保留查询条件用 session key (沪深300画面) */
    public static final String  CODE_SESSION_HSINDEX           = "hsIndexQuCond";

    /** 保留查询条件用 session key (注册黑名单画面) */
    public static final String  CODE_SESSION_BLACKLIST         = "blacklistQuCondDto";

    /** 保留查询条件用 session key (产品公告画面) */
    public static final String  CODE_SESSION_PRODUCTNOTICE     = "productNoticeCondDto";

    /** 保留查询条件用 session key （广告信息画面） */
    public static final String  CODE_SESSION_ADVERT_SORT       = "advertisingSortQuCondDto";

    /** 保留查询条件用 session key （投顾信息画面） */
    public static final String  CODE_SESSION_INVEST_ADVISER    = "investAdviser";

    /** 保留查询条件用 session key （除权除息信息画面） */
    public static final String  CODE_SESSION_XRDRLIST          = "xrdrListQuCondDto";

    /** 保留查询条件用 session key (软件下载画面)*/
    public static final String CODE_SESSION_XCWSOFTDOWN        = "xcwSoftDownQuCondDto";
    
    /** 保留查询条件用 session key （协议规则画面） */
    public static final String  CODE_SESSION_CONTRACT_SET      = "contractSetQuCondDto";

    /** 保留查询条件用 session key （消息中心画面） */
    public static final String  CODE_SESSION_MSG_CENTER        = "msgCenterQuCondDto";
    
    /** 保留查询条件用 session key （任务一览画面） */
    public static final String  CODE_SESSION_POINTS_TASK       = "pointsTaskQuCond";

    // ============== 日期格式 =================

    // ============== 固定文字 =================
    public static final String  QUESTION_NO                    = "题目序号";

    public static final String  QUESTION_ID                    = "题目ID";

    public static final String  CONTENT_ID                     = "内容ID";

    /** 商品 */
    public static final String  COMMODITY                      = "商品";

    public static final String  ADVERTISINGDETAIL_ID           = "广告详情ID";

    public static final String  ADVERTISING_ID                 = "广告ID";

    public static final String  VERSION_NO                     = "版本号";

    public static final String  BIG_TYPE                       = "CONTENT_CLASS";

    /** SORL table_name字段值 */
    public static final String  SOLRCONTENTTABLE               = "1";

    public static final String  SOLRREADTABLE                  = "2";

    public static final String  SOLRISSUETABLE                 = "3";

    /** SORL status删除值 */
    public static final Integer SOLRDELETESTATUS               = 2;

    /** 敏感词重复提示 */
    public static final String  SENSITIVITYMSG                 = "敏感字已经存在";

    /** 热词重复提示 */
    public static final String  HOTWORDMSG                     = "热词已经存在";

    /** 关键词重复提示 */
    public static final String  KEYWORDMSG                     = "关键词已经存在";

    public static final String  STOCK_CODE                     = "股票代码";

    public static final String  DEFAULT_PORTFOLIO_NAME         = "的组合";
}
