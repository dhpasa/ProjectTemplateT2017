package com.logictech.dwzq.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class ServerSessionFilter extends HttpServlet implements Filter {
    private static final long serialVersionUID = 971941706461445378L;

    private FilterConfig      filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
            ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String uri = req.getRequestURI();
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        boolean doFilter = true;
        String[] exceptStr = filterConfig.getInitParameter("except").split(",");
        for (String s : exceptStr) {
            if (uri.indexOf(s) != -1) {
                doFilter = false;
                break;
            }
        }
        if (doFilter) {
            // 从session中获取登录者实体
            Object obj = session.getAttribute("operator");//TODO
            if (uri.indexOf(".") > 0 && uri.indexOf(".jsp") < 0) {
                filterChain.doFilter(request, response);
            }
            else if (null == obj || ((Operators) obj) == null) {//TODO
                // 如果session中不存在登录者实体，则弹出框提示重新登录
                // 设置request和response的字符集，防止乱码
                // 如果是ajax请求响应头会有，x-requested-with；
                if (req.getHeader("x-requested-with") != null
                        && req.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                    res.setHeader("sessionstatus", "timeout");// 在响应头设置session状态
                    return;
                }
                req.getRequestDispatcher("/login/index").forward(req, res);
            }
            else {
                if ((req.getContextPath()).equals(req.getRequestURI())
                        || (req.getContextPath() + "/").equals(req.getRequestURI())) {
                    req.getRequestDispatcher("/login/index").forward(req, res);
                }
                else {
                    // 如果session中存在登录者实体，则继续
                    filterChain.doFilter(request, response);
                }
            }
        }
        else {
            filterChain.doFilter(request, response);
        }
    }
}
