package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Login;
import model.Staff;

public class LoginOperation {
public int staffAdd(Staff staff) {
	System.out.println("in login operation");
	int status=0;
	try {
		System.out.println("in try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		Statement stm = con.createStatement();
		ResultSet rs=stm.executeQuery("select max(id) from staff");
		String d="";
		while(rs.next()) {
			d=rs.getString("max(id)");
		}
		String a=staff.getId();
		String b=staff.getUser();
		String c=staff.getPassword();
		System.out.println(a+":"+b+":"+c+":"+d);
		
		PreparedStatement stmt = con.prepareStatement("insert into login(staffid, user, password) values('"+d+"','"+staff.getUser()+"','"+staff.getPassword()+"')");
		status=stmt.executeUpdate();
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("Login status: "+status);
	return status;
}

public String logIn(Login login) {
	String status="0";
	String a=null;
	String studid=null;
	String staffid=null;
	
	try {
		System.out.println("in logIn try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from login where user='"+login.getUser()+"' and password='"+login.getPassword()+"'");
		
		while(rs.next()) {
			studid=rs.getString("studid");
			staffid=rs.getString("staffid");
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println(studid+":"+staffid);
	if(studid!=null && staffid==null) {
		System.out.println("Student");
		status="1"+studid;
		System.out.println(status);
		return status;
	}
	else if(studid==null && staffid!=null) {
		System.out.println("Staff");
		status="2"+staffid;
		System.out.println(status);
	return status;
	}
	else {
		System.out.println("error");
		return status;
	}
}
}
