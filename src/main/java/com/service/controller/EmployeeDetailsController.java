package com.service.controller;

import com.service.entity.Employee;
import com.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeDetailsController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeService.get(id);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.update(employee);
    }


}
