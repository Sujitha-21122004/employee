package com.employee.empRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.empEntity.Employee;


public interface empRepository extends JpaRepository<Employee, Integer>{
	@Query(value="SELECT * FROM institutedb",nativeQuery=true)
	public List<Employee> getAll();
}
