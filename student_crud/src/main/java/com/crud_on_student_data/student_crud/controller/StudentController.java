package com.crud_on_student_data.student_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud_on_student_data.student_crud.entity.Student;
import com.crud_on_student_data.student_crud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@PostMapping("/addStudents")
	public List<Student> addStudent(@RequestBody List<Student> students)
	{
		return service.saveStudents(students);
	}
	
	@GetMapping("/all_students")
	public List<Student> findAllStudent()
	{
		return service.getStudents();
	}
	
	@GetMapping("/studentById/{id}")
	public Student findStudentById(@PathVariable int id)
	{
		return service.getStudentById(id);
	}
	
	@GetMapping("/student/{name}")
	public Student findStudentByName(@PathVariable String name)
	{
		return service.getStudentByName(name);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student)
	{
		return service.updateStudentInfo(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return service.deleteStudent(id);
	}
	
}
