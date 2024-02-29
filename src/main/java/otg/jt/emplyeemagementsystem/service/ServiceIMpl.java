package otg.jt.emplyeemagementsystem.service;

import otg.jt.emplyeemagementsystem.domain.Employee;

import java.util.List;

public interface ServiceIMpl {
    Employee addEmployee(Employee employee);

    Employee updateEmployee(int id, Employee employee);

    Employee deleteEmployee(int id);

    List<Employee> getAllEmployee();

    Employee getByIDEmployee(int id);
}
