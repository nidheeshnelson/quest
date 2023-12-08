package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Staff;
import service.LoginOperation;
import service.StaffOperation;

/**
 * Servlet implementation class StaffControl
 */
@WebServlet("/StaffControl")
public class StaffControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		Staff staff= (Staff) session.getAttribute("staff data");
		PrintWriter pw =response.getWriter();
		pw.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Science Staff</title>\r\n" + 
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
				"                    <div class=\"signin\"><a href=\"ScienceSignin.html\" style=\"text-decoration: none; color:#01035c;\">SignOut</a></div>\r\n" + 
				"                    <div class=\"new\"><a href=\"StaffControl5?uh="+staff.getId()+"\" style=\"text-decoration: none; color:#01035c;\">"+staff.getName()+"</a></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </nav>\r\n" + 
				"        <div class=\"body\">\r\n" + 
				"                        <div>\r\n" + 
				"                            <img src=\"Students.jpg\" alt=\"\" class=\"image1\">\r\n" + 
				"                        </div>\r\n" + 
				"                        <div class=\"options\">\r\n" + 
				"                            <ul>\r\n" + 
				"                                <li><a href=\"StaffControl9?staffid="+staff.getId()+"\">Add Student</a> </li>\r\n" + 
				"                                <li><a href=\"StaffControl2?staffid="+staff.getId()+"\">Add Marks</a></li>\r\n" + 
				"                                <li><a href=\"StaffControl3?staffid="+staff.getId()+"\">View Student</a></li>\r\n" + 
				"                                <li><a href=\"StaffControl7?staffid="+staff.getId()+"\">Edit Student</a></li>\r\n" + 
				"                                <li><a href=\"StaffControl10?staffid="+staff.getId()+"\">Delete Student</a></li>\r\n" +
				"                            </ul>\r\n" + 
				"                        </div>\r\n" + 
				"                        <div class=\"social\">\r\n" + 
				"                            <ul>\r\n" + 
				"                                <li><a href=\"https://web.whatsapp.com\">WhatsApp</a></li>\r\n" + 
				"                                <li><a href=\"https://web.telegram.org\">Telegram</a></li>\r\n" + 
				"                                <li><a href=\"https://meet.google.com\">Google Meet</a></li>\r\n" + 
				"                                <li><a href=\"https://en.m.wikipedia.org\">FaceBook</a></li>\r\n" + 
				"                                <li><a href=\"https://www.linkedin.com\">LinkedIn</a></li>\r\n" +
				"                            </ul>\r\n" + 
				"                        </div>\r\n" + 
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
		
		System.out.println("hi");
	Staff staff = new Staff();
	staff.setName(request.getParameter("name"));
	staff.setDepartment(request.getParameter("department"));
	staff.setEmail(request.getParameter("email"));
	staff.setPhone(request.getParameter("phone"));
	staff.setUser(request.getParameter("user"));
	staff.setPassword(request.getParameter("password"));
	System.out.println(request.getParameter("password"));
	System.out.println(request.getParameter("email"));
	System.out.println("values");
	PrintWriter out= response.getWriter();
	
	StaffOperation so = new StaffOperation();
	int status=so.staffAdd(staff);
	System.out.println(status);
	
	if(status==1) {
		LoginOperation lo = new LoginOperation();
		String a =staff.getId();
		System.out.println("id from staff control"+a);
		int status1=lo.staffAdd(staff);
		if(status1==1)
		{
			response.sendRedirect("ScienceSignin.html");
		}
		else {
			response.sendRedirect("ScienceWrong.html");
		}
	}
	else {
		response.sendRedirect("ScienceWrong.html");
	}
	
	

}
}
