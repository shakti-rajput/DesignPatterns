package BehavioralPatterns.Observer;

interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Object ob);

    void notifyChanges();
}
