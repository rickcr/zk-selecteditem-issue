package net.learntechnology.example.viewmodel;

import net.learntechnology.example.Department;
import net.learntechnology.example.Employee;
import net.learntechnology.example.EmployeeService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import java.util.List;

public class EmployeesVM {

	private Employee employee;
	 
	@NotifyChange({"employee"})
	@Command
	public void createEmployee() {
		employee = new Employee();
		employee.setDepartment(getDepartments().get(0));
	}

	@Command
	public void editEmployee() {
		 
	}

	@NotifyChange({"employees"})
	@Command
	public void add() {
		EmployeeService.insert(employee); 
	}

	@NotifyChange({"employees"})
	@Command
	public void update() {
		EmployeeService.update(employee);
	}

	@NotifyChange({"employees"})
	@Command
	public void delete() {
		EmployeeService.delete(employee.getId());
	
	}

	@NotifyChange({"employees"})
	@Command
	public void cancel() {
	}

	public List<Employee> getEmployees() {
		return EmployeeService.fetchAll();
	}


	public List<Department> getDepartments() {
		return EmployeeService.fetchDepartments();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
