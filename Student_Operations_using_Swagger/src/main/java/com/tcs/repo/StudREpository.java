package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Student;

public interface StudREpository extends JpaRepository<Student, Integer> {

}
