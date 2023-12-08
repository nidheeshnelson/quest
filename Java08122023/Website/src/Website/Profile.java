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
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Result");
	HttpSession session=request.getSession(false);
	String id=session.getAttribute("idValue").toString();
	System.out.println(id);
	
	String name = null;
	String place = null;
	String address = null;
	String job = null;
	Long phone = null ;
	
	PrintWriter out=response.getWriter();
	
	try
	{
		System.out.println("in try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("int1");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/website","root","Nidheesh@3N7");
		System.out.println("int2");
		Statement stmt = con.createStatement();
		System.out.println("int3");
		ResultSet rs = stmt.executeQuery("select * from websitetable where id = '"+id+"'");
		System.out.println("int4");
		while(rs.next())
		{
			name = rs.getString("data1");
			place = rs.getString("data2");
			address = rs.getString("data3");
			job = rs.getString("data4");
			phone = rs.getLong("phone");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	out.print("<!DOCTYPE html>\r\n" + 
			"<html lang=\"en\">\r\n" + 
			"<head>\r\n" + 
			"    <meta charset=\"UTF-8\">\r\n" + 
			"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
			"    <title>Your Page</title>\r\n" + 
			"    <link rel=\"stylesheet\" href=\"website.css\">\r\n" + 
			"    <link rel=\"stylesheet\" href=\"./css/bootstrap.css\">\r\n" + 
			"</head>\r\n" + 
			"<body style=\"background-color: rgb(215, 226, 226);\">\r\n" + 
			"    <form action=\"\" method=\"\">\r\n" + 
			"    <div class=\"container-fluid\" style=\"background-color: rgb(201, 199, 199); padding: 5px;\">\r\n" + 
			"        <div class=\"row\">\r\n" + 
			"        <div class=\"col-sm\"><button style=\"border: none; font-weight: 900; font-size: x-large; font-family:Brush Script MT; background-color: rgb(201, 199, 199);\"><a href=\"website.html\" style=\"color: black; text-decoration: none;\">Website</a></button></div> \r\n" + 
			"        <div class=\"col-sm\"><button style=\"border: none; font-family:Verdana; background-color: rgb(201, 199, 199); padding: 5px;\"><a href=\"home.html\" style=\"color: black; text-decoration: none;\">Home</a></button></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"></div>\r\n" + 
			"        <div class=\"col-sm\"><button style=\"border: none; font-family:Verdana; background-color: rgb(201, 199, 199); padding: 5px;\"><a href=\"signup.html\" style=\"color: black; text-decoration: none;\">SignUp</a></button></div>\r\n" + 
			"        <div class=\"col-sm\"><button style=\"border: none; font-family:Verdana; background-color: rgb(201, 199, 199); padding: 5px;\"><a href=\"login.html\" style=\"color: black; text-decoration: none;\">LogOut</a></button></div>    \r\n" + 
			"        </div>\r\n" + 
			"    </div>\r\n" + 
			"<div class=\"container\" style=\"background-color: rgb(131, 203, 206); margin-top: 50px;\">\r\n" + 
			"<div class=\"container\" style=\"font-family: Georgia; text-align: center;\">\r\n" + 
			"    <h3>Your Details</h3>\r\n" + 
			"    <table style=\"text-align: left; font-family: Copperplate; margin-left: auto; margin-right: auto;\">\r\n" + 
			"        <tr>\r\n" + 
			"            <td>Name :</td>\r\n" + 
			"            <td>'"+name+"'</td>\r\n" + 
			"        </tr>\r\n" + 
			"        <tr>\r\n" + 
			"            <td>Place :</td>\r\n" + 
			"            <td>'"+place+"'</td>\r\n" + 
			"        </tr>\r\n" + 
			"        <tr>\r\n" + 
			"            <td>Address :</td>\r\n" + 
			"            <td>'"+address+"'</td>\r\n" + 
			"        </tr>\r\n" + 
			"        <tr>\r\n" + 
			"            <td>Job :</td>\r\n" + 
			"            <td>'"+job+"'</td>\r\n" + 
			"        </tr>\r\n" + 
			"        <tr>\r\n" + 
			"            <td>Phone Number</td>\r\n" + 
			"            <td>'"+phone+"'</td>\r\n" + 
			"        </tr>\r\n" + 
			"        \r\n" + 
			"    </table>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"    </form>\r\n" + 
			"   \r\n" + 
			"    <script src=\"website.js\"></script>\r\n" + 
			"    <script src=\"./js/bootstrap.js\"></script>\r\n" + 
			"</body>\r\n" + 
			"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
