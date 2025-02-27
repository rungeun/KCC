package com.example.KCC.repository;

import com.example.KCC.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findByEmail(String email);
}
