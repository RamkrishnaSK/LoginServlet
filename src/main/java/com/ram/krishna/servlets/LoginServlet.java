package com.ram.krishna.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {
    private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) throws ServletException {

    }

    public void destroy() {

    }

    public ServletConfig getServletConfig() {

        return null;
    }

    public String getServletInfo() {

        return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to Servlet Sessions..!</h1>");
        out.println("<h4>Server Time is : </h4>" + new Date());
    }

}
