package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StaffOperation;

/**
 * Servlet implementation class StaffControl4
 */
@WebServlet("/StaffControl4")
public class StaffControl4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in staff control 4 get");
		PrintWriter out=response.getWriter();
		String staffid = request.getParameter("staffid");
		System.out.println("staff id :"+staffid);
		String id=request.getParameter("id");
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Mark</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action=\"StaffControl2?staffid="+staffid+"\" method=\"post\">\r\n" + 
				"        <nav>\r\n" + 
				"            <div class=\"nav\">\r\n" + 
				"                <div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>\r\n" + 
				"                <div class=\"name\">\r\n" + 
				"                    <div class=\"college\">Science School of Technology</div>\r\n" + 
				"                    <div class=\"moto\">Experiance the Beauty of Science</div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"account\">\r\n" + 
				"                    <div class=\"signin\"><a href=\"StaffControl2?staffid="+staffid+"\" style=\"text-decoration: none; color:#01035c;\">Back</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>\r\n" + 
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
				"                                        \r\n" + 
				"                                        <th colspan=\"2\">Add Marks</th>\r\n" + 
				"                                        </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Student ID</td>\r\n" + 
				"                                        <td><input type=\"text\" value=\""+id+"\" name=\"id\" id=\"id\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>Semester</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sem\" id=\"sem\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>sub1</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sub1\" id=\"sub1\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>sub2</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sub2\" id=\"sub2\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>sub3</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sub3\" id=\"sub3\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>sub4</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sub4\" id=\"sub4\"></td>\r\n" + 
				"                                    </tr>\r\n" + 
				"                                    <tr>\r\n" + 
				"                                        <td>sub5</td>\r\n" + 
				"                                        <td><input type=\"text\" name=\"sub5\" id=\"sub5\"></td>\r\n" + 
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
