package pro.sky.course2.hometask0905.services;

import pro.sky.course2.hometask0905.model.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {
    Map<String, Employee> getEmployeeMap();

    Employee addEmployee(String firstName, String lastName, int department, int salary);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Collection<Employee> showArray();
}
