package com.luigivampa92.ingots.springmvc.rest.model;

import com.luigivampa92.ingots.springmvc.data.model.UserModel;

import java.util.List;

public class UserListResponse {

    private List<UserModel> response;

    public UserListResponse() {}

    public UserListResponse(List<UserModel> response) {
        this.response = response;
    }

    public List<UserModel> getResponse() {
        return response;
    }

    public void setResponse(List<UserModel> response) {
        this.response = response;
    }
}
