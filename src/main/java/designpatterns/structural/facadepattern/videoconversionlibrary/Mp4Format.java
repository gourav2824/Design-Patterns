package designpatterns.structural.facadepattern.videoconversionlibrary;

public class Mp4Format implements Format {
    @Override
    public String getFormat() {
        return "mp4";
    }
}
