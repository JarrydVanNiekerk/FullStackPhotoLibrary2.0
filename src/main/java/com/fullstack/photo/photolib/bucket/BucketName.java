package com.fullstack.photo.photolib.bucket;

public enum BucketName {
//s3 bucket Name;
    PROFILE_IMAGE("nwu-images-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
