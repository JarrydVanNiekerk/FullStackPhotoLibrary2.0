package com.fullstack.photo.photolib.datastore;
import com.fullstack.photo.photolib.profile.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface UserRepo extends JpaRepository<UserProfile, UUID> {

}

