package com.emp.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.emp.dto.EmployeeDTO;
import com.emp.entities.Employee;
import com.emp.services.Impl.EmployeeServicesImpl;


@ManagedBean(name = "employeeController")
@SessionScoped
public class EmployeeController {
	
	@EJB
	public EmployeeServicesImpl empServiceImpl;
	
	public List<EmployeeDTO> getAllEmployees() {
		return empServiceImpl.findAllEmployees();
	}

}
