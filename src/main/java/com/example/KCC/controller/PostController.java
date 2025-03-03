package com.example.KCC.controller;

import com.example.KCC.entity.Post;
import com.example.KCC.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> index() {
        // DB에서 전체 Post 목록 가져오기
        List<Post> postList = postRepository.findAll();

        // 로그 출력
        log.info("조회된 게시글 수: {}", postList.size());
        log.info("게시글 목록: {}", postList);

        // JSON 형태로 반환 (ResponseBody)
        return postList;
    }
}
