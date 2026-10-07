package org.SEbushra;

import java.util.ArrayList;
import java.util.List;

//Subject
public class YouTubeChannel {
    private String channelName;
    private List<Subscriber> subscribers=new ArrayList<>();
    private List<Video> videos=new ArrayList<>();

    public YouTubeChannel(String channelName){
        this.channelName=channelName;
    }

    public void publishVideo(Video video){
        videos.add(video);
        notifySubscribers(video);
    }

    private void notifySubscribers(Video video){
        for(Subscriber subscriber: subscribers){
            subscriber.notify(video);
        }
    }

    public void setSubscriber(Subscriber subscriber){
        if(subscribers.contains(subscriber)==false){
            subscribers.add(subscriber);
            System.out.println(subscriber.getName()+" subscribes the "+channelName+" channel");
        }
    }

    public void removeSubscriber(Subscriber subscriber){
        if(subscribers.contains(subscriber)==true){
            subscribers.remove(subscriber);
            System.out.println(subscriber.getName()+" unSubscribes the "+channelName+" channel");
        }
    }

}
