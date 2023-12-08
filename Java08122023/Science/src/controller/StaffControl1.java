package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import service.StaffOperation;
import service.StudentOperation;

/**
 * Servlet implementation class StaffControl1
 */
@WebServlet("/StaffControl1")
public class StaffControl1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffControl1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in staffcontrol 1 get");
		String id = request.getParameter("studid");
		System.out.println("Student id:"+id);
		StaffOperation st = new StaffOperation();
		int status = st.DeleteStudent(id);
		if(status==1) {
			System.out.println("successfully deleted");
			response.sendRedirect("StaffControl");
		}
		else {
			response.sendRedirect("ScienceWrong.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("You are in staff control 1");
		Student student = new Student();
		student.setStaffId(request.getParameter("staffid"));
		student.setName(request.getParameter("name"));
		student.setEmail(request.getParameter("email"));
		student.setPhone(request.getParameter("phone"));
		student.setDepartment(request.getParameter("department"));
		student.setJoinYear(request.getParameter("year"));
		student.setJoinSem(request.getParameter("sem"));
		student.setUser(request.getParameter("user"));
		student.setPassword(request.getParameter("password"));
		StaffOperation so = new StaffOperation();
		int a=so.newStudent(student);
		if(a==1) {
			System.out.println("student successfully added");
			response.sendRedirect("StaffControl");
		}
		else {
			System.out.println("Some thing went wrong");
			response.sendRedirect("ScienceWrong.html");
		}
	}

}
