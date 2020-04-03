package com.restapi.msemployee.mappers;

import com.restapi.msemployee.dtos.EmployeeDTO;
import com.restapi.msemployee.models.Employee;

public class EmployeeMapper {

	public static EmployeeDTO entityTodto(Employee emp) {
		return new EmployeeDTO()
					.setName(emp.getName())
					.setEmail(emp.getEmail());
	}
	
	public static Employee dtoToEntity(EmployeeDTO empdto) {
		return new Employee()
					.setName(empdto.getName())
					.setEmail(empdto.getEmail());
	}

}
