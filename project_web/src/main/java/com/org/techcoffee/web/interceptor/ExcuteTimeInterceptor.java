package com.org.techcoffee.web.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.org.techcoffee.base.util.BaseUtils;

/**
 * 对controller进行监控，超过时间的进行警告
 * 
 * @author Ron.Lin
 *
 */
public class ExcuteTimeInterceptor extends BaseUtils implements HandlerInterceptor {

	private List<String> allowUrls = new ArrayList<String>();

	private long underTime = 0;

	public List<String> getAllowUrls() {
		return allowUrls;
	}

	public void setAllowUrls(List<String> allowUrls) {
		this.allowUrls = allowUrls;
	}

	public long getUnderTime() {
		return underTime;
	}

	public void setUnderTime(long underTime) {
		this.underTime = underTime;
	}

	private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("WatchExecuteTime");

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 执行前
		long beginTime = System.currentTimeMillis();
		startTimeThreadLocal.set(beginTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {


	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 执行后
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTimeThreadLocal.get();
		if (executeTime > underTime) {
			logger.warn(String.format("%s execute %d ms.", request.getRequestURI(), executeTime));
		}
	}

}
