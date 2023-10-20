package com.kgisl.springhibernatemvccrud.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kgisl.springhibernatemvccrud.model.Event;
import com.kgisl.springhibernatemvccrud.model.EventDao;
import com.kgisl.springhibernatemvccrud.model.EventService;


@Service("eventService")
public class EventServiceImp implements EventService {

    @Autowired
    private EventDao eventDao;

    @Transactional(readOnly = true)
    public List<Event> getAll() {
        return eventDao.findAll();
    }

    @Transactional
    public void save(Event event) {
        eventDao.saveAndFlush(event);

    }

    // @Transactional
    // public void find(long id) {
    //      eventDao.findOne(id);
    // }

    @Transactional
    public void delete(Long id) {
        eventDao.delete(id);
    }

    
    @Transactional
    public Event getEventById(long eventId) {
         return eventDao.findOne(eventId);
    }

}
