package com.diginamic.mytaches.services;

import com.diginamic.mytaches.entity.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class UserProfileService {

    public List<UserProfile> search() {
        List<UserProfile> users = new ArrayList<UserProfile>();
        {
            UserProfile user1 = new UserProfile(1, "Jean", "Paul");
            UserProfile user2 = new UserProfile(2, "Marie", "Boulanger");
            UserProfile user3 = new UserProfile(3, "Angèle", "Deluxe");

            users.add(user1);
            users.add(user2);
            users.add(user3);
            return users;
        }
    }
}
