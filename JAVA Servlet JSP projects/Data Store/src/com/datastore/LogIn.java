package com.datastore;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogIn
 */
@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
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
		String phone = request.getParameter("phone");
		System.out.println(phone);
		String password = request.getParameter("password");
		System.out.println(password);
		
		try {
			System.out.println("try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datastore","root","Nidheesh@3N7");
		System.out.println("con");
		Statement stmt = con.createStatement();
		System.out.println("stmt");
		ResultSet rs = stmt.executeQuery("select * from datastoretable where phone = '"+phone+"' and password = '"+password+"'");
		
		while(rs.next())
		{
			int id = rs.getInt("id");
			System.out.println(id);
			
			HttpSession session = request.getSession();
			session.setAttribute("idvalue",id);
			response.sendRedirect("Profile");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
