package net.learntechnology.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	private static Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();
	private static List<Department> departments = new ArrayList<Department>() {{
		add(new Department(1, "Accounting"));
		add(new Department(2, "HR"));
		add(new Department(3, "Billing"));
	}};

	private static int id_sequence = 1;

	static {
		for(int i = 0; i< 3; i++) {
			Employee e = new Employee(departments.get(i), id_sequence, "John Doe "+i);
			employeesMap.put(id_sequence, e);
			++id_sequence;
		}
	}


	public static void insert(Employee employee) {
		employee.setId(id_sequence++);
		employeesMap.put(employee.getId(), employee);

	}

	public static void update(Employee employee) {
		employeesMap.put(employee.getId(), employee);
	}

	public static void delete(Integer id) {
		employeesMap.remove(id);
	}

	public static List<Employee> fetchAll() {
		return new ArrayList<>(employeesMap.values());

	}

	public static List<Department> fetchDepartments() {
		 return departments;
	}
}

