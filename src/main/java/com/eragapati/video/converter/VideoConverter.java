package com.eragapati.video.converter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class VideoConverter {


    public static void main(String[] args) {

        File directory = new File("/Users/eragapati/Downloads/convert");
        FilenameFilter webmFilter = (dir, name) -> name.toLowerCase().endsWith(".webm");
        File[] files = directory.listFiles(webmFilter);

        if (files != null) {
            for (File file : files) {
                String inputFilename = file.getAbsolutePath();
                String outputFilename = inputFilename.replaceAll(".webm", ".mp4");
                ProcessBuilder processBuilder = new ProcessBuilder("ffmpeg", "-i", inputFilename, outputFilename);

                try {
                    Process process = processBuilder.start();
                    process.waitFor();
                    System.out.println("Conversion completed! " + inputFilename +" -> "+ outputFilename);
                    file.delete();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

