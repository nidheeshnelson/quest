package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Staff;
import model.Student;

public class StaffOperation {
	
public int staffAdd(Staff staff) {
	int status=0;
	String id=null;
	try {
		System.out.println("Staffoperation");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		PreparedStatement stmt = con.prepareStatement("insert into staff(name, email, phone, user, password, department) values('"+staff.getName()+"','"+staff.getEmail()+"','"+staff.getPhone()+"','"+staff.getUser()+"','"+staff.getPassword()+"','"+staff.getDepartment()+"')");
		status=stmt.executeUpdate();
		System.out.println("Insert success");

	}
	catch(Exception e){
		System.out.println(e);
	}
	return status;
}
public Staff staffLogin(String id)
{
	Staff staff = new Staff();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from staff where id="+id+"");
		while(rs.next()) {
			staff.setName(rs.getString("name"));
			staff.setEmail(rs.getString("email"));
			staff.setPhone(rs.getString("phone"));
			staff.setId(rs.getString("id"));
			staff.setUser(rs.getString("user"));
			staff.setPassword(rs.getString("password"));
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return staff;
}

public int newStudent(Student student) {
	System.out.println("in new student");
	int status=0;
	int stat=0;
	String id=null;
	try {
		System.out.println("in try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		PreparedStatement stmt = con.prepareStatement("insert into student(name, email, phone, department, joinyear, joinsem, staffid) values('"+student.getName()+"', '"+student.getEmail()+"', '"+student.getPhone()+"', '"+student.getDepartment()+"', '"+student.getJoinYear()+"', '"+student.getJoinSem()+"','"+student.getStaffId()+"');");
		status=stmt.executeUpdate();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select max(id) from student");
		while(rs.next()) {
			id=rs.getString("max(id)");
		}
		System.out.println("stud id"+id);
		PreparedStatement stm = con.prepareStatement("insert into login(studid, user, password) values('"+id+"', '"+student.getUser()+"', '"+student.getPassword()+"')");
		stat=stm.executeUpdate();
		if(status==1&&stat==1) {
			System.out.println("Success");
			status=1;
		}
		else {
			status=0;
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return status;
}

public int MarksAdd(Student student)
{
	System.out.println("in marks add");
	int status=0;
	try {
		System.out.println("in try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		PreparedStatement stmt = con.prepareStatement("insert into mark(studid, sem, sub1, sub2, sub3, sub4, sub5, staffid) values('"+student.getStudId()+"', '"+student.getSem()+"', '"+student.getSub1()+"', '"+student.getSub2()+"', '"+student.getSub3()+"', '"+student.getSub4()+"', '"+student.getSub5()+"','"+student.getStaffId()+"')");
		status=stmt.executeUpdate();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return status;
}

public int DeleteStudent(String id) {
int status=0;
int s1=0;
int s2=0;
System.out.println("in delete");
System.out.println("id is:"+id);
try {
	System.out.println("in try");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
	System.out.println("connected");
	PreparedStatement stmt = con.prepareStatement("delete mark.* from mark where studid="+id+"");
	System.out.println("mark deleted");
	PreparedStatement stm = con.prepareStatement("delete login.* from login where studid="+id+"");
	System.out.println("login deleted");
	PreparedStatement st = con.prepareStatement("delete student.* from student where id="+id+"");
	System.out.println("student deleted");
	status=stmt.executeUpdate();
	s1=stm.executeUpdate();
	s2=st.executeUpdate();
	if(status==1||s1==1||s2==1) {
		status=1;
	}
	else {
		status=0;
	}
}
catch(Exception e) {
	System.out.println(e);
}
return status;
}

//public int edit(Student student) {
//	int status = 0;
//	int status1= 0;
//	String id = student.getId();
//	String email = student.getEmail();
//	String phone = student.getPhone();
//	String user = student.getUser();
//	String password = student.getPassword();
//	String stat = null;
//	String stat1=null;
//	int table=0;
//	if(email!=null&&phone==null){
//		System.out.println("email change");	
//		stat="update student set email='"+email+"' where id="+id+"";
//	}
//	else if(email==null&&phone!=null) {
//		System.out.println("phone change");
//		stat="update student set phone="+phone+" where id="+id+"";
//	}
//	else if(user!=null&&password==null) {
//		System.out.println("user change");
//		stat="update login set user='"+user+"' where studid="+id+"";
//	}
//	else if(user==null&&password!=null) {
//		System.out.println("password change");
//		stat="update login set password='"+password+"' where studid="+id+"";
//	}
//	else {
//		table=1;
//		System.out.println("All change");
//		stat="update student set email='"+email+"', phone="+phone+" where id="+id+"";
//		stat1="update login set user='"+user+"', password='"+password+"' where studid="+id+"";
//	}
//	if(table==1) {
//		try
//		{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
//			PreparedStatement stmt = con.prepareStatement(stat);
//			PreparedStatement stmt1= con.prepareStatement(stat1);
//			status=stmt.executeUpdate();
//			status1=stmt1.executeUpdate();
//			if(status==1&&status1==1) {
//				status=1;
//			}
//			else {
//				status=0;
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//	else {
//	try
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
//		PreparedStatement stmt = con.prepareStatement(stat);
//		status=stmt.executeUpdate();
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}}
//	return status;
//}

public ResultSet allStudents(String staffid) {
	ResultSet rs = null;
	Student student = new Student();
	System.out.println("In all Students");
	System.out.println("staff id:"+staffid);
	try {
		System.out.println("in Try");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		System.out.println("connected");
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery("select * from student inner join mark on mark.studid = student.id inner join login on login.studid=student.id where mark.staffid='"+staffid+"'");
		
	}
	catch (Exception e) {
		System.out.println(e);
	}
	return rs;
}

public ResultSet studentList(String staffid) {
	ResultSet rs=null;
	System.out.println("in Student List");
	System.out.println("staff id:"+staffid);
	try {
			System.out.println("in Try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
			System.out.println("connected");
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from student where staffid='"+staffid+"'");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return rs;
}

public int profileEdit(Staff staff) {
	int status=0;
	int status1=0;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		PreparedStatement stmt = con.prepareStatement("update staff set name='"+staff.getName()+"', email='"+staff.getEmail()+"',phone='"+staff.getPhone()+"',user='"+staff.getUser()+"',password='"+staff.getPassword()+"' where id="+staff.getId()+"");
		PreparedStatement stm = con.prepareStatement("update login set user='"+staff.getUser()+"', password='"+staff.getPassword()+"' where staffid="+staff.getId()+"");
		status = stmt.executeUpdate();
		status1 = stm.executeUpdate();
		if(status==1&&status1==1) {
			status=1;
		}
		else {
			status=0;
		}
	}
	catch(Exception e){ 
		System.out.println(e);
	}
	return status;
}

public ResultSet studentEdit(String id) {
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery("select * from student inner join login on login.studid=student.id where id="+id+"");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return rs;
}

public int studentEdit(Student student) {
	int status=0;
	int stat=0;
	System.out.println("in studentEdit");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/science","root","Nidheesh@3N7");
		PreparedStatement stmt = con.prepareStatement("update student set name='"+student.getName()+"',email='"+student.getEmail()+"',phone="+student.getPhone()+",department='"+student.getDepartment()+"',joinyear="+student.getJoinYear()+",joinsem="+student.getJoinSem()+" where id="+student.getId()+"");
		PreparedStatement stm = con.prepareStatement("update login set user='"+student.getUser()+"',password='"+student.getPassword()+"' where studid="+student.getId()+"");
		status=stmt.executeUpdate();
		stat=stm.executeUpdate();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	if(status==1&&stat==1) {
		return status;
	}
	else {
	return status=0;
	}
}
}
