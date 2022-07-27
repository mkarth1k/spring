package spring.rest.consumer.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import spring.rest.consumer.demo.model.Department;

@Service
public class DepartmentService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	private final RestTemplateBuilder rtb = new RestTemplateBuilder();
	private final RestTemplate restTemplate = rtb.build();

	private String URL = "http://localhost:9999";

	public Department getDepartmentById(int did) {
		Department department = restTemplate.getForObject(URL + "/dep/get-dep-by-id/" + did, Department.class);
		LOG.info(department.toString());
		return department;
	}
	
	public List<Department> getAllDepartments(){
		
		ResponseEntity<List<Department>> rateResponse = restTemplate.exchange(URL + "/dep/get-all-deps",HttpMethod.GET, null, new ParameterizedTypeReference<List<Department>>() {});
		List<Department> depList = rateResponse.getBody();
		return depList;
		
	}

}
