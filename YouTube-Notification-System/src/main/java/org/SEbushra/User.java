package org.SEbushra;

//Concrete Observers
public class User implements Subscriber{
    String username;

    User(String username){
        this.username=username;
    }

    @Override
    public void notify(Video video){
        System.out.println(username+" received notification: "+video.getTitle()+" from "+video.getChannelName());
    }

    @Override
    public void subscribes(YouTubeChannel youTubeChannel){
        youTubeChannel.setSubscriber(this);
    }

    @Override
    public void unsubscribe(YouTubeChannel youTubeChannel){
        youTubeChannel.removeSubscriber(this);
    }

    @Override
    public String getName(){
        return this.username;
    }
}
