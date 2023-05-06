package com.tcs.serv;

import java.util.List;
import java.util.Optional;

import com.tcs.entity.Student;

public interface IServ {
	Integer SaveStudent(Student s);
	Student getoneStudent(Integer i) throws Exception;
	List<Student> GetallStudents();
	Integer Update(Student s);
	void deleteStudent(Integer i) throws Exception;
}
