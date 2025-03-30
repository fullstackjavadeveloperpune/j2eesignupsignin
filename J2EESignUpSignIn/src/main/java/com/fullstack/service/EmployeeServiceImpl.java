package com.fullstack.service;

import com.fullstack.dao.EmployeeDao;
import com.fullstack.dao.EmployeeDaoImpl;
import com.fullstack.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public void signUp(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.signUp(employee);
	}

	@Override
	public boolean signIn(String empEmailId, String empPassword) {
		// TODO Auto-generated method stub
		return employeeDao.signIn(empEmailId, empPassword);
	}

}
