package com.example.service;

import com.example.entity.Article;
import com.example.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {
    private ArticleRepository articleRepository;
    public List<Article> article(){
        return articleRepository.findAll();
    }
    public Article add(Article article){
        return articleRepository.save(article);
    }
}