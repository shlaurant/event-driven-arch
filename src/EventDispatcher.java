public interface EventDispatcher {
    <T extends Event> void dispatch(T event);
}
