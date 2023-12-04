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
 * Servlet implementation class StaffControl8
 */
@WebServlet("/StaffControl8")
public class StaffControl8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		StaffOperation so = new StaffOperation();
		ResultSet rs = so.studentEdit(id);
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Student</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" );
				try {
					while(rs.next()) {
				out.print("    <form action=\"StaffControl8?id="+rs.getString("id")+"\" method=\"post\">\r\n" +
			    "        <nav>\r\n" +
				"            <div class=\"nav\">\r\n" + 
				"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
				"                <div class=\"name\">\r\n" + 
				"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
				"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"account\">\r\n" + 
				"                    <div class=\"signin\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl7\" style=\"text-decoration: none; color:#01035c;\">Back</a></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </nav>\r\n" + 
				"        <div class=\"body\">\r\n" + 
				"                        \r\n" + 
				"                        <div id=\"signin\">\r\n" + 
				"                            <div id=\"photo\"><img src=\"graduation (1).png\" alt=\"\"></div>\r\n" + 
				"                            <div id=\"table\">\r\n" + 
				"                                <table>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <th colspan=\"2\">About student</th>\r\n" + 
				"                                    </tr>\r\n" +
				"                                    <tr>\r\n" + 
				"                                        <td>Student id</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("id")+"\" type=\"button\" name=\"id\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Full name</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("name")+"\" type=\"text\" name=\"name\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Email id</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("email")+"\" type=\"text\" name=\"email\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Phone number</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("phone")+"\" type=\"text\" name=\"phone\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Department</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("department")+"\" type=\"text\" name=\"department\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Year of join</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("joinyear")+"\" type=\"text\" name=\"year\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Semester of join</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("joinsem")+"\" type=\"text\" name=\"sem\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Username</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("user")+"\" type=\"text\" name=\"user\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Password</td>\r\n" + 
				"                                        <td><input value=\""+rs.getString("password")+"\" type=\"text\" name=\"password\"></td>\r\n" + 
				"                                    </tr>\r\n" +
			    "                                    <tr>\r\n" + 
				"                                        <td colspan=\"2\"><input type=\"submit\" name=\"submit\" value=\"submit\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    </table>\r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"\r\n" + 
				"        </div>\r\n" + 
				"    </form>\r\n" );
					}}
				catch(Exception e) {
					System.out.println(e);
				}
						out.print(
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
		System.out.println("in post 8"+request.getParameter("id")+request.getParameter("name"));
		student.setId(request.getParameter("id"));
		student.setName(request.getParameter("name"));
		student.setPhone(request.getParameter("phone"));
		student.setEmail(request.getParameter("email"));
		student.setDepartment(request.getParameter("department"));
		student.setJoinYear(request.getParameter("year"));
		student.setJoinSem(request.getParameter("sem"));
		student.setUser(request.getParameter("user"));
		student.setPassword(request.getParameter("password"));
		StaffOperation so = new StaffOperation();
		int status=so.studentEdit(student);
		if(status==1) {
			response.sendRedirect("StaffControl");
		}
		else {
			response.sendRedirect("ScienceWrong.html");
		}
	}

}
