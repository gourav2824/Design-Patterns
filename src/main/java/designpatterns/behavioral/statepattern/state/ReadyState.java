package designpatterns.behavioral.statepattern.state;

import designpatterns.behavioral.statepattern.context.Player;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return player.lock();
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayingState(player));
        return player.startPlayback();
    }

    @Override
    public String onNext() {
        player.changeState(new PlayingState(player));
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        player.changeState(new PlayingState(player));
        return player.previousTrack();
    }
}
