package com.krishantha.training.salesmanager.service;

import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;


public class EmployeeServiceImpl {
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees(){
		return emoployeeRepository.getAllEmployees();
		
	}
}


public class Application{
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
			
		}
		
	}
	
}