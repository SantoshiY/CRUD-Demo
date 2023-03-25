package com.cruddemoapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemoapplication.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	Student findByName(String Name);
}
