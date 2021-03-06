package com.database.demo.Demo.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.database.demo.Demo.employee.dto.Employee;

public interface EmployeeDAO {
	int create(Employee emp);
	int update(Employee emp);
	int delete(Employee emp);
	Employee read(int id);
	List<Employee> read();
}
