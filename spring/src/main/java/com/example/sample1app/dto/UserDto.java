package com.example.sample1app.dto;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private String email;
    private boolean isActive;

    public UserDto(int id, String name, String email, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }
}
