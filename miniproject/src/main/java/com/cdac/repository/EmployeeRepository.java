package com.cdac.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cdac.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
