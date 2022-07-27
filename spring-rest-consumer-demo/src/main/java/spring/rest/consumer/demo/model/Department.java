package spring.rest.consumer.demo.model;

public class Department {

	private int departmentId;
	private String departmentName;
	private String city;

	public Department() {
		super();
	}

	public Department(String name, String city) {
		super();
		this.departmentName = name;
		this.city = city;
	}

	public Department(int id, String name, String city) {
		super();
		this.departmentId = id;
		this.departmentName = name;
		this.city = city;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int id) {
		this.departmentId = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String name) {
		this.departmentName = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", city=" + city
				+ "]";
	}

}
