package eventdriven;

import test.ButtonEventHandler;

import java.util.Map;

public class SimpleEventDispatcher implements EventDispatcher {
    private final Map<EventType,EventHandler> eventHandlers;

    public SimpleEventDispatcher(Map<EventType, EventHandler> eventHandlers) {
        this.eventHandlers = eventHandlers;
    }

    @Override
    public void dispatch(Event event) {
        eventHandlers.get(event.type()).receive(event);
    }
}
