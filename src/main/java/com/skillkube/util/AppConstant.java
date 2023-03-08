package com.skillkube.util;

public class AppConstant {
	
	static String dbURL = "jdbc:mysql://localhost:3306/training";
	static String username = "root";
	static String password = "root"; 
	
	public static String sqlAllStudent="select * from student";
	public static String sqlFindStudent="select * from student where id=?";
	public static String sqlSaveStudent="insert into student (id,name,rollNumber) values (?,?,?)";
	public static String sqlUpdateStudent="update   student set name =? where id=?";
	public static String sqlDeleteStudent="delete from student  where id=?";


}
