package com.skillkube.service.Impl;

import java.util.List;

import com.skillkube.entity.Student;
import com.skillkube.repo.StudentRepo;
import com.skillkube.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentRepo studentRepo;

	public StudentServiceImpl() {
		super();

		studentRepo = new StudentRepo();
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.getAllStudents();
	}

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findStudentById(id);
	}

	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		studentRepo.saveStudent(s);
	}

	public void updateStudent(Student s) {

		studentRepo.updateStudent(s);
	}

	public void deleteStudent(Student s) {
		// TODO Auto-generated method stub
		studentRepo.deleteStudent(s);
	}

	public void updateBatch() {
		// TODO Auto-generated method stub
		studentRepo.updateBatch();
	}

	public void dropStudentTable() {
		// TODO Auto-generated method stub
		studentRepo.dropStudentTable();
	}

	public void saveAllStudents(List<Student> students) {
		
		studentRepo.saveAllStudents(students);
	}

}
