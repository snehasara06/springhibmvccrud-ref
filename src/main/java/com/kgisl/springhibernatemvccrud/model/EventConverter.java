package com.kgisl.springhibernatemvccrud.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EventConverter implements Converter<String, Event> {

    @Autowired
    private EventService eventService;

    @Override
    public Event convert(String eventId) {
        if (eventId == null || eventId.isEmpty()) {
            return null;
        }

        long id=Long.parseLong(eventId);
        Event event = eventService.getEventById(id);

        return event;
    }
}
