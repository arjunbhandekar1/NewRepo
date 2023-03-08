package com.skillkube.client;

import java.util.ArrayList;
import java.util.List;

import com.skillkube.entity.Student;
import com.skillkube.service.StudentService;
import com.skillkube.service.Impl.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		StudentService sService = new StudentServiceImpl();

		Student s = new Student(5,"Java","78Java");

	//	sService.saveStudent(s);
		List<Student> students  = new ArrayList<Student>();
		Student s1 = new Student(0,"Amit","145Ja");
		Student s2 = new Student(2,"Amol","KL451");
		Student s3 = new Student(3,"Nitin","Mn124");
		students.add(s3); students.add(s1); students.add(s2);
		sService.saveAllStudents(students);
		
		System.out.println(sService.getAllStudents());
		

	}

}
