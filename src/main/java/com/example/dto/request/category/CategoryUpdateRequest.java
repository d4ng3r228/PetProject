package com.example.dto.request.category;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CategoryUpdateRequest {
    @NotNull(message = "Id cannot be Null")
    private Long id;
    private String name;
    private Long topicality;
}
