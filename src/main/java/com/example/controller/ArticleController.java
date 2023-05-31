package com.example.controller;

import com.example.service.ArticleService;
import com.example.dto.request.article.ArticleCreateRequest;
import com.example.dto.response.article.ArticleResponse;
import com.example.mapper.ArticleMapperImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private ArticleService articleService;
    private ArticleMapperImpl articleMapper;

    @GetMapping
    public List<ArticleResponse> articles(){
        return articleService.article().stream().map(articleMapper::toDto).toList();
    }
    @PostMapping("/add")
    public ResponseEntity<ArticleResponse> addArticle(ArticleCreateRequest articleDto){
        return new ResponseEntity<>(articleMapper.toDto(articleService.add(articleMapper.fromDto(articleDto))), HttpStatus.OK);
    }
}
