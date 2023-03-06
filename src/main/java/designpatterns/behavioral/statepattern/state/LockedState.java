package designpatterns.behavioral.statepattern.state;

import designpatterns.behavioral.statepattern.context.Player;

public class LockedState extends State {
    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new ReadyState(player));
        return player.unlock();
    }

    @Override
    public String onPlay() {
        return "Locked...";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
