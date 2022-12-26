package com.kh.practice.repository;

import com.kh.practice.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j // xml파일 따로 만들지 않아도 됨

class MemberRepositoryTest {
    @Autowired // 외부에서 객체를 생성해서 의존성을 주입할 때 사용
    MemberRepository memberRepository; // 의존성 주입

    @Test
    @DisplayName("회원 가입 테스트")
    public void createMemberTest() {
            Member member = new Member();
            member.setId("fds2236");
            member.setPwd("fds2236!!!");
            member.setName("정은종");
            member.setEmail("fds2236@naver.com");
            member.setTel("01079304067");
            member.setAddr(null);
            log.error(member.toString());
        }
        
    @Test
    @DisplayName("이름으로 회원 조회")
    public void findByNameTest() {
        this.createMemberTest(); // 메소드 호출
        List<Member> member = memberRepository.findByName("정은종");
        log.error(member.toString());
    }

}

