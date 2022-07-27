package spring.rest.consumer.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.rest.consumer.demo.model.Department;
import spring.rest.consumer.demo.service.DepartmentService;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/get-dep-by-id/{did}")
	private Department getDeptById(@PathVariable("did") int departmentId) {
		LOG.info(Integer.toString(departmentId));
		return service.getDepartmentById(departmentId);
	}
	
	@GetMapping("/get-all-deps")
	private List<Department> getAllDeps() {
		
		return service.getAllDepartments();
	}
	

}
