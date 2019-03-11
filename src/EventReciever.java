public interface EventReciever<T extends Event> {
    void recieve(T event);
}
