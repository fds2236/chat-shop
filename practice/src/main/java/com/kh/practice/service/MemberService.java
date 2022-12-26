package com.kh.practice.service;


import com.kh.practice.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service // MemberService라는 class를 bean에 등록
public class MemberService {
    // 레파지토리 연결
    private MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; // 생성자 의존성 주입
    }

}
