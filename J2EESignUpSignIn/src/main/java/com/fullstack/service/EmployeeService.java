package com.fullstack.service;

import com.fullstack.model.Employee;

public interface EmployeeService {
	void signUp(Employee employee);

	boolean signIn(String empEmailId, String empPassword);

}
