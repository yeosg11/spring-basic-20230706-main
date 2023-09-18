package com.yeosg1.basic.service;

import org.springframework.http.ResponseEntity;

import com.yeosg1.basic.dto.request.PostUserRequestDto;
import com.yeosg1.basic.dto.response.PostUserResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);

}
