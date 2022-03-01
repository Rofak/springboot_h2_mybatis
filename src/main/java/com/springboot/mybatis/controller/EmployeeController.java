package com.springboot.mybatis.controller;

import com.springboot.mybatis.model.Employee;
import com.springboot.mybatis.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;


    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    private List<Employee> findAll() {
        return this.employeeService.findAll();
    }

    @GetMapping("/{id}")
    private Employee findById(@PathVariable("id") long id) {
        return this.employeeService.findById(id);
    }

    @DeleteMapping("/{id}")
    private int deleteById(@PathVariable("id") long id) {
        return this.employeeService.deleteById(id);
    }

    @PostMapping()
    private int insert(@RequestBody() Employee employee) {
        return this.employeeService.insert(employee);
    }

    @PutMapping("/{id}")
    private int update(@RequestBody() Employee employee) {
        return this.employeeService.update(employee);
    }
}
