package com.employee.Employee.Test;

import org.springframework.stereotype.Component;

@Component
public class EmpRes {

	public String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
