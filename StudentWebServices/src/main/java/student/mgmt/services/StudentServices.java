package student.mgmt.services;

import java.util.List;

import student.mgmt.entities.Student;

public interface StudentServices {
	
	public List <Student> getAllStudents();
	public Student getStudent(int studentId);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student deleteStudent(int studentId);
	
}
