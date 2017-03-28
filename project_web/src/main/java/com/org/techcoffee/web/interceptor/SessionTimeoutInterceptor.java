package com.org.techcoffee.web.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.alibaba.druid.util.StringUtils;
import com.org.techcoffee.web.exception.SessionTimeoutException;

/**
 * 捕获session是否超时
 * @author Ron.Lin
 *
 */
public class SessionTimeoutInterceptor implements HandlerInterceptor {

    private List<String> allowUrls = new ArrayList<String>();

    public List<String> getAllowUrls() {
        return allowUrls;
    }

    public void setAllowUrls(List<String> allowUrls) {
        this.allowUrls = allowUrls;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestUrl = request.getRequestURI();
        for (String url : allowUrls) {
            if (requestUrl.endsWith(url)) {
                return true;
            }
        }
        String session = (String) WebUtils.getSessionAttribute(request, "");
        if (StringUtils.isEmpty(session)) {
            throw new SessionTimeoutException();
        }
        else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

        if (modelAndView != null) {
            modelAndView.addObject("userName", "");
        }
        
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        
    }

}
