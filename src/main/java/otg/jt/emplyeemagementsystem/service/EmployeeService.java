package otg.jt.emplyeemagementsystem.service;

import org.springframework.stereotype.Service;
import otg.jt.emplyeemagementsystem.domain.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements ServiceIMpl {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee exstingEmployee = getByIDEmployee(id);
        exstingEmployee.setEmployeeName(employee.getEmployeeName());
        exstingEmployee.setEmployeeMail(employee.getEmployeeMail());
        exstingEmployee.setEmployeePhone(employee.getEmployeePhone());
        exstingEmployee.setHobbies(employee.getHobbies());
        exstingEmployee.setEmployeeSalary(employee.getEmployeeSalary());
        exstingEmployee.setAddress(employee.getAddress());

        var index = getIndex(id);
        employees.set(index, exstingEmployee);
        return exstingEmployee;
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee employee = getByIDEmployee(id);
        employees.remove(id);
        return employee;

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employees;
    }

    @Override
    public Employee getByIDEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == id)
                return employee;
        }
        throw new RuntimeException("Employee __ Not __ Found");
    }

    private int getIndex(int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getEmployeeId() == id)
                return i;

        }
        return -1;
    }
}
