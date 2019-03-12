public interface EventCentral {
    void register(Event event, EventReceiver eventReceiver);

    void send(Event event) throws Exception;
}
