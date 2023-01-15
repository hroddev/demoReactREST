package com.example.demoReactREST.payroll;

import com.example.demoReactREST.payroll.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/*public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}*/

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    void save(Employee employee);
}