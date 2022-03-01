package com.springboot.mybatis.services;

import com.springboot.mybatis.model.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(long id);

    public int deleteById(long id);

    public int insert(Employee employee);

    public int update(Employee employee);
}
