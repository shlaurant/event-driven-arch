package eventdriven;

import java.util.Map;

public class SimpleEventDispatcher implements EventDispatcher {
    private final Map<EventType,EventHandler<Event>> eventHandlers;

    public SimpleEventDispatcher(Map<EventType, EventHandler<Event>> eventHandlers) {
        this.eventHandlers = eventHandlers;
    }

    @Override
    public void dispatch(Event event) {
        eventHandlers.get(event.type()).receive(event);
    }
}
