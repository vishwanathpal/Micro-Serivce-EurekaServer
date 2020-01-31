package com.micro.hr.resources;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hr.model.Employee;
import com.micro.hr.model.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResources {
	
	List<Employee> employees = Arrays.asList(
							  new Employee("E1", "KingDon", "Paul", "Meditech"),
							  new Employee("E2", "Lila", "Hardcastal", "Surgery"),
							  new Employee("E3", "Solack", "Sen", "Dentist")
			);
	
	/*
	 * @RequestMapping("/employees") public List<Employee> getEmployee(){
	 * 
	 * return employees; }
	 */

	@RequestMapping("/employees")
	public EmployeesList getEmployees(){
		
		EmployeesList employeesList = new EmployeesList();
		employeesList.setEmployee(employees);
		return employeesList;
	}
	
	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") String Id) {
		
		Employee e = employees.stream()
					 .filter(employee -> Id.equals(employee.getId()))
					 .findAny()
					 .orElse(null);
		return e;
	}
}
