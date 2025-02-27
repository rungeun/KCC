package com.example.KCC.dto;

import com.example.KCC.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class ArticleForm {
    private Long id;
    private String email;
    private String password;

    public Article toEntity() {
    return new Article(id, email, password);
    }
}
