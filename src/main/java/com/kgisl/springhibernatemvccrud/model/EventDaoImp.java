package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventDaoImp implements EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Event> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Event", Event.class).getResultList();
    }

    @Override
    public void saveAndFlush(Event event) {
        Session session = sessionFactory.getCurrentSession();
        session.save(event);
    }

    @Override
    public Event findOne(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Event.class, id);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Event event = session.get(Event.class, id);
        if (event != null) {
            session.delete(event);
        }
    }
}
