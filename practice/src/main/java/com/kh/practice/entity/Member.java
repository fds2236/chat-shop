package com.kh.practice.entity;
// 데이터베이스에 쓰일 컬럼과 여러 엔티티 간의 연관관계를 정의
// 데이터베이스의 테이블을 하나의 엔티티로 생각
// 실제 데이터베이스의 테이블과 1:1로 매핑
// 이 클래스의 필드는 각 테이블 내부의 컬럼을 의미


// 클래스에 @Entity적용!
// PK에 @Id, @GeneratedValue 적용
// @GeneratedValue : TABLE, SEQUENCE, INDETITY, AUTO(GeneratedValue는 자동으로 값 생성)
// String 기본 타입은 varchar(255)
// 길이 지정할 때는 @Column(length = 원하는 길이 적용)

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Table;

// member테이블에 컬럼 id, pwd, 이름, email, tel, addr 만들고 싶어!
// addr은 null도 가능
@Getter
@Setter
@ToString

@Entity
@Table(name="member") // 테이블 이름 member
public class Member {
    @Id // 프라이머리 키
//    @GeneratedValue(strategy = GenerationType.AUTO) // GenerationType : TABLE, SEQUENCE, IDENTITY, AUTO(기본값으로 Dialect에 따라 결정)
    @Column(name = "id")
    private String id;

    @Column(name = "pwd", nullable = false, length = 20) // 널 허용 불가, 최대 길이 20자
    private String pwd;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "tel", nullable = false)
    private String tel;

    @Column(name = "addr", nullable = true)
    private String addr;
}
