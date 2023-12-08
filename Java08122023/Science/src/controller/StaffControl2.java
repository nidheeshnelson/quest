package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import service.StaffOperation;

/**
 * Servlet implementation class StaffControl2
 */
@WebServlet("/StaffControl2")
public class StaffControl2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		StaffOperation so = new StaffOperation();
//		student.setId(request.getParameter("id1"));
//		student.setEmail(request.getParameter("email"));
//		student.setPhone(request.getParameter("phone"));
//		student.setUser(request.getParameter("user"));
//		student.setPassword(request.getParameter("password"));
//		int status=so.edit(student);
//		if(status==1) {
//			System.out.println("Success");
//			response.sendRedirect("ScienceEdit.html");
//		}
//		else{
//			System.out.println("fail");
//			response.sendRedirect("ScienceSignin.html");
//		}
		
		PrintWriter out = response.getWriter();
		String staffid = request.getParameter("staffid");
		System.out.println("staff id in staffcontrol get:"+staffid);
		StaffOperation so = new StaffOperation();
		ResultSet rs=so.studentList(staffid);
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Mark</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action=\"StaffControl4?staffid="+staffid+"\" method=\"get\">\r\n" + 
				"        <nav>\r\n" + 
				"            <div class=\"nav\">\r\n" + 
				"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
				"                <div class=\"name\">\r\n" + 
				"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
				"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"account\">\r\n" + 
				"                    <div class=\"signin\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl3?staffid="+staffid+"\" style=\"text-decoration: none; color:#01035c;\">View</a></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </nav>\r\n" + 
				"        <div class=\"body\">\r\n" + 
				"                        \r\n" + 
				"                        <div id=\"signin\">\r\n" + 
				"                            <div id=\"photo\"><img src=\"process.png\" alt=\"\"></div>\r\n" + 
				"                            <div id=\"table\">\r\n" + 
				"                                <table>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <th colspan=\"3\"><h3>Student List</h3></th>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <th>Student ID</th>\r\n" + 
				"                                        <th>Student Name</th>\r\n" + 
				"                                        <th>Add Mark</th>\r\n" + 
				"                                    </tr>\r\n" );
				try {
					
				while(rs.next()) {
	out.print("                                    <tr>\r\n" + 
				"                                        <td>"+rs.getString("id")+"</td>\r\n" + 
				"                                        <td>"+rs.getString("name")+"</td>\r\n" + 
				"                                        <td><a href=\"StaffControl4?id="+rs.getString("id")+"&staffid="+staffid+"\"style=\"text-decoration: none; color:#01035c;\">Add</a></td>\r\n" + 
				"                                    </tr>\r\n" );
				}}catch(Exception e) {
					System.out.println(e);
				}
				out.print("                                </table>\r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"\r\n" + 
				"        </div>\r\n" + 
				"    </form>\r\n" + 
				"    <script src=\"Science.js\"></script>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setStudId(request.getParameter("id"));
		student.setStaffId(request.getParameter("staffid"));
		student.setSem(request.getParameter("sem"));
		student.setSub1(request.getParameter("sub1"));
		student.setSub2(request.getParameter("sub2"));
		student.setSub3(request.getParameter("sub3"));
		student.setSub4(request.getParameter("sub4"));
		student.setSub5(request.getParameter("sub5"));
		StaffOperation so = new StaffOperation();
		int status=so.MarksAdd(student);
		if(status==1) {
			System.out.println("Successfully marks entered");
			response.sendRedirect("StaffControl");
		}
	}

}
