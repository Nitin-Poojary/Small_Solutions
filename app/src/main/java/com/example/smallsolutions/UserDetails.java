package com.example.smallsolutions;


import java.io.Serializable;

class UserDetails implements Serializable {

    private String userName, userEmail, userPassword, userPhoneNo, age, experience, profession, time;
    private String imageUri;

    public UserDetails() {
    }

    public UserDetails(String userName, String userPhoneNo, String profession, String time, String imageUri) {
        this.userName = userName;
        this.userPhoneNo = userPhoneNo;
        this.profession = profession;
        this.time = time;
        this.imageUri = imageUri;
    }

    public UserDetails(String userName, String userEmail, String userPassword, String userPhoneNo) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNo = userPhoneNo;
    }

    public UserDetails(String userName, String userEmail, String userPassword, String userPhoneNo, String age, String experience, String profession) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNo = userPhoneNo;
        this.age = age;
        this.experience = experience;
        this.profession = profession;
    }



    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public String getAge() {
        return age;
    }

    public String getExperience() {
        return experience;
    }

    public String getProfession() {
        return profession;
    }

    public String getTime() {
        return time;
    }

    public String getImageUri() {
        return imageUri;
    }
}
