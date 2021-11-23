package com.fullstack.photo.photolib.service;

import com.fullstack.photo.photolib.datastore.UserRepo;
import com.fullstack.photo.photolib.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final UserRepo userRepo;

    @Autowired
    public UserProfileDataAccessService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserProfile> getUserProfiles() {
        return userRepo.findAll();
    }
}
