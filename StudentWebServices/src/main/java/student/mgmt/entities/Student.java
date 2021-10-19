package student.mgmt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler", "hibernateLazyInitializer", "fieldHandler"})
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=35,nullable=false)
	private String name;
	@Column(length=35,nullable=false)
	private String course;
	@Column(nullable=false)
	private double percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public Student(int id, String name, String course, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.percentage = percentage;
	}
	
	public Student() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", percentage=" + percentage + "]";
	}

}
