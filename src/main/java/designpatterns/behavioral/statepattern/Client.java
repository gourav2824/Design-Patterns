package designpatterns.behavioral.statepattern;

import designpatterns.behavioral.statepattern.context.Player;

public class Client {
    private static Player player;

    public static void main(String[] args) {
        player = new Player(10);

        clickPlay();

        clickNext();
        clickNext();
        clickNext();

        clickPrevious();

        clickLock();
        clickPlay();
        clickNext();

        clickLock();

        clickPlay();
        clickPlay();

        clickLock();
    }

    private static void clickLock() {
        print(player.getState().onLock());
    }

    private static void clickPlay() {
        print(player.getState().onPlay());
    }

    private static void clickNext() {
        print(player.getState().onNext());
    }

    private static void clickPrevious() {
        print(player.getState().onPrevious());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
