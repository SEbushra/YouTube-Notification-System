package org.SEbushra;

public class Video {
    private static int numOfVideos=0;
    private String title;
    private String channelName;
    private int videoId;

    public Video(String title,String channelName){
        this.title=title;
        this.channelName=channelName;
        this.videoId=numOfVideos++;

    }

    public String getTitle(){
        return this.title;
    }

    public String getChannelName(){
        return this.channelName;
    }


}
