package com.example.using.util.CorsConfigurerAdapter;

import org.apache.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CrossFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String origin= servletRequest.getRemoteHost()+":"+servletRequest.getRemotePort();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","POST,GET,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Headers", "Authentication,Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE");
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpStatus.SC_OK);
            // hresp.setContentLength(0);
            response.getWriter().write("OPTIONS returns OK");
            return;
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
    public void destroy() {

    }
}
