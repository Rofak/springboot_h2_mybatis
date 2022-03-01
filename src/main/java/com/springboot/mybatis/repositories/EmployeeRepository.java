package com.springboot.mybatis.repositories;

import com.springboot.mybatis.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeRepository {

    @Select("SELECT * FROM employees")
    public List<Employee> findAll();

    @Select("SELECT * FROM employees WHERE id=#{id}")
    public Employee findById(long id);


    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO employees(id, first_name, last_name,email_address) " +
            " VALUES (#{id}, #{first_name}, #{last_name}, #{email_address})")
    public int insert(Employee employee);

    @Update("Update employees set first_name=#{first_name}, " +
            " last_name=#{last_name}, email_address=#{email_address} where id=#{id}")
    public int update(Employee employee);
}
