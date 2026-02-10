package org.example.classwork;

public class SMessenger {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Катя", false, 45);
        userProfile.setUserAge(46);
        System.out.println(userProfile.getUserAge());
    }
}
