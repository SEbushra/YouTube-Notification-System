package org.SEbushra;

//Observer
public interface Subscriber {

    public void notify(Video video);

    public void subscribes(YouTubeChannel youTubeChannel);

    public void unsubscribe(YouTubeChannel youTubeChannel);

    public String getName();

}
