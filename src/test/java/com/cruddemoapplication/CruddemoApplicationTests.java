package com.cruddemoapplication;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemoapplication.entity.Student;
import com.cruddemoapplication.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	
	@Autowired
	private StudentRepository sr;
	
	
	//is page pr right click kr ke program run krna hai as a junit or if ek hi method run krni hai toh us method ko select kr ke run as junit. 
	@Test
	void saveRecord() {
		Student s = new Student();
		s.setName("Lonny");
		s.setCourse("Devloper");
		s.setFee(22000);
		sr.save(s);	
	}
	
	@Test
	void deleteRec() {
		sr.deleteById(7L);
	}
	
	@Test
	void findById() {
		Optional<Student> findById = sr.findById(1L);
		Student student = findById.get();
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
		
	}
	
	@Test
	void updateOneStudent() {
		Optional<Student> findById = sr.findById(12L);
		Student student = findById.get();
		//student.setName("Sunny");
		student.setCourse("Development");
		student.setFee(20000);
		sr.save(student);
	}
	
	@Test
	void getAllStudent() {
		Iterable<Student> findAll = sr.findAll();
		for (Student student : findAll) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());
		}
	}
}
