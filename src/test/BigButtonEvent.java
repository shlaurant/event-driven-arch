package test;

import eventdriven.ButtonEvent;
import eventdriven.EventType;

public class BigButtonEvent implements ButtonEvent {
    @Override
    public String buttonName() {
        return "BigButton";
    }

    @Override
    public int buttonSize() {
        return 100;
    }

    @Override
    public EventType type() {
        return EventType.BIG_BUTTON_EVENT;
    }
}
