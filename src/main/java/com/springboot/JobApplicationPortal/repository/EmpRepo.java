package com.springboot.JobApplicationPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.JobApplicationPortal.entities.Employee;



@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

}

