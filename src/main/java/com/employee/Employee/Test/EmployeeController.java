package com.employee.Employee.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmpServiceImpl serviceImpl;
	@Autowired
	 EmpReq req;
	  @Autowired
		EmpRes res;
	@GetMapping("/getEmpStatus/")
	//@GetMapping("/getEmpStatus/{grade}")
	//public void getEmpStatus(@RequestBody EmpReq req ,@PathVariable("grade") String grade) {
		public EmpRes getEmpStatus() {
		
		req.setGrade("A");
		EmpRes res=serviceImpl.getEmployeeService(req);
		
		System.out.println(" Employ service status "+res.getStatus());
		return res;
	}
}
