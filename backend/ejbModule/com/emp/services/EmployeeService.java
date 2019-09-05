package com.emp.services;

import java.util.List;

import com.emp.dto.EmployeeDTO;
import com.emp.entities.Employee;

public interface EmployeeService {

	List<EmployeeDTO> findAllEmployees();
	
}
