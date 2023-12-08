package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StaffControl9
 */
@WebServlet("/StaffControl9")
public class StaffControl9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String staffid=request.getParameter("staffid");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Add 1</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action=\"StaffControl1?staffid="+staffid+"\" method=\"post\">\r\n" + 
				"        <nav>\r\n" + 
				"            <div class=\"nav\">\r\n" + 
				"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
				"                <div class=\"name\">\r\n" + 
				"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
				"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"account\">\r\n" + 
				"                    <div class=\"signin\"><a href=\"StaffControl3?staffid="+staffid+"\" style=\"text-decoration: none; color:#01035c;\">View</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </nav>\r\n" + 
				"        <div class=\"body\">\r\n" + 
				"                        \r\n" + 
				"                        <div id=\"signin\">\r\n" + 
				"                            <div id=\"photo\"><img src=\"graduated.png\" alt=\"\"></div>\r\n" + 
				"                            <div id=\"table\">\r\n" + 
				"                                <table>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        \r\n" + 
				"                                        <th colspan=\"2\">Add student details</th>\r\n" + 
				"                                        <td></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Full name</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"name\" id=\"name\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Email id</td>\r\n" + 
				"                                        <td><input type=\"email\" name=\"email\" id=\"email\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Phone number</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"phone\" id=\"phone\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Department</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"department\" id=\"department\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Year of join</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"year\" id=\"year\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Semester of join</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sem\" id=\"sem\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Username</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"user\" id=\"user\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Password</td>\r\n" + 
				"                                        <td><input type=\"password\" name=\"password\" id=\"password\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td colspan=\"2\"><input type=\"submit\" style=\"font-size:25px; font-family: sans-serif; background-color: rgb(48, 48, 107); color: white; padding: 4px 4px;margin-left: 70px;margin-top: 15%;\"></td>\r\n" + 
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
