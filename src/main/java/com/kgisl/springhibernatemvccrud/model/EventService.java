package com.kgisl.springhibernatemvccrud.model;
import java.util.List;

public interface EventService {

    public List<Event> getAll();

    public void save(Event event);

  //  public void find(long id);

    public void delete(Long id);

    public Event getEventById(long eventId);
    
} 
