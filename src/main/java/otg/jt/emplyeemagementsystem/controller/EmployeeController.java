package otg.jt.emplyeemagementsystem.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import otg.jt.emplyeemagementsystem.domain.Employee;
import otg.jt.emplyeemagementsystem.service.ServiceIMpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/employee")
public class EmployeeController {
    private final ServiceIMpl serviceIMpl;

    @PostMapping("/add")
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        return serviceIMpl.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee uupdateEmployee(@Valid @PathVariable int id, @RequestBody Employee employee) {
        return serviceIMpl.updateEmployee(id, employee);
    }

    @DeleteMapping("/remove/{id}")
    public Employee removeEmployee(@Min (value = 100) @PathVariable int id) {
         return  serviceIMpl.deleteEmployee(id);
    }

    @GetMapping("/getById/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return serviceIMpl.getByIDEmployee(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return serviceIMpl.getAllEmployee();
    }
}
