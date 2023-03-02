package designpatterns.structural.facadepattern;

import designpatterns.structural.facadepattern.videoconversionlibrary.AudioMixer;
import designpatterns.structural.facadepattern.videoconversionlibrary.Format;
import designpatterns.structural.facadepattern.videoconversionlibrary.FormatFactory;
import designpatterns.structural.facadepattern.videoconversionlibrary.VideoConverter;

// A Facade for providing a simple interface to a complex video conversion library

public class VideoConversionFacade {
    public VideoFile convertVideo(VideoFile videoFile) {
        System.out.println("Video Conversion Facade: conversion started...");

        final Format format = FormatFactory.extractFormat(videoFile);

        if (format == null) {
            System.out.println("Video Conversion Facade: invalid video file format");
            return null;
        }

        final VideoConverter videoConverter = new VideoConverter();
        final VideoFile convertedFile = videoConverter.convert(videoFile, format);

        final VideoFile finalFile = new AudioMixer().fix(convertedFile);

        System.out.println("Video Conversion Facade: conversion completed...");

        return finalFile;
    }
}
