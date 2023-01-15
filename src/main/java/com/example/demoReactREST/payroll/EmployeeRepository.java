package com.example.demoReactREST.payroll;

import com.example.demoReactREST.payroll.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
