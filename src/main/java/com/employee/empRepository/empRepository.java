package com.employee.empRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.empEntity.Employee;

public interface empRepository extends JpaRepository<Employee, Integer>{
 @Query(value="select * from employeedb.employee_details")
 public List<Employee>getAll();
}
