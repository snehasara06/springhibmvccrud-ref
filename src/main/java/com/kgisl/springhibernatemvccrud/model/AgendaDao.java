package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

public interface AgendaDao {
   
    public List<Agenda> findAll();

    public void saveAndFlush(Agenda event);

    public void findOne(Long id);


    public void delete(long id);

    
}