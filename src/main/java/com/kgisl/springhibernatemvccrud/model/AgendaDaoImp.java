package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AgendaDaoImp implements AgendaDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Agenda> findAll() {
      TypedQuery<Agenda> query=sessionFactory.getCurrentSession().createQuery("from Agenda");
        return query.getResultList();
    }

    @Override
    public void saveAndFlush(Agenda agenda) {
        sessionFactory.getCurrentSession().save(agenda);
    }

    @Override
    public void findOne(Long id) {
      
    }

    @Override
    public void delete(long id) {
        
    }


   
}