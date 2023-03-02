package designpatterns.structural.facadepattern.videoconversionlibrary;

public class MkvFormat implements Format {
    @Override
    public String getFormat() {
        return "mkv";
    }
}
