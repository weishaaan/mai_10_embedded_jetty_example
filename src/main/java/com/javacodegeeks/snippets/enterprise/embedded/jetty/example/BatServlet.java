package com.javacodegeeks.snippets.enterprise.embedded.jetty.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

public class BatServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
        Test_property r = new Test_property();          
        //r.createProperties();        
        String filepath = r.readProperties();
        //System.out.println(filepath);
        //r.runBatFile(filepath);
                        
	resp.setStatus(HttpStatus.OK_200);
	resp.getWriter().println(r.runBatFile(filepath));      
   }
}
