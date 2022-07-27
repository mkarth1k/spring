package spring.rest.consumer.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import spring.rest.consumer.demo.model.Employee;

@Service
public class EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	private final RestTemplateBuilder rtb = new RestTemplateBuilder();
	private final RestTemplate restTemplate = rtb.build();

	private String URL = "http://localhost:9999";

	public Employee getEmployeeById(int eid) {
		Employee employee = restTemplate.getForObject(URL + "/emp/get-emp-by-id/" + eid, Employee.class);
		LOG.info(employee.toString());
		return employee;
	}
	
	public List<Employee> getAllEmployees(){
		
		ResponseEntity<List<Employee>> rateResponse = restTemplate.exchange(URL + "/emp/get-all-emps",HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {});
		List<Employee> empList = rateResponse.getBody();
		return empList;
		
	}
}
