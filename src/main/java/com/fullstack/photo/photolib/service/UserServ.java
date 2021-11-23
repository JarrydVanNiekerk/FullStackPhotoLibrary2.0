package com.fullstack.photo.photolib.service;

import com.fullstack.photo.photolib.profile.UserProfile;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserServ {
    public UserProfile saveUserProfile(UserProfile userProfile);

    public List<UserProfile> getAllUserProfiles();

}