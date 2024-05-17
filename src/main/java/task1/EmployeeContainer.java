package task1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeContainer {

    private final List<Employee> employees;

    public EmployeeContainer() {
        employees = new ArrayList<>();
    }

    public EmployeeContainer(int capacity) {
        employees = new ArrayList<>(capacity);
    }

    public EmployeeContainer(List<Employee> employees) {
        this.employees = employees;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void add(String name, String surname, int age) {
        employees.add(new Employee(name, surname, age));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
