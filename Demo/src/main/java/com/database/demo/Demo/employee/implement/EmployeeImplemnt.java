package com.database.demo.Demo.employee.implement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.database.demo.Demo.employee.dao.EmployeeDAO;
import com.database.demo.Demo.employee.dto.Employee;

public class EmployeeImplemnt implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, null, emp.getFirstName(), emp.getLastName());
		System.out.println("Number of records inserted are: " + result);
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql,  emp.getFirstName(), emp.getLastName(),emp.getId());
		return result;
	}
	@Override
	public int delete(Employee emp) {
		String sql = "Delete from employee where id=?";
		int result = jdbcTemplate.update(sql, emp.getId());
		return result;
	}

}