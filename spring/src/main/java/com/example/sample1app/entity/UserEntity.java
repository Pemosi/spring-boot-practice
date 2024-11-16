package com.example.sample1app.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserEntity {
    private Integer id;
    private String name;
    private String email;
    private boolean isActive;
    private LocalDateTime createdAt; // creatDatetime
    private LocalDateTime updatedAt; // creatDatetime

    @Override
    public String toString() {
        return String.format("ID=%d\nName=%s\nisActive=%b", id, name, isActive);
    }

    /// スタブ用
    public UserEntity(Integer id, String name, String email, boolean isActive) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setActive(isActive);
        LocalDateTime now = LocalDateTime.now();
        this.setCreatedAt(now);
        this.setUpdatedAt(now);
    }
}