package com.kh.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company") // 전체 경로
public class CompanyController {
    @Autowired // 의존성 주입 => bean
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyService companyService;

    // 회사 insert
    @PostMapping("") // 하위 경로
    public int post(@RequestBody Company company) {
        return companyMapper.insert(company); // => 1리턴
    }

    // 회사 정보 select
    @GetMapping("")
    public List<Company> getAll() {
        return companyService.getAll();
    }
}
