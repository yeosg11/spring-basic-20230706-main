package com.yeosg1.basic.dto.response;

import lombok.Getter;

@Getter
public class PostUserResponseDto extends ResponseDto{

    public PostUserResponseDto(String code, String message) {
        super(code, message);
    }


    
}
