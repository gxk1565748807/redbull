package com.luckin.redbull.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class User {
    private String id;
    @NonNull
    private int age;

    @NonNull
    private String profession;
    @NonNull
    private String gender;
    @NonNull
    private String name;
    private String username;
    @NonNull
    private String password;

    public User(int age, String profession, String gender, String name, String username, String password) {
        this.age = age;
        this.profession = profession;
        this.gender = gender;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
