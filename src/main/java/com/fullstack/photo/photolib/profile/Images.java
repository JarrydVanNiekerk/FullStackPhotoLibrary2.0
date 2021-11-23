package com.fullstack.photo.photolib.profile;

import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "image_link")
    private String image_link;
    @Column(name ="userID")
    private UUID userProfile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public UUID getUserProfile() {
        return userProfile;
    }

    public void setUser(UUID userProfile) {
        this.userProfile = userProfile;
    }
}
