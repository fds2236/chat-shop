package com.kh.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bean에 등록
public class CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Company> getAll() {
        List<Company> companyList = companyMapper.getAll();
        if(companyList != null && companyList.size() > 0) {
            for(Company company : companyList) {
                company.setEmployeeList(employeeMapper.getByCompanyId(company.getId()));
            }
        }
        return companyList;
    }
}
