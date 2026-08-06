package com.alumniconnect.entity;

public class LoginResponse {

    private String role;
    private Object user;

    public LoginResponse() {
    }

    public LoginResponse(String role, Object user) {
        this.role = role;
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}