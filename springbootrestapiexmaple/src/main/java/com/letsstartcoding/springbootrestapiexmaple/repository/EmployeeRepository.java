package com.letsstartcoding.springbootrestapiexmaple.repository;


import com.letsstartcoding.springbootrestapiexmaple.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
