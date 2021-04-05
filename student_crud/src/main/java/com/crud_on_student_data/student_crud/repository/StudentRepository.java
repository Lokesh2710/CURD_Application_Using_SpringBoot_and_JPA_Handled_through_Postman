package com.crud_on_student_data.student_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_on_student_data.student_crud.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {

	Student findByName(String name);
	

}
