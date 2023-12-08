package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import model.Staff;
import model.Student;
import service.LoginOperation;
import service.StaffOperation;
import service.StudentOperation;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Login login=new Login();
		login.setUser(request.getParameter("user"));
		login.setPassword(request.getParameter("password"));
		//System.out.println(request.getParameter("user")+" : "+request.getParameter("password"));
	
		LoginOperation lo = new LoginOperation();
		String status=lo.logIn(login);
		//int stat=(int)status.charAt(0);
		String stat=status.substring(0,1);
		int sta=Integer.parseInt(stat);
		status=status.substring(1);
		//System.out.println("sta:"+sta+" status:"+status);
		//char[] stat = status.toCharArray();
		//System.out.println("Status: "+status+":"+stat);
		StudentOperation so = new StudentOperation();
		StaffOperation st = new StaffOperation();
		HttpSession session=request.getSession();
		
		if(sta==1) {
			//System.out.println("Student1");
			Student student=so.studentlogin(status);
			//System.out.println("in login control");
			//System.out.println(student.getName());
			session.setAttribute("student data", student);
			response.sendRedirect("StudentControl");
		}
		else if(sta==2){
			//System.out.println("staff2");
			Staff staff=st.staffLogin(status);
			session.setAttribute("staff data", staff);
			response.sendRedirect("StaffControl");
		}
		else {
			//System.out.println("wrong");
			response.sendRedirect("ScienceInvalidEntry.html");
		}
	}

}
