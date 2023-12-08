package Website;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		doGet(request, response);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		Long phon = Long.parseLong(phone);
		System.out.println(phon);
		String password = request.getParameter("password");
		System.out.println(password);
		int id;
		PrintWriter out=response.getWriter();
		try
		{
			
			System.out.println("n1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("n2");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/website","root","Nidheesh@3N7");
			System.out.println("n3");
			Statement stmt = con.createStatement();
			System.out.println("n4");
			ResultSet rs = stmt.executeQuery("select * from websitetable where phone = '"+phon+"' and password = '"+password+"'");
			System.out.println("success");
			while(rs.next())
			{
				String a = rs.getString("data1");
				 id=rs.getInt("id");
				System.out.println(id);
				
				HttpSession session=request.getSession();
				session.setAttribute("idValue", id);
				response.sendRedirect("Profile");
						
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
