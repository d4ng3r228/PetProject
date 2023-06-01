package com.example.dto.request.category;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CategoryCreateRequest {
    @NotNull(message = "name cannot be null")
    private String name;
    private Long topicality;

}
