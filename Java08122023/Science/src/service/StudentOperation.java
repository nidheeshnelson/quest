package service;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Student;

public class StudentOperation {
	public Student studentlogin(String id) {
		System.out.println("In studentLogin "+id);
		
		Student student = new Student();
		try {
			System.out.println("in try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
			System.out.println("connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student inner join mark on mark.studid = student.id inner join login on login.studid=student.id where id='"+id+"'");
			System.out.println("result set complete");
		while(rs.next()){
			System.out.println("in while");
			student.setId(rs.getString("id"));
			student.setName(rs.getString("name"));
			student.setEmail(rs.getString("email"));
			student.setPhone(rs.getString("phone"));
			student.setDepartment(rs.getString("department"));
			student.setJoinYear(rs.getString("joinyear"));
			student.setJoinSem(rs.getString("joinsem"));
			student.setUser(rs.getString("user"));
			student.setPassword(rs.getString("password"));
			student.setMarkId(rs.getString("markid"));
			student.setStudId(rs.getString("studid"));
			student.setSem(rs.getString("sem"));
			student.setSub1(rs.getString("sub1"));
			student.setSub2(rs.getString("sub2"));
			student.setSub3(rs.getString("sub3"));
			student.setSub4(rs.getString("sub4"));
			student.setSub5(rs.getString("sub5"));
			System.out.println(student.getName());
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return student;
	}

}
