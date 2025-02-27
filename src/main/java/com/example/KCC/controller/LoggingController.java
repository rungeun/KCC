package com.example.KCC.controller;

import com.example.KCC.dto.ArticleForm;
import com.example.KCC.entity.Article;
import com.example.KCC.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoggingController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("/login")
    public String logging(@RequestBody ArticleForm dto) {
        // 요청 바디 확인 (콘솔 로그)
        log.info("요청 DTO: {}", dto.toString());

        // DTO -> Entity 변환
        Article article = dto.toEntity();
        log.info("로그인 요청 Entity: {}", article.toString());

        // DB 조회
        Article target = articleRepository.findByEmail(article.getEmail());
        if (target == null) {
            return "로그인 실패: 존재하지 않는 이메일";
        }

        // 비밀번호 비교
        if (target.getPassword().equals(article.getPassword())) {
            return "로그인 성공";
        } else {
            return "로그인 실패: 비밀번호 불일치";
        }
    }
}
