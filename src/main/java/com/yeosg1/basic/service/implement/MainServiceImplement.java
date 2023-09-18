package com.yeosg1.basic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.yeosg1.basic.dto.request.PostUserRequestDto;
import com.yeosg1.basic.dto.response.PostUserResponseDto;
import com.yeosg1.basic.entity.UserEntity;
import com.yeosg1.basic.repository.UserRepository;
import com.yeosg1.basic.service.MainService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainServiceImplement implements MainService {

    private final UserRepository userRepository;
    @Override
    public String getMethod() {
        return "This method is GET method.";
    }
   
      @Override
    public ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto) {
        
        // INSERT INTO user(email, password, nickname, tel_numnber, address, address_detail)
        // VALUES(dto.getEmail(), dto.getPassword(), ...);

        // description: Create 작업 순서 (INSERT) //
        // description: 1. Entity 인스턴스 생성 //
        UserEntity userEntity = new UserEntity(dto);
        // description: 2. repository의 save 메서드 사용 //
        userRepository.save(userEntity);

        return ResponseEntity.status(HttpStatus.OK).body(new PostUserResponseDto("SU", "SUCCESS"));
    }

}
