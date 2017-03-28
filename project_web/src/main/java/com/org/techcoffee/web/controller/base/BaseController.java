package com.org.techcoffee.web.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.org.techcoffee.base.util.BaseUtils;

public class BaseController extends BaseUtils{

	/**
	 * 全局捕获异常，其中一种B方案
	 * @param request
	 * @param ex
	 * @return
	 * @throws Exception 
	 */
	@ExceptionHandler
	public String exp(HttpServletRequest request, Exception ex) throws Exception {
		//request.setAttribute("ex", ex);
		// 这里可以做统一处理，如写入log,或者发信等等
		logger.error("message", ex);
		return "error";
	}
}
