package spring.rest.consumer.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.rest.consumer.demo.model.Employee;
import spring.rest.consumer.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/get-emp-by-id/{eid}")
	private Employee getEmpById(@PathVariable("eid") int employeeId) {
		LOG.info(Integer.toString(employeeId));
		return service.getEmployeeById(employeeId);
	}
	
	@GetMapping("/get-all-emps")
	private List<Employee> getAllEmps() {
		
		return service.getAllEmployees();
	}
	
}
