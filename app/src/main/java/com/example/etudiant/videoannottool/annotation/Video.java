package com.example.etudiant.videoannottool.annotation;

import com.example.etudiant.videoannottool.annotation.Annotation;

import java.util.ArrayList;
import java.util.List;

public class Video{

    private String fileName;
    private String path;
    private VideoAnnotation videoAnnotation;

    public Video() {
    }

    public Video(String fileName, String path, VideoAnnotation videoAnnotation) {
        this.fileName = fileName;
        this.path = path;
        this.videoAnnotation = videoAnnotation;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VideoAnnotation getVideoAnnotation() {
        return videoAnnotation;
    }

    public void setVideoAnnotation(VideoAnnotation videoAnnotation) {
        this.videoAnnotation = videoAnnotation;
    }


    /*
    public List<Object> getAllAnnotationObject(){
        List<Object> objectList = new ArrayList<>();

        // Faire vérification du Null
        if(videoAnnotation.getTextAnnotationArrayList()!=null){
            objectList.addAll(videoAnnotation.getTextAnnotationArrayList());
        }

        if(videoAnnotation.getAudioAnnotationArrayList()!=null){
            objectList.addAll(videoAnnotation.getAudioAnnotationArrayList());
        }

        if(videoAnnotation.getDrawAnnotationArrayList()!=null){
            objectList.addAll(videoAnnotation.getDrawAnnotationArrayList());
        }

        if(videoAnnotation.getSlowMotionAnnotationArrayList()!=null){
            objectList.addAll(videoAnnotation.getSlowMotionAnnotationArrayList());
        }

        if(videoAnnotation.getZoomMotionAnnotationArrayList()!=null){
            objectList.addAll(videoAnnotation.getZoomMotionAnnotationArrayList());
        }

        return  objectList;
    }
    */
}
