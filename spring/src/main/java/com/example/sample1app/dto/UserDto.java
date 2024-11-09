package com.example.sample1app.dto;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private String email;
    private boolean isActive;
}
