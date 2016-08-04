package com.github.charlie.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 7939829037888289747L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("common servlet...");
        ServletOutputStream out = resp.getOutputStream();
        out.write("servlet".getBytes());
        out.flush();
        out.close();
    }

}
