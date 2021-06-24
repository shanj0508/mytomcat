package com.demo.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.Enumeration;

//2、基于注解的Servlet配置方式。
//@WebServlet("/demo1")
public class MyServlet implements Servlet {
    public MyServlet() {
        //创建Servlet对象
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //ServletConfig：该接口是用来描述Servlet的基本信息的。
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("username"));
        Enumeration<String> enumeration = servletConfig.getInitParameterNames();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
            System.out.println(servletConfig.getInitParameter(element));
        }
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext.getServletContextName());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我是Servlet，我已经接收到了客户端发来的请求");
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("Hello,Client!客户端发来的请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
