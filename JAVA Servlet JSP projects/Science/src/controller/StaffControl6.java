 
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Staff;
import service.StaffOperation;

/**
 * Servlet implementation class StaffControl6
 */
@WebServlet("/StaffControl6")
public class StaffControl6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in StaffControl 6");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("uh");
		System.out.println("Staff control 6 id: "+id);
		StaffOperation so = new StaffOperation();
		Staff staff = new Staff();
		staff=so.staffLogin(id);
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Profile Edit</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action=\"StaffControl6\" method=\"post\">\r\n" + 
				"        <nav>\r\n" + 
				"            <div class=\"nav\">\r\n" + 
				"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
				"                <div class=\"name\">\r\n" + 
				"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
				"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"account\">\r\n" + 
				"                    <div class=\"signin\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl5?uh="+id+"\" style=\"text-decoration: none; color:#01035c;\">Back</a></div>\r\n" + 
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
				"                                        \r\n" + 
				"                                        <th colspan=\"2\">Staff Profile</th>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Full Name</td>\r\n" + 
				"                                        <td><input value=\""+staff.getName()+"\" type=\"text\" name=\"name\" id=\"name\"></td>\r\n" +
				"                                        <td><input value=\""+id+"\" type=\"hidden\" name=\"id\" id=\"id\"></td>\r\n" +
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Email id</td>\r\n" + 
				"                                        <td><input value=\""+staff.getEmail()+"\" type=\"email\" name=\"email\" id=\"email\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Phone Number</td>\r\n" + 
				"                                        <td><input value=\""+staff.getPhone()+"\" type=\"text\" name=\"phone\" id=\"phone\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>User Name</td>\r\n" + 
				"                                        <td><input value=\""+staff.getUser()+"\" type=\"text\" name=\"user\" id=\"user\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Password</td>\r\n" + 
				"                                        <td><input value=\""+staff.getPassword()+"\" type=\"password\" name=\"password\" id=\"password\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td colspan=\"2\"><input value=\"Submit\" type=\"submit\" style=\"font-size:25px; font-family: sans-serif; background-color: rgb(48, 48, 107); color: white; padding: 4px 4px;margin-left: 70px;margin-top: 15%;\"></td>\r\n" + 
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
		System.out.println("in Staff control post from get");
		Staff staff = new Staff();
		staff.setId(request.getParameter("id"));
		staff.setName(request.getParameter("name"));
		staff.setEmail(request.getParameter("email"));
		staff.setPhone(request.getParameter("phone"));
		staff.setUser(request.getParameter("user"));
		staff.setPassword(request.getParameter("password"));
		System.out.println(request.getParameter("id")+request.getParameter("name")+request.getParameter("email")+request.getParameter("phone")+request.getParameter("user")+request.getParameter("password"));
		StaffOperation so = new StaffOperation();
		int status=so.profileEdit(staff);
		if(status==1) {
			response.sendRedirect("StaffControl");
		}
		else {
			response.sendRedirect("ScienceWrong.html");
		}
	}

}
