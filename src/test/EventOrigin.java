package test;

import eventdriven.ButtonEvent;
import eventdriven.EventDispatcher;

public class EventOrigin {
    private final EventDispatcher dispatcher;

    public EventOrigin(EventDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    private void makeEvent() {
        dispatcher.dispatch(new BigButtonEvent());
    }
}
