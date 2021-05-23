package com.ncu.student.dao;

import java.util.List;

import com.ncu.student.models.Student;

public interface StudentDao {

	 public void saveStudent(Student student );
	    public Student getStudentById(String id);
	    public void updateStudent(Student student);
	    public void deleteStudent(String id);
	    public List<Student> getAllStudents();
}
