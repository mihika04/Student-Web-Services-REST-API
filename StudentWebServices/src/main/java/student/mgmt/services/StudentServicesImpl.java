package student.mgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.mgmt.entities.Student;
import student.mgmt.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return this.studentRepository.findAll();
	}

	@Override
	public Student getStudent(int studentId) {
		
		return this.studentRepository.getById(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		return this.studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return this.studentRepository.save(student);
	}

	@Override
	public Student deleteStudent(int studentId) {
		Student student = this.studentRepository.getById(studentId);
		this.studentRepository.delete(student);
		return student;
	}

}
