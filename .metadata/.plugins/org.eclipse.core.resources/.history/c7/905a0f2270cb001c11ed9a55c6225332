package com.database.demo.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.database.demo.Demo.employee.dao.EmployeeDAO;
import com.database.demo.Demo.employee.dto.Employee;

public class SpringJDBCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/database/demo/Demo/config.xml");

		EmployeeDAO employeedao = (EmployeeDAO) context.getBean("employeeDao");
		
//		createEmployee(employeedao);
//		updateEmployee(employeedao);
		deleteEmployee(employeedao);
		
	}
	private static void createEmployee(EmployeeDAO employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Max");
		emp.setLastName("Rider");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	private static void deleteEmployee(EmployeeDAO employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Max");
		emp.setLastName("Rider");
		int result = employeedao.delete(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	private static void updateEmployee(EmployeeDAO employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Jhon");
		emp.setLastName("Rider");
		int result = employeedao.update(emp);
		System.out.println("Number of records inserted are: " + result);
	}

}
