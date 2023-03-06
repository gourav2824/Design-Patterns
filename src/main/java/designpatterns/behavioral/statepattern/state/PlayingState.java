package designpatterns.behavioral.statepattern.state;

import designpatterns.behavioral.statepattern.context.Player;

public class PlayingState extends State {
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return player.lock();
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return player.stopPlayback();
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
