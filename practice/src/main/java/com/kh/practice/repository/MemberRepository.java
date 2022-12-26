package com.kh.practice.repository;
// repository와 DAO를 같이 보기도 하고 따로 나누기도 함
// Entity에 의해 생성된 데이터베이스에 접근하는 메소드를 사용하기 위한 인터페이스
// 데이터베이스에 접근하는 객체를 의미
// service와 DB의 연결고리
// CRUD를 정의하는 영역
// Entity에 의해 생성된 데이터

import com.kh.practice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// interface로 만들고 JpaRepository의 상속을 받음
// 해당 entity import
// JpaRepository<테이블명, 프라이머리키의 데이터타입>
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByName(String name); // 이름으로 검색

}
