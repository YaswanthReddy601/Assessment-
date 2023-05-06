package com.tcs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Student;
import com.tcs.servimp.StudServImp;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudServImp ssi;
	
	@GetMapping("/show")
	@ApiOperation("shows all the student data")
	public ResponseEntity<List<Student>> showStudent() {
		
		List<Student> s = ssi.GetallStudents();
		
		return new ResponseEntity<List<Student>>(s,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	@ApiOperation("creates the new student")
	public ResponseEntity<String> SaveStudent(
			@RequestBody Student std) {
		
		Integer sid = ssi.SaveStudent(std);
		String msg= "Student "+sid+" created";
	
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}
	
	@PutMapping("/modify")
	@ApiOperation("modifies the data")
	public ResponseEntity<String> update(
					@RequestBody Student std) throws Exception {
		Integer i = ssi.Update(std);
		return new ResponseEntity<>("student "+i+" updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{sid}")
	@ApiOperation("Deletes the student data")
	public ResponseEntity<String> delete(
							@PathVariable("sid") Integer sid) throws Exception {
		ssi.deleteStudent(sid);
		String msg = "Student "+sid+" deleted";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/Find/{sid}")
	@ApiOperation("Shows selected Student")
	public ResponseEntity<Student> FindOne(
						@PathVariable("sid") Integer sid) throws Exception{
			
		Student std = ssi.getoneStudent(sid);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
	}

}
