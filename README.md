# tech-coffee 框架模板

##技术栈

`springmvc` `mybatis` .......

##重构内容
###spring mybatis 改用最新的release版本包。
###工程全局异常的配置，取消controller捕获异常，可实现异常的统一处理。
###废弃log4j改用logback进行log管理。可以实现日志的扩展
###web.xml中配置sql语句监控画面 druid/sql.html。（可观察sql执行耗时）
###获取工程配置信息优化。所有调用的地方都用BaseUtils 下的方法。
###监控指定controller时长，超过警告时间则输出log。

