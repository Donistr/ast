package task5.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Employee> employees = createEmployeesList();
        System.out.println(filterByAge(employees, 30));
        System.out.println(getEmployeesCountInDepartment(employees, Departments.IT));
        System.out.println(getEmployeeWithMaxSalary(employees));
        System.out.println(getEmployeesNamesInDepartment(employees, Departments.HR));
        System.out.println(getAverageSalary(employees));
    }

    private static List<Employee> createEmployeesList() {
        return Stream.of(new Employee("Igor", 10, Departments.HR, 100),
                        new Employee("Vladik", 19, Departments.IT, 0),
                        new Employee("Slava", 40, Departments.IT, 500),
                        new Employee("Maria", 19, Departments.MANAGEMENT, 15),
                        new Employee("Alex", 33, Departments.HR, 200))
                .collect(Collectors.toList());
    }
    
    private static List<Employee> filterByAge(List<Employee> employees,int age) {
        return employees.stream()
                .filter(employee -> employee.getAge() >= age)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
    }

    private static long getEmployeesCountInDepartment(List<Employee> employees, Departments department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .count();
    }

    private static Employee getEmployeeWithMaxSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();
    }

    private static List<String> getEmployeesNamesInDepartment(List<Employee> employees, Departments department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    private static double getAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);
    }
}
