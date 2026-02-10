package org.example.messengers;

import org.example.classwork.UserProfile;

public class SAppMessenger {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Катя", false, 45);
        userProfile.setUserAge(46);
        System.out.println(userProfile.getUserAge());
    }
}
