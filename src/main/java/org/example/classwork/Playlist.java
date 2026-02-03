package org.example.classwork;

public class Playlist {
    String title;
    int trackCount;
    boolean isShared;

    Playlist(String title, boolean isShared) {
        this.title = title;
        this.trackCount = 0;
        this.isShared = isShared;
    }

    void addTrack() {
        trackCount++;
        System.out.println("Трек добавлен. Всего треков: " + trackCount);
    }

    void play() {
        if (trackCount == 0) {
            System.out.println("Плейлист пуст. Добавьте треки!");
        } else {
            System.out.println("Играет плейлист '" + title + "' (" + trackCount + " треков)");
        }
    }

    void toggleSharing() {
        isShared = !isShared;
        if (isShared) {//isShared == true
            System.out.println("Плейлист теперь расшарен");
        } else {
            System.out.println("Плейлист теперь только у вас");
        }
    }

    void printInfo() {
        if (isShared) {
            System.out.println(title + " — " + trackCount + " треков, расшарен");
        } else {
            System.out.println(title + " — " + trackCount + " треков, только у вас");
        }
    }

}

class TestPlaylist {
    public static void main(String[] args) {
//        exampleMethod();

        Playlist playlist1 = new Playlist("Плейлист для тренировки", false);
//        System.out.println(playlist1.title);
//        System.out.println(playlist1.trackCount);
//        System.out.println(playlist1.isShared);
        playlist1.play();
        playlist1.addTrack();
        playlist1.printInfo();
        playlist1.toggleSharing();

        System.out.println("------------------------------------------");

        Playlist playlist2 = new Playlist("Плейлист для работы", true);
//        System.out.println(playlist2.title);
//        System.out.println(playlist2.trackCount);
//        System.out.println(playlist2.isShared);
        playlist2.addTrack();
        playlist2.addTrack();
        playlist2.addTrack();
        playlist2.printInfo();
        playlist2.toggleSharing();
        playlist2.play();
        playlist2.printInfo();
    }

    static void exampleMethod() {
    }
}