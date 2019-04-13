package test;

import eventdriven.ButtonEvent;
import eventdriven.EventHandler;

public class ButtonEventHandler implements EventHandler<ButtonEvent> {
    @Override
    public void receive(ButtonEvent event) {
        event.buttonName();
        event.buttonSize();
    }
}
