package designpatterns.structural.facadepattern;

public class Client {
    public static void main(String[] args) {
        final VideoFile video = new VideoFile("funny-video.mkv");
        System.out.println("Initial Video = " + video.getName());

        final VideoConversionFacade videoConverter = new VideoConversionFacade();
        final VideoFile convertedVideo = videoConverter.convertVideo(video);

        System.out.println("Final Video = " + convertedVideo.getName());
    }
}
