package com.example.personrest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@PostMapping("/insert/{name}/{dept}")
	public String getData(@PathVariable("name") String name, @PathVariable("dept") String dept) {
		return name+" Hello Welcome "+" to "+dept+" Department";
	}
	
	@PostMapping("/emp")
	public String getEmpData(@RequestBody Employee emp) {
		
		return emp.getName()+" you are working for "+emp.getDept()+" as "+emp.getDesg();
		
	}
	
	@GetMapping("/display")
	public Employee displayEmp() {
		return new Employee("Kamal","Operations","Manager");
	}
}
