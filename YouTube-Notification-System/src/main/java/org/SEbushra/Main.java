package org.SEbushra;

public class Main {
    static void main() {
            Subscriber user1=new User("bushra");
            Subscriber user2=new User("yassooo");
            Subscriber user3=new User("marhan");

            YouTubeChannel youTubeChannel1 = new YouTubeChannel("Java Channel");
            YouTubeChannel youTubeChannel2 = new YouTubeChannel("Gaming Channel");

            user1.subscribes(youTubeChannel1); //bushra java
            user1.subscribes(youTubeChannel2); //bushra game

            user2.subscribes(youTubeChannel2); //yassooo game

            user3.subscribes(youTubeChannel1); //marhan java

            Video video1 = new Video("java oop","Java Channel");
            youTubeChannel1.publishVideo(video1);

            Video video2 = new Video("pac man game","Gaming Channel");
            youTubeChannel2.publishVideo(video2);

            user1.unsubscribe(youTubeChannel1); //bushra java
            user1.unsubscribe(youTubeChannel2); //bushra game

            Video video3 = new Video("XO game","Gaming Channel");
            youTubeChannel2.publishVideo(video3);


        }
    }

