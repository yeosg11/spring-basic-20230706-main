package com.yeosg1.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yeosg1.basic.entity.UserEntity;

// description: Repository - 데이터 접근 계측으로 데이터베이스에 접근하여 데이터베이스 작업을 하고, 그 결과를 반환하는 영역   //

// description: @Repository - @Component의 역할을 하며, Reopostiry임을 명시하기 위해 이름만 Repository 임  //
@Repository 
// description: JpaRepository 인테페이스 - JPA 기반의 Repository 인터페이스를 구현하는데 사용되는 //
// description: JpaRepository<T, ID> - T: 해당 리포지토리에서 사용될 엔터티 클래스, ID: 해당 엔터디 클래스에서 지정한 기본키 필드의 타입 //
public interface UserRepository extends JpaRepository<UserEntity, String>{

    
}
