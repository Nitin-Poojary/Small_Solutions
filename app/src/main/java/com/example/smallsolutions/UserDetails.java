package com.example.smallsolutions;
import java.io.Serializable;

class UserDetails implements Serializable {

    private String userName, userEmail,  userPhoneNo, age, experience, profession, imageURL, time, uid, chatPath, lastMessage, lastTime;

    public UserDetails() {
//        Empty constructor needed
    }



    public UserDetails(String userName, String userPhoneNo, String profession, String time, String imageURL){
        this.userName = userName;
        this.userPhoneNo = userPhoneNo;
        this.profession = profession;
        this.time = time;
        this.imageURL = imageURL;
    }

    public UserDetails(String userName, String userEmail, String userPhoneNo) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNo = userPhoneNo;
    }

    public UserDetails(String userName, String userEmail, String userPhoneNo, String age, String experience, String profession) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNo = userPhoneNo;
        this.age = age;
        this.experience = experience;
        this.profession = profession;
    }

    public UserDetails(String chatPath, String imageURL, String profession, String userName) {
        this.chatPath = chatPath;
        this.imageURL = imageURL;
        this.userName = userName;
        this.profession = profession;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
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

    public String getImageURL(){
        return imageURL;
    }
    
    public String getTime() {
        return time;
    }

    public String getUid() {
        return uid;
    }

    public String getChatPath() {
        return chatPath;
    }
}
