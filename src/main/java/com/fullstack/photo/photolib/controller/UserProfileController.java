package com.fullstack.photo.photolib.controller;

import com.fullstack.photo.photolib.profile.UserProfile;
import com.fullstack.photo.photolib.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/user-profile")
@CrossOrigin("*")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
    @PostMapping("/add")
    public String add(@RequestBody UserProfile userProfile){
        userProfileService.saveUserProfile(userProfile);
        return "New User added";
    }
    @GetMapping
    public List<UserProfile> getAllUserProfiles() {
        return userProfileService.getAllUserProfiles();
    }

    @PostMapping(
            path = "{userProfileId}/image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @CrossOrigin("*")
    public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId,
                                       @RequestParam("file") MultipartFile file) {
        userProfileService.uploadUserProfileImage(userProfileId, file);
    }

    @GetMapping("{userProfileId}/image/download")
    public byte[] downloadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId) {
        return userProfileService.downloadUserProfileImage(userProfileId);
    }
    @PutMapping(path= "/image/upload")
    public UserProfile update(@RequestBody UserProfile userProfile){
        return userProfileService.saveUserProfile(userProfile);
    }


}
