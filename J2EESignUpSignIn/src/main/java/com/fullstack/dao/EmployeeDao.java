package com.fullstack.dao;

import com.fullstack.model.Employee;

public interface EmployeeDao {

	void signUp(Employee employee);

	boolean signIn(String empEmailId, String empPassword);
}
