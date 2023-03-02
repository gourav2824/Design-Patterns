package designpatterns.structural.facadepattern.videoconversionlibrary;

import designpatterns.structural.facadepattern.VideoFile;

public class FormatFactory {
    public static Format extractFormat(VideoFile file) {
        final String fileName = file.getName();
        final String format = fileName.substring(fileName.indexOf(".") + 1);

        switch (format) {
            case "mp4" -> {
                System.out.println("Format Factory: extracting mp4 format...");
                return new Mp4Format();
            }
            case "mkv" -> {
                System.out.println("Format Factory: extracting mkv format...");
                return new MkvFormat();
            }
            default -> {
                System.out.println("Format Factory: invalid file format");
                return null;
            }
        }
    }
}
