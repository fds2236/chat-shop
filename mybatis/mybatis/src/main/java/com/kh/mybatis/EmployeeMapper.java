package com.kh.mybatis;

import lombok.Setter;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    // 직원 Insert 구문
    @Insert("INSERT INTO employee(company_id, employee_name, employee_address) " +
            "VALUES(#{employee.companyId}, #{employee.name}, #{employee.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);

    // 직원 전체 정보 Select 구문
    @Select("SELECT * FROM employee")
    // 객체와 DB 이름이 다르기 때문에 맞춰주는 것
    // id = "EmployeeMap" => 재사용하기 위해서
    @Results(id = "EmployeeMap", value ={
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "name", column = "employee_name"),
            @Result(property = "address", column = "employee_address")
    })
    List<Employee> getAll();

    // 직원 개별 정보 Select 구문(id로 조회)
    @Select("SELECT * FROM employee WHERE company_id=#{id}")
    @ResultMap("EmployeeMap")
    Employee getById(@Param("id") int id);

    // 직원 개별 정보 Select 구문(companyId로 조회)
    @Select("SELECT * FROM employee WHERE company_id=#{companyId}")
    @ResultMap("EmployeeMap")
    List<Employee> getByCompanyId(@Param("companyId") int companyId);
}
