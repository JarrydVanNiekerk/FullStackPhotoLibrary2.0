package com.fullstack.photo.photolib.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Entity
@Table(name = "Users")
public class UserProfile {

    @Id
    private UUID userProfileId;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "ImageLink")
    private String userProfileImageLink;

    public UserProfile(UUID userProfileId, String username,String password,
                       String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.password = password;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UserProfile() {

    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImageLink);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
