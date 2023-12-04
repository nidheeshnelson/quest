package com.projectservlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.math.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String age = request.getParameter("age");
		int ag =Integer.parseInt(age);
		String dob = request.getParameter("dob");
		String place = request.getParameter("place");
		String phone = request.getParameter("phone");
		long phon = Long.parseLong(phone);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		int id = 0;
		System.out.println(ag);
		System.out.println(phon);
		try
		{
			System.out.println("fine1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("fine2");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectservlet","root","Nidheesh@3N7");
			System.out.println("fine3");
			PreparedStatement stmt = con.prepareStatement("insert into servlettable(firstname, lastname, age, dob, place, phone, email, password) values('"+firstname+"', '"+lastname+"', '"+ag+"', '"+dob+"', '"+place+"', '"+phon+"', '"+email+"', '"+password+"')");
			System.out.println("fine4");
			int i = stmt.executeUpdate();
		if(i==1)
		{
			System.out.println("Successs");
			response.sendRedirect("Login.html");
			
		}
		else
		{
			System.out.println("Not Sucess");
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
