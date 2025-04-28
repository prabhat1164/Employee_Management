package org.codingwallah.handsOn.controlller;

import org.codingwallah.handsOn.model.Employee;
import org.codingwallah.handsOn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    //List<Employee> employees = new ArrayList<>(); //employees is variable here, List<Employee> is datatype
    //Employee emp = new Employee(); //emp is object
    //EmployeeService employeeService = new EmployeeServiceImp();//EmployeeService is interface direct obj nhi bna skte, class se bnaya jata h
    //Dependency injection
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        //employees.add(employee);
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id))
            return "delete success";
        return "Not found";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployeeDetails(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

}
