package designpatterns.structural.facadepattern;

@SuppressWarnings("ClassCanBeRecord")
public class VideoFile {
    private final String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
