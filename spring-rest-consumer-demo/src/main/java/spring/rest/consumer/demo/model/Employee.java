package spring.rest.consumer.demo.model;


public class Employee {

	private int employeeId;

	private String firstName;

	private double salary;

	private Role role;

	private Department department;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary, Role role, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
		this.role = role;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + ", role="
				+ role + ", department=" + department + "]";
	}
	
	
}
