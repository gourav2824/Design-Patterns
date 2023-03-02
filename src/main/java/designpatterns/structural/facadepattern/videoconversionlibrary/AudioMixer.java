package designpatterns.structural.facadepattern.videoconversionlibrary;

import designpatterns.structural.facadepattern.VideoFile;

public class AudioMixer {
    public VideoFile fix(VideoFile file) {
        System.out.println("Audio Mixer: fixing the audio...");
        return file;
    }
}
