package designpatterns.behavioral.statepattern.context;

import designpatterns.behavioral.statepattern.state.ReadyState;
import designpatterns.behavioral.statepattern.state.State;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Player {
    private State state;
    private final int tracksCount;
    private final List<String> tracks;
    private int currentTrack;
    private boolean playing;

    public Player(int tracksCount) {
        this.state = new ReadyState(this);
        this.tracksCount = tracksCount;
        this.tracks = new ArrayList<>();
        addTracks();
        this.currentTrack = 0;
        this.playing = false;
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String startPlayback() {
        return playTrack(currentTrack);
    }

    public String stopPlayback() {
        playing = false;
        return "Track " + currentTrack + " stopped...";
    }

    public String nextTrack() {
        currentTrack = (currentTrack + 1) % tracksCount;
        return playTrack(currentTrack);
    }

    public String previousTrack() {
        currentTrack = (currentTrack - 1 + tracksCount) % tracksCount;
        return playTrack(currentTrack);
    }

    public String lock() {
        final StringBuilder response = new StringBuilder();
        if (playing) response.append(stopPlayback()).append("\n");
        response.append("Player locked...");
        return response.toString();
    }

    public String unlock() {
        return "Player unlocked...";
    }

    private String playTrack(int currentTrack) {
        playing = true;
        return "Playing " + tracks.get(currentTrack) + "...";
    }

    private void addTracks() {
        IntStream.range(0, tracksCount).forEach(i -> tracks.add("Track " + i));
    }
}
