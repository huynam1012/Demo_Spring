package com.diginamic.mytaches.controller;

import com.diginamic.mytaches.entity.UserProfile;
import com.diginamic.mytaches.services.UserProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserProfileController {

    UserProfileService userProfileService = new UserProfileService();

    @RequestMapping(method = RequestMethod.GET)
    public List<UserProfile> getAll() {
        List<UserProfile> users = userProfileService.search();
        return users;
    }

    @RequestMapping(path = "{userId}", method = RequestMethod.GET)
    public UserProfile read (@PathVariable (name = "userId") Integer id){
        UserProfile user = new UserProfile();
        user.setId(id);
        return user;
    }
}
