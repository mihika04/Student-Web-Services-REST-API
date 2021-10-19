package student.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import student.mgmt.entities.Student;
import student.mgmt.services.StudentServices;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class StudentController {
	
	@Autowired
	StudentServices studentServices;
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return this.studentServices.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getSingleStudent(@PathVariable(value="id") String id) {
		return  this.studentServices.getStudent(Integer.parseInt(id));	
		
	}
	
	@PostMapping("/students")
	Student addStudent(@RequestBody Student student) {
		return this.studentServices.addStudent(student);
	}
	
	@PutMapping("/students")
	Student updateStudent(@RequestBody Student student) {
		return this.studentServices.updateStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	Student deleteStudent(@PathVariable(value="id") String id) {
		return this.studentServices.deleteStudent(Integer.parseInt(id));
		
	}


}
