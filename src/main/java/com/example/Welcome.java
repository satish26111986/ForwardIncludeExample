package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.err.println("Request"+request.getAttribute("Hello"));
        //System.err.println("response"+response.getHeader("Header"));
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<h2>Welcome user</h2>");
        } finally {            
            out.close();
        }
    }

}
