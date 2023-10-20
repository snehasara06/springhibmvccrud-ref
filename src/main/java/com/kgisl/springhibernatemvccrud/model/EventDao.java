package com.kgisl.springhibernatemvccrud.model;

import java.util.List;


public interface EventDao {
   
    public List<Event> findAll();

    public void saveAndFlush(Event event);

    public Event findOne(long id);


    public void delete(Long id);

    
}