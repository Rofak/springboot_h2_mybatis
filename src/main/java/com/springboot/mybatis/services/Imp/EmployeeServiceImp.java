package com.springboot.mybatis.services.Imp;

import com.springboot.mybatis.model.Employee;
import com.springboot.mybatis.repositories.EmployeeRepository;
import com.springboot.mybatis.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        return this.employeeRepository.findById(id);
    }

    @Override
    public int deleteById(long id) {
        return this.employeeRepository.deleteById(id);
    }

    @Override
    public int insert(Employee employee) {
        return this.employeeRepository.insert(employee);
    }

    @Override
    public int update(Employee employee) {
        return this.employeeRepository.update(employee);
    }
}
