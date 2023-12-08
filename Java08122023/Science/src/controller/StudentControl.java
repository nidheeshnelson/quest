package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;

/**
 * Servlet implementation class StudentControl
 */
@WebServlet("/StudentControl")
public class StudentControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	HttpSession session = request.getSession(false);
	Student student=(Student) session.getAttribute("student data");
	System.out.println("in student control");
	System.out.println(student.getName());
	PrintWriter pw = response.getWriter();
	pw.print("<!DOCTYPE html>\r\n" + 
			"<html lang=\"en\">\r\n" + 
			"<head>\r\n" + 
			"    <meta charset=\"UTF-8\">\r\n" + 
			"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
			"    <title>Science Student</title>\r\n" + 
			"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"    <form action=\"\" method=\"\">\r\n" + 
			"        <nav>\r\n" + 
			"            <div class=\"nav\">\r\n" + 
			"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
			"                <div class=\"name\">\r\n" + 
			"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
			"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
			"                </div>\r\n" + 
			"                <div class=\"account\">\r\n" + 
			"                    <div class=\"signin\"><a href=\"ScienceHome.html\" style=\"text-decoration: none; color:#01035c;\">Home</a></div>\r\n" + 
			"                    <div class=\"new\"><a href=\"ScienceSignin.html\" style=\"text-decoration: none; color:#01035c;\">SignOut</a></div>\r\n" + 
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
			"                                        <th>Hi "+student.getName()+"</th>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Your id</td>\r\n" + 
			"                                        <td>"+student.getId()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Full name</td>\r\n" + 
			"                                        <td>"+student.getName()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Email id</td>\r\n" + 
			"                                        <td>"+student.getEmail()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Phone number</td>\r\n" + 
			"                                        <td>"+student.getPhone()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Department</td>\r\n" + 
			"                                        <td>"+student.getDepartment()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Year of join</td>\r\n" + 
			"                                        <td>"+student.getJoinYear()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Semester of join</td>\r\n" + 
			"                                        <td>"+student.getJoinSem()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td><h3>Your marks in this sem</h3></td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Mark id</td>\r\n" + 
			"                                        <td>"+student.getMarkId()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Sub1</td>\r\n" + 
			"                                        <td>"+student.getSub1()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Sub2</td>\r\n" + 
			"                                        <td>"+student.getSub2()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Sub3</td>\r\n" + 
			"                                        <td>"+student.getSub3()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Sub4</td>\r\n" + 
			"                                        <td>"+student.getSub4()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                        <td>Sub5</td>\r\n" + 
			"                                        <td>"+student.getSub5()+"</td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                </table>\r\n" + 
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
		
	}

}
