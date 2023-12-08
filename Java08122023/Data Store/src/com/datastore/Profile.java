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
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("doget");
	HttpSession session = request.getSession(false);
	String id = session.getAttribute("idvalue").toString();
	System.out.println(id);
	
	String name = null;
	String age = null;
	String place = null;
	String job = null;
	String phone = null;
	String address = null;
	String password = null;
	
	try
	{
		System.out.println("try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datastore","root","Nidheesh@3N7");
	System.out.println("connect");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from datastoretable where id = '"+id+"'");
	while(rs.next())
	{
		name = rs.getString("name");
		age = rs.getString("age");
		place = rs.getString("place");
		job = rs.getString("job");
		phone = rs.getString("phone");
		address = rs.getString("address");
		password = rs.getString("password");
	}
	}
	catch(Exception e) {
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
