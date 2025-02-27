package com.example.KCC.controller;

import com.example.KCC.dto.ArticleForm;
import com.example.KCC.entity.Article;
import com.example.KCC.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoggingController {
    private ArticleRepository articleRepository;
    @PostMapping
    public String logging(@RequestBody ArticleForm dto) {
        Article article = dto.toEntity();
        Article target = articleRepository.findByEmail(article.getEmail());

        if(target.getPassword().equals(article.getPassword())){
            return "로그인 성공";
        }
        else {
            return "로그인 실패";
        }
    }
}
