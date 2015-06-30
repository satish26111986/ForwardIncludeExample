package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     try {
         String name = request.getParameter("user");
        String password = request.getParameter("pass");//

        if(password.equals("studytonight"))
        {
        	
           RequestDispatcher rd = request.getRequestDispatcher("Welcome");
           request.setAttribute("Hello","studytonight");
           //response.setHeader("Header", "studytonight");
           //System.err.println("Request"+request);
           //System.err.println("Response"+response);
           rd.forward(request, response);
           out.println("<font color='red'><b>You have entered incorrect password</b></font>");
        }
        else
         {
                out.println("<font color='red'><b>You have entered incorrect password</b></font>");
                RequestDispatcher rd = request.getRequestDispatcher("Welcome");
                request.setAttribute("Hello","wrongpassword");
                rd.include(request, response);
            }
        }finally {            
            out.close();
        }
        
    }

}
