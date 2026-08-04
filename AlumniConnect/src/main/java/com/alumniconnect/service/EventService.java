package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Event;

public interface EventService {

    Event addEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(int eventId);

    Event getEventById(int eventId);

    List<Event> getAllEvents();

}