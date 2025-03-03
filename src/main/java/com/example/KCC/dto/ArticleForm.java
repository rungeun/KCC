package com.example.KCC.dto;

import com.example.KCC.entity.Article;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArticleForm {
    private String email;
    private String password;

    public Article toEntity() {
        return new Article(email, password);
    }
}
