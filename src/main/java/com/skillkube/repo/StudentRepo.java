package com.skillkube.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.skillkube.entity.Student;
import com.skillkube.util.AppConstant;
import com.skillkube.util.DBConnection;

public class StudentRepo {

	List<Student> sList;

	public StudentRepo() {
		super();
		sList = new ArrayList<Student>();

	}

	public List<Student> getAllStudents() {
		sList = new ArrayList<Student>();
		try {
			String sql = AppConstant.sqlAllStudent;
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
				sList.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sList;

	}

	public Student findStudentById(int id) {
		Student s = null;
		try {
			String sql = AppConstant.sqlFindStudent;
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
				sList.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	public void saveStudent(Student s) {
		Connection con = null;
		int id = 0;
		try {
			String sql = AppConstant.sqlSaveStudent;
			con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getRollNumber());
			id = ps.executeUpdate();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();

		} finally {

			System.out.println("Number of Students created=" + id);

		}

	}

	public void updateStudent(Student s) {
		int id = 0;
		try {
			String sql = AppConstant.sqlUpdateStudent;
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getId());
			id = ps.executeUpdate();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {

			System.out.println("Number of employees created=" + id);

		}

	}

	public void deleteStudent(Student s) {

		int id = 0;
		try {
			String sql = AppConstant.sqlDeleteStudent;
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			id = ps.executeUpdate();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {

			System.out.println("Number of employees created=" + id);

		}

	}

	public void updateBatch() {

		int id = 0;
		try {
			String sql = "insert into Student (name) values('Rekha')";
			Connection con = DBConnection.getConnection();

			Statement stmt = con.createStatement();
			stmt.addBatch(sql);
			sql = "update Student set  name='Raj' where id=2";
			stmt.addBatch(sql);
			sql = "insert into Student (name) values('Aman')";
			stmt.addBatch(sql);
			int[] nums = stmt.executeBatch();
			for (int n : nums) {

				System.out.println(n);
			}

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {

			System.out.println("Number of Student created=" + id);

		}

	}

	public void dropStudentTable() {

		int id = 0;
		try {
			String sql = "drop table Student";
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.execute();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {

			System.out.println("Table Trucated");

		}
	}

	public void saveAllStudents(List<Student> students) {

	}
}
