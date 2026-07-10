package BehavioralPatterns.Observer;

public class ObserverDemo {
    public void run()
    {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber = new Subscriber("Aman");
        Subscriber subscriber2 = new Subscriber("Raman");

        channel.subscribe(subscriber2);
        channel.subscribe(subscriber);
        channel.notifyChanges();

        channel.unsubscribe(subscriber);
        channel.notifyChanges();

    }
}
