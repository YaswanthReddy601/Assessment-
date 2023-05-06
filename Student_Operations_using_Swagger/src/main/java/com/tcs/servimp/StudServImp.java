package com.tcs.servimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Student;
import com.tcs.repo.StudREpository;
import com.tcs.serv.IServ;

import error.NoStudentExistException;

@Service
public class StudServImp implements IServ{
	
	@Autowired
	public StudREpository srepo;

	@Override
	public Integer SaveStudent(Student s) {
			s = srepo.save(s);
		return s.getSid();
	}
	

	@Override
	public Student getoneStudent(Integer i) throws Exception {
			return srepo.findById(i)
					.orElseThrow(
							()->new NoStudentExistException("No student with given sid"));
		
	}

	@Override
	public List<Student> GetallStudents() {
			List<Student> std = srepo.findAll();
		return std;
	}

	@Override
	public Integer Update(Student stud) {
			
			if(stud.getSid()==null||!srepo.existsById(stud.getSid()))
				throw new NoStudentExistException("No student with given sid");
			else
				 srepo.save(stud);	
			
			
			return stud.getSid();
	}


	@Override
	public void deleteStudent(Integer i) throws Exception {
		srepo.delete(getoneStudent(i));
	}





		
}
