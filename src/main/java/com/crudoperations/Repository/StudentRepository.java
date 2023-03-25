package com.crudoperations.Repository;

import org.springframework.data.repository.CrudRepository;

import com.crudoperations.entities.Student;

//this layer give some build in class
//<student, Long> here student is entity class name and long is data type of primary key in 
//student entity class in from of warper class
//repository layer is always a interface and its a child interface of crudRepository
//it is belong to spring
public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
