package com.emp.services.Impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.emp.dto.EmployeeDTO;
import com.emp.entities.Employee;
import com.emp.services.EmployeeService;

/**
 * Session Bean implementation class EmployeeServicesImpl
 */
@Stateless
@LocalBean
public class EmployeeServicesImpl implements EmployeeService {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDTO> findAllEmployees(){	
		return em.createNamedQuery("Employee.findAll").getResultList();
	}
	
}
