package student.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.mgmt.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
