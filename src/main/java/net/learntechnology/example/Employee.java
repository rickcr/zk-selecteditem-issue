package net.learntechnology.example;

public class Employee {
	private Integer id;
	private String name;
	private Department department;

	public Employee(Department department, Integer id, String name) {
		this.department = department;
		this.id = id;
		this.name = name;
	}

	public Employee() {
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Employee employee = (Employee) o;

		return id != null ? id.equals(employee.id) : employee.id == null;

	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
