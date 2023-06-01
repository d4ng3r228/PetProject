package com.example.dto.response.category;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CategoryResponse {
    private Long id;
    private String name;
    private Long topicality;
}
