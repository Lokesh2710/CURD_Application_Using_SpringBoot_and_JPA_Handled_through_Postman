package com.crud_on_student_data.student_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud_on_student_data.student_crud.entity.Student;
import com.crud_on_student_data.student_crud.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students)
	{
		return repository.saveAll(students);
	}
	
	public List<Student> getStudents()
	{
		return repository.findAll();
	}
	
	public Student getStudentById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public Student getStudentByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String deleteStudent(int id)
	{
		repository.deleteById(id);
		return "Student Having "+id+" Deleted ";
	}
	
	public Student updateStudentInfo(Student student)
	{
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		existingStudent.SetName(student.getName());
		existingStudent.SetSubject(student.getSubject());
		existingStudent.SetScore(student.getScore());
		return repository.save(existingStudent);
		
	}
	

}
