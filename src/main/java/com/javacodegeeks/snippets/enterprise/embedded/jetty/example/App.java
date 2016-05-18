package com.javacodegeeks.snippets.enterprise.embedded.jetty.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

//the tutorial is on the https://examples.javacodegeeks.com/enterprise-java/jetty/jetty-tutorial-beginners/
public class App {
    public static void main( String[] args ) throws Exception{
        Server server = new Server(7070);
	ServletContextHandler handler = new ServletContextHandler(server, "/bat");
	handler.addServlet(BatServlet.class, "/");
        
	server.start();

    }
}
