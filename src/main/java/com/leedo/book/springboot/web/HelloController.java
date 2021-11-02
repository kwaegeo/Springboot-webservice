package com.leedo.book.springboot.web;


import com.leedo.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  //컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다.
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){ //@RequestParam - 외부 API로 넘긴 파라미터를 가져오는 어노테이션  외부에서 "name" 이란 이름으로 넘긴 파라미터를 메소드의 파라미터에 저장하게됨.
        return new HelloResponseDto(name, amount);
    }
}
