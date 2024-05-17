package task1;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Ivan");
        employee1.setSurname("Ivanov");
        employee1.setAge(25);

        Employee employee2 = new Employee("Petr", "Petrov", 30);

        Employee employee3 = new Employee();
        employee3.name = "Sidor";
        employee3.surname = "Sidorov";
        employee3.age = 35;

        EmployeeContainer employeeContainer = new EmployeeContainer();
        containerTest(employeeContainer, employee1, employee2, employee3);

        employeeContainer = new EmployeeContainer(10);
        containerTest(employeeContainer, employee1, employee2, employee3);

        employeeContainer = new EmployeeContainer(
                List.of(employee1, employee2, employee3, new Employee("Alex", "Alexeev", 40)));
        System.out.println(employeeContainer.getEmployees());
    }

    private static void containerTest(EmployeeContainer employeeContainer, Employee employee1, Employee employee2,
                                      Employee employee3) {
        employeeContainer.add(employee1);
        employeeContainer.add(employee2);
        employeeContainer.add(employee3);
        employeeContainer.add("Alex", "Alexeev", 40);
        System.out.println(employeeContainer.getEmployees());
    }
}
