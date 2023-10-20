package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

public interface AgendaService {

    public List<Agenda> getAll();

    public void save(Agenda agenda);

    public void find(Long id);

    public void delete(long id);
    
} 


