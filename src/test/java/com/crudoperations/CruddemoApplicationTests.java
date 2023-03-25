package com.crudoperations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperations.Repository.StudentRepository;
import com.crudoperations.entities.Student;

@SpringBootTest
class CruddemoApplicationTests {
//StudentRepository extends crudRepository
//crudRepository is also interface but it have some special class in it so that here its bean(object) 
	//is created
//if you apply @autowired on repository layer which is an interface automatically their is a 
	//build in class in spring boot 
//called as simpleJpaRepository an object of that created and injected at these variable 
	//(for repository layer always this object is created)
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveOneStudent() {
		Student s = new Student();
		s.setName("Kunny");
		s.setCourse("Testing");
		s.setFee(20000);
		studentRepo.save(s);
	}
	
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(6L);
	}
	

}
