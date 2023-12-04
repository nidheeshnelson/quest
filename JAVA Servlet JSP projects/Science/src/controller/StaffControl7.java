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
 * Servlet implementation class StaffControl7
 */
@WebServlet("/StaffControl7")
public class StaffControl7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StaffOperation so = new StaffOperation();
		String staffid = request.getParameter("staffid");
		ResultSet rs = so.studentList(staffid);
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Student Edit</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"Science.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action=\"StaffControl8\" method=\"get\">\r\n" + 
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
				"                                    <tr><th colspan=\"3\"><h3>Student List</h3></th></tr>\r\n" +
				"                                    <tr> \r\n" + 
				"                                        <th>Student id</th>\r\n" + 
				"                                        <th>Student name</th>\r\n" + 
				"                                        <td>Edit student</td>\r\n" + 
				"                                    </tr>\r\n");
				try {
	while(rs.next()) {
	out.print(	"                                    <tr> \r\n" + 
				"                                        <td>"+rs.getString("id")+"</td>\r\n" + 
				"                                        <td>"+rs.getString("name")+"</td>\r\n" + 
				"                                        <td><a href=\"StaffControl8?id="+rs.getString("id")+"\" style=\"text-decoration: none; color:#01035c;\">Edit</a></td>\r\n" + 
				"                                    </tr>\r\n");
	}}
				catch(Exception e) {
					System.out.println(e);
				}
	  out.print("                                </table>\r\n" + 
				"                               \r\n" + 
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
