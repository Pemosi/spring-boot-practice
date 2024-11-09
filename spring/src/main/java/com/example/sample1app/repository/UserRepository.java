package com.example.sample1app.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.sample1app.entity.UserEntity;

@Repository
public class UserRepository {
    // ユーザー情報取得 - 一覧
    public List<UserEntity> findUserList() {
        return createStubForUserList();
    }

    // ユーザー情報取得 - 個人
    public UserEntity findUserById(int id) {
        return createStubForUser();
    }

    private List<UserEntity> createStubForUserList() {
        return Arrays.asList(createStubForUser());
    }

    private UserEntity createStubForUser() {
        UserEntity user = new UserEntity();
        user.setName("テスト");
        user.setEmail("aaa@rmail.com");
        user.setActive(true);
        System.out.println(user);
        return user;
    }
}
