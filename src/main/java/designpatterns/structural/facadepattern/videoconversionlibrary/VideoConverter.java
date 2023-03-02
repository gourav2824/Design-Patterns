package designpatterns.structural.facadepattern.videoconversionlibrary;

import designpatterns.structural.facadepattern.VideoFile;

public class VideoConverter {
    public static final String MP4 = "mp4";
    public static final String MKV = "mkv";

    public VideoFile convert(VideoFile file, Format format) {
        final String fileName = file.getName().substring(0, file.getName().indexOf("."));
        if (format.getFormat().equals(MP4)) {
            System.out.println("Video Converter: converting video from " + MP4 + " to " + MKV + "...");
            return new VideoFile(fileName + "." + MKV);
        } else {
            System.out.println("Video Converter: converting video from " + MKV + " to " + MP4 + "...");
            return new VideoFile(fileName + "." + MP4);
        }
    }
}
