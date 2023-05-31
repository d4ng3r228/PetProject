package com.example.controller;

import com.example.dto.request.category.CategoryCreateRequest;
import com.example.dto.response.category.CategoryResponse;
import com.example.mapper.CategoryMapperImpl;
import com.example.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    private CategoryMapperImpl categoryMapper;

    @GetMapping
    public List<CategoryResponse> categories(){
        return categoryService.categories().stream().map(categoryMapper::toDto).toList();
    }
    @PostMapping("/add")
    public ResponseEntity<CategoryResponse> addCategory(CategoryCreateRequest categoryDto){
        return new ResponseEntity<>(categoryMapper.toDto(categoryService.add(categoryMapper.fromDto(categoryDto))), HttpStatus.OK);
    }
}
