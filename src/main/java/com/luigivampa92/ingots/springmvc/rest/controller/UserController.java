package com.luigivampa92.ingots.springmvc.rest.controller;

import com.luigivampa92.ingots.springmvc.data.model.UserModel;
import com.luigivampa92.ingots.springmvc.data.service.UserDataService;
import com.luigivampa92.ingots.springmvc.rest.model.UserListResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDataService userDataService;

    @RequestMapping(value = {"all", "all/"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserListResponse getAllUsers() {
        LOG.warn("getAllUsers() called");

        List<UserModel> allUsers = userDataService.getAllUsers();
        return new UserListResponse(allUsers);
    }
}