package com.github.charlie.launcher;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.github.charlie.web.CommonServlet;

/**
 * Example of using JSP's with embedded jetty and not requiring all of the
 * overhead of a WebAppContext
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(
                ServletContextHandler.SESSIONS);
        context.setContextPath("/jetty");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new CommonServlet()), "/servlet");
        server.start();
        server.join();
    }
}