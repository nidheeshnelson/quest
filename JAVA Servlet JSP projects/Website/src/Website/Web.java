package Website;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Web
 */
@WebServlet("/Web")
public class Web extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Web() {
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
		
System.out.println("DAtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String data1 = request.getParameter("data1");
		System.out.println(data1);
		String data2 = request.getParameter("data2");
		System.out.println(data2);
		String data3 = request.getParameter("data3");
		System.out.println(data3);
		String data4 = request.getParameter("data4");
		System.out.println(data4);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		long phon = Long.parseLong(phone);
		System.out.println(phone);
		String password = request.getParameter("password");
		System.out.println(password);
		
		try
		{
			System.out.println("m1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("m2");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/website","root","Nidheesh@3N7");
			System.out.println("m3");
			PreparedStatement stmt = con.prepareStatement("insert into websitetable(data1, data2, data3, data4, phone, password) values('"+data1+"','"+data2+"','"+data3+"','"+data4+"','"+phon+"','"+password+"')");
			int a = stmt.executeUpdate();
			if(a==1)
			{
				System.out.println("Success");
				response.sendRedirect("login.html");
			}
			else {
				System.out.println("not success");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
