package eventdriven;

public interface EventHandler<E extends Event> {
    void receive(E event);
}
