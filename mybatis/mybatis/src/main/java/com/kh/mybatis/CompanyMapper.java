package com.kh.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // Mapper는 interface로 만들어야 함
public interface CompanyMapper {
    // 회사 Insert 구문
    @Insert("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id") // 자동 증가
    int insert(@Param("company") Company company);

    // 회사 전체 정보 Select 구문
    @Select("SELECT * FROM company")
    // 객체와 DB 이름이 다르기 때문에 맞춰주는 것
    @Results({
            @Result(property = "name", column = "company_name"),
            @Result(property = "address", column = "company_address"),
    })
    List<Company> getAll();
}
