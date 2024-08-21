package com.employee.Employee.Test;

import org.springframework.stereotype.Component;

@Component
public class EmpReq {

	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String Grade;
}
