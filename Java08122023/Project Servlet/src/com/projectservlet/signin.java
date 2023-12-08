package com.projectservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class signin
 */
@WebServlet("/signin")
public class signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter obj = response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectservlet","root","Nidheesh@3N7");
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from servlettable where password = 11020110 and email = 'nidheeshnelson10@gmail.com'");
			
			while(rs.next())
			{

				obj.print("<!DOCTYPE html>\r\n" + 
						"<html lang=\"en\">\r\n" + 
						"<head>\r\n" + 
						"    <meta charset=\"UTF-8\">\r\n" + 
						"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"    <title>Project Servlet</title>\r\n" + 
						"    <link rel=\"stylesheet\" href=\"ProjectServlet.css\">\r\n" + 
						"</head>\r\n" + 
						"<body style=\"background-color: #00ccff;\">\r\n" + 
						"    <form action=\"MyServlet\" method=\"get\" style=\"margin-left: auto; margin-right: auto;\">\r\n" + 
						"   <nav style=\"background-color: #96a05f;\">\r\n" + 
						"    <button style=\"background-color:  #d9ff00;\">\r\n" + 
						"        <a href=\"#\" style=\"text-decoration: none; font-size: xx-large; font-weight:bolder; font-family: Brush Script MT; position: relative; padding: 15px;\">Project Servlet</a>\r\n" + 
						"    </button>\r\n" + 
						"    <button style=\"position: relative; background-color: #9fff50; border-radius: 10px;\">\r\n" + 
						"    <a href=\"ProjectServlet.html\" style=\"text-decoration:none; font-size:x-large; font-weight: bold; font-family:Georgia;\">Home</a>\r\n" + 
						"</button>\r\n" + 
						"<button style=\"float: right; position: relative; background-color: #e6b370;\">\r\n" + 
						"    <a href=\"LogIn.html\" style=\"text-decoration: none; font-size: larger; font-weight: 700;font-family:Georgia;\">Log In</a>\r\n" + 
						"</button>\r\n" + 
						"<button style=\"float: right; position: relative; background-color: #e6b370;\">\r\n" + 
						"    <a href=\"SignUp.html\" style=\"text-decoration: none; font-size: larger; font-weight: 700;font-family:Georgia;\">Sign Up</a>\r\n" + 
						"</button>   \r\n" + 
						"</nav>\r\n" + 
						"        <div style=\"margin-left: 30px; margin-top: 30px; margin-right: 30px; text-align: center; background-color: darkseagreen;\">\r\n" + 
						"            <h1 style=\"font-family: Arial; color: rgb(110, 36, 31);\">Hello "+rs.getString("firstname")+" "+rs.getString("lastname")+"</h1>\r\n" + 
						"            <h1 style=\"font-family: Arial; color: rgb(110, 36, 31);\">your id generated is "+rs.getInt("id")+"</h1>\r\n" + 
						"            <div style=\"font-family: 'Courier New';font-size:x-large; font-weight: 500;\">\r\n" + 
						"<table style=\"margin-left: auto; margin-right: auto; text-align: left;\">\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"firstname\">Your First Name</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" + 
						"        <td><label for=\\\"firstname\\\">"+rs.getString("firstname")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"lastname\">Your Last Name</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"lastname\\\">"+rs.getString("lastname")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"age\">Your Age</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"age\\\">"+rs.getInt("age")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"dob\">Your Date Of Birth</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"dob\\\">"+rs.getDate("dob")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"place\">Your Place</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"place\\\">"+rs.getString("place")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"phone\">Your Phone Number</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"phone\\\">"+rs.getLong("phone")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"    <tr>\r\n" + 
						"        <td><label for=\"email\">Your Email ID</label></td>\r\n" + 
						"<td><label for=\"firstname\"> : </label></td>\r\n" +
						"        <td><label for=\\\"email\\\">"+rs.getString("email")+"</label></td>\r\n" + 
						"    </tr>\r\n" + 
						"</table>\r\n" + 
						"            </div>\r\n" + 
						"        </div>\r\n" + 
						"    \r\n" + 
						"    </form>\r\n" + 
						"</body>\r\n" + 
						"</html>");
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
