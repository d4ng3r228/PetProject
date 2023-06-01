package com.example.dto.request.category;

import lombok.Data;

@Data
public class CategoryUpdateRequest {
    private Long id;
    private String name;
    private Long topicality;
}
