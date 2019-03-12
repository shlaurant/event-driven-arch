import java.util.EnumMap;
import java.util.Map;

public final class EventCentralImpl implements EventCentral {
    private final Map<EventClass, EventReceiver> mapRegistry = mapRegistry();

    @Override
    public void register(Event event, EventReceiver eventReceiver) {
        mapRegistry.put(event.eventClass(), eventReceiver);
    }

    @Override
    public void send(Event event) throws Exception {
        if (mapRegistry.containsKey(event.eventClass())) {
            EventReceiver eventReceiver = mapRegistry.get(event.eventClass());
            receive(event, eventReceiver);
        } else {
            throw notRegisteredException(event);
        }
    }

    private EnumMap<EventClass, EventReceiver> mapRegistry() {
        return new EnumMap<>(EventClass.class);
    }

    private void receive(Event event, EventReceiver eventReceiver) throws Exception {
        try {
            eventReceiver.receive(event);
        } catch (ClassCastException e) {
            throw new Exception("tried to send event " + event.toString()
                    + " to receiver " + eventReceiver.toString()
                    + ", but failed to cast event properly. you must have" +
                    " registered wrong receiver", e);
        }
    }

    private Exception notRegisteredException(Event event) {
        return new Exception("No such value for key "
                + event.eventClass().toString() + " exists");
    }
}
