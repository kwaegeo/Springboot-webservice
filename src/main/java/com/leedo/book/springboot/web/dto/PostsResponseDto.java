package com.leedo.book.springboot.web.dto;

import com.leedo.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    //entity필드의 일부만 사용하기때문에 생성자로 entity 를 받아서 필드에 값을 저장한다.
    }
}
