package com.datastore;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataStore
 */
@WebServlet("/DataStore")
public class DataStore extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DataStore() {
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
		System.out.println("post in");
		String name = request.getParameter("name");
		System.out.println(name);
		String age = request.getParameter("age");
		System.out.println(age);
		String place = request.getParameter("place");
		System.out.println(place);
		String job = request.getParameter("job");
		System.out.println(job);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		String address = request.getParameter("address");
		System.out.println(address);
		String password = request.getParameter("password");
		System.out.println(password);
		
		try {
			System.out.println("try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datastore","root","Nidheesh@3N7");
			System.out.println("connection");
			PreparedStatement stmt = con.prepareStatement("insert into datastoretable(name, age, place, job, phone, address, password) values('"+name+"','"+age+"','"+place+"','"+job+"','"+phone+"','"+address+"','"+password+"')");
			System.out.println("stmt");
			int a = stmt.executeUpdate();
			if(a==1)
			{
				System.out.println("Success");
				response.sendRedirect("Login.html");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
