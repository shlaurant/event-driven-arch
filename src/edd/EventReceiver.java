package edd;

public interface EventReceiver<T extends Event> {
    void receive(T event);
}
