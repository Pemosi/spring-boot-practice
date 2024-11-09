package com.example.sample1app.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private boolean isActive;
    private Date createdAt; // creatDatetime
    private Date updatedAt; // creatDatetime

    public String toString() {
        return String.format("ID=%d\nName=%s\nisActive=", id, name, isActive);
    }
}
