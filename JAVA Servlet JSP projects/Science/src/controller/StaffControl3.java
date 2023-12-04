package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StaffOperation;

/**
 * Servlet implementation class StaffControl3
 */
@WebServlet("/StaffControl3")
public class StaffControl3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in staff control 3 get");
		PrintWriter pw = response.getWriter();
		String staffid=request.getParameter("staffid");
		StaffOperation so=new StaffOperation();
		ResultSet rs=so.allStudents(staffid);
			System.out.println("in try");
		System.out.println("in staffcontrol3");
		pw.print("<!DOCTYPE html>");
		pw.print("<html lang=\"en\">");
		    pw.print("<head>");
		    System.out.println("in head");
		        pw.print("<meta charset=\"UTF-8\">");
		        pw.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		        pw.print("<title>Science Vew 1</title>");
		        pw.print("<link rel=\"stylesheet\" href=\"Science.css\">");
		        pw.print("</head>");
		        pw.print("<body>");
		        System.out.println("in body");
		            pw.print("<form action=\"\" method=\"\">");
		                pw.print("<nav>");
		                    pw.print("<div class=\"nav\">");
		                        pw.print("<div class=\"emblem\"><img src=\"graduation.png\" alt=\"\"></div>");
		                        pw.print("<div class=\"name\">");
		                            pw.print("<div class=\"college\">Science School of Technology</div>");
		                            pw.print("<div class=\"moto\">Experiance the Beauty of Science</div>");
		                            pw.print("</div>");
		                            pw.print("<div class=\"account\">");
		                                pw.print("<div class=\"signin\"><a href=\"StaffControl7?staffid="+staffid+"\" style=\"text-decoration: none; color:#01035c;\">Edit</a></div>");
		                                pw.print("<div class=\"new\"><a href=\"StaffControl\" style=\"text-decoration: none; color:#01035c;\">Menu</a></div>");
		                                pw.print("</div>");
		                                pw.print("</div>");
		                                pw.print("</nav>");
		                                pw.print("<div class=\"body\">");
		                                    pw.print("<div id=\"signin\">");
		                                        pw.print("<div id=\"photo\"><img src=\"graduated.png\" alt=\"\"></div>");
		                                        pw.print("<div id=\"table\">");
		                                            pw.print("<table>");
		                                            System.out.println("in table");
		                                            try {
		                        while(rs.next()){
		                        	System.out.println("in while");
		                        	int i=1;
		                        	pw.print("<tr>");
	                                pw.print("<th colspan=\"2\">-----------------STUDENT:"+i+"------------------</th>");
	                                pw.print("</tr>");
		                            pw.print("<tr>");
		                                pw.print("<td>Student ID</td>");
		                                pw.print("<td>"+rs.getString("id")+"</td>");
		                                pw.print("</tr>");
		                                pw.print("<tr>");
		                                    pw.print("<td>Full Name</td>");
		                                    pw.print("<td>"+rs.getString("name")+"</td>");
		                                    pw.print("</tr>");
		                                    pw.print("<tr>");
		                                        pw.print("<td>Email id</td>");
		                                        pw.print("<td>"+rs.getString("email")+"</td>");
		                                        pw.print("</tr>");
		                                        pw.print("<tr>");
		                                            pw.print("<td>Phone Number</td>");
		                                            pw.print("<td>"+rs.getString("phone")+"</td>");
		                                            pw.print("</tr>");
		                                            pw.print("<tr>");
		                                                pw.print("<td>Department</td>");
		                                                pw.print("<td>"+rs.getString("department")+"</td>");
		                                                pw.print("</tr>");
		                                                pw.print("<tr>");
		                                                    pw.print("<td>Year of join</td>");
		                                                    pw.print("<td>"+rs.getString("joinyear")+"</td>");
		                                                    pw.print("</tr>");
		                                                    pw.print("<tr>");
		                                                        pw.print("<td>Semester of join</td>");
		                                                        pw.print("<td>"+rs.getString("joinsem")+"</td>");
		                                                        pw.print("</tr>");
		                                                        pw.print("<tr>");
		                                                            pw.print("<td>Login ID</td>");
		                                                            pw.print("<td>"+rs.getString("loginid")+"</td>");
		                                                            pw.print("</tr>");
		                                                            pw.print("<tr>");
		                                                            pw.print("<td>User Name</td>");
		                                                            pw.print("<td>"+rs.getString("user")+"</td>");
		                                                            pw.print("</tr>");
		                                                            pw.print("<tr>");
		                                                                pw.print("<td>Password</td>");
		                                                                pw.print("<td>"+rs.getString("password")+"</td>");
		                                                                pw.print("</tr>");
		                                                                pw.print("<tr>");
		                                                                    pw.print("<td colspan=\"2\"><h3>Marks in the sem </h3></td>");
		                                                                    pw.print("</tr>");
		                                                                    pw.print("<tr>");
		                                                                        pw.print("<td>Mark ID</td>");
		                                                                        pw.print("<td>"+rs.getString("markid")+"</td>");
		                                                                        pw.print("</tr>");
		                                                                        pw.print("<tr>");
		                                                                        pw.print("<td>Sub1</td>");
		                                                                        pw.print("<td>"+rs.getString("sub1")+"</td>");
		                                                                        pw.print("</tr>");
		                                                                        pw.print("<tr>");
		                                                                            pw.print("<td>Sub2</td>");
		                                                                            pw.print("<td>"+rs.getString("sub2")+"</td>");
		                                                                            pw.print("</tr>");
		                                                                            pw.print("<tr>");
		                                                                                pw.print("<td>Sub3</td>");
		                                                                                pw.print("<td>"+rs.getString("sub3")+"</td>");
		                                                                                pw.print("</tr>");
		                                                                                pw.print("<tr>");
		                                                                                    pw.print("<td>Sub4</td>");
		                                                                                    pw.print("<td>"+rs.getString("sub4")+"</td>");
		                                                                                    pw.print("</tr>");
		                                                                                    pw.print("<tr>");
		                                                                                        pw.print("<td>Sub5</td>");
		                                                                                        pw.print("<td>"+rs.getString("sub5")+"</td>");
		                                                                                        pw.print("<tr>\r\n" + 
		                                                                                        		"<td colspan=\"2\">_--_-_-_-_-_-_-LOADIND!!!_-_-_-_-_-_-_</td>\r\n" + 
		                                                                                        		"                                    </tr>");
		                                                                                        i++;
		                                }
		                                            }
		                                    		catch(Exception e) {
		                                    			System.out.println(e);
		                                    		}
		                                pw.print("</table>");
		                                pw.print("</div>");
		                                pw.print("</div>");
		                                pw.print("</div>");
		                                pw.print("</form>");
		                                pw.print("<script src=\"Science.js\"></script>");
		                                pw.print("</body>");
		                                pw.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
