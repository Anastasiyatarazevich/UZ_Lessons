package org.example.classwork;

public class UserProfile {
    private String username;
    private int followersCount;
    private boolean isProfileVisible;
    private int userAge;

    public UserProfile(String username, boolean isProfileVisible, int userAge) {
        this.username = username;
        this.isProfileVisible = isProfileVisible;
        this.followersCount = 0;
        this.userAge = userAge;
    }

    void follow() {
        followersCount++;
        System.out.println("Теперь у вас " + followersCount + " подписчиков");
    }

    void toggleVisibility() {
        isProfileVisible = !isProfileVisible;
        if (isProfileVisible) {
            System.out.println("Ваш профиль теперь открыт");
        } else {
            System.out.println("Ваш профиль теперь закрыт");
        }
    }

    //геттеры
    public int getFollowersCount() {
        return followersCount;
    }

    public String getUsername() {
        return username;
    }

    public boolean getIsProfileVisible() {
        return isProfileVisible;
    }

    public int getUserAge(){
        return userAge;
    }

    //сеттеры
    public void setUsername(String username) {
        this.username = username;
    }

    public void setFollowersCount(int followersCount) {
        if (followersCount >= 0) {
            this.followersCount = followersCount;
        } else {
            System.out.println("Такого кол-ва подписчиков быть не может!!! Актуальное кол-во подписчиков: " + this.followersCount);
        }
    }

    public void setProfileVisible(boolean isProfileVisible) {
        this.isProfileVisible = isProfileVisible;
    }

    public void setUserAge(int userAge) {
        if (userAge > 0) {
            this.userAge = userAge;
        } else {
            System.out.println("Такой возраст недопустим в нашем приложении:(");
        }
    }

}

class TestUserProfile {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Mark", true, 10);
        userProfile.follow();
        userProfile.toggleVisibility();
//        userProfile.followersCount = -10;
//        System.out.println(userProfile.followersCount);
//        userProfile.username = "783";
//        userProfile.followersCount = Integer.MAX_VALUE;

        System.out.println(userProfile.getUsername());
        System.out.println(userProfile.getFollowersCount());
        System.out.println(userProfile.getIsProfileVisible());

        userProfile.setUsername("New name");
        userProfile.setFollowersCount(-10);
        userProfile.setFollowersCount(100);
        userProfile.setProfileVisible(false);

        System.out.println(userProfile.getUsername());
        System.out.println(userProfile.getFollowersCount());
        System.out.println(userProfile.getIsProfileVisible());

        System.out.println("-------------------------------");

        userProfile.setUserAge(-2);
        System.out.println(userProfile.getUserAge());
        userProfile.setUserAge(0);
        System.out.println(userProfile.getUserAge());
        userProfile.setUserAge(12);
        System.out.println(userProfile.getUserAge());

    }
}