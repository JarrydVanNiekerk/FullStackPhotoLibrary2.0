package com.fullstack.photo.photolib.bucket;

public enum BucketName {
//s3 bucket Name;
    PROFILE_IMAGE("photos-lib");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
