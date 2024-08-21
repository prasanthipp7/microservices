package com.employee.Employee.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmpServiceImpl {
    @Autowired
	EmpRes res;
    @Autowired
	EmpReq req;
	public EmpRes getEmployeeService(EmpReq req) {
		
		if(req.getGrade().equals("A"))
		{
			res.setStatus("Perminent");
		}
		return res;
	}
}
