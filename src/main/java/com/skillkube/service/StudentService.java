package com.skillkube.service;

import java.util.List;

import com.skillkube.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	public Student findStudentById(int id);

	public void saveStudent(Student s);

	public void updateStudent(Student s);

	public void deleteStudent(Student s);

	public void updateBatch();

	public void dropStudentTable();

	void saveAllStudents(List<Student> students);

}
