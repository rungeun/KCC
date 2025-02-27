package com.example.KCC.repository;

import com.example.KCC.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // 이메일로 사용자 조회
    Article findByEmail(String email);
}
