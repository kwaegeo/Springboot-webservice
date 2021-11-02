package com.leedo.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){

        String name ="test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);  //검증메서드로써 검증하고싶은 대상을 인자로 받아 같은지 검사
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
