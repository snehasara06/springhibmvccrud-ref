package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kgisl.springhibernatemvccrud.model.Agenda;
import com.kgisl.springhibernatemvccrud.model.AgendaDao;
import com.kgisl.springhibernatemvccrud.model.AgendaService;


@Service("agendaService")
public class AgendaServiceImp implements AgendaService {

    @Autowired
    private AgendaDao agendaDao;

    @Transactional(readOnly = true)
    public List<Agenda> getAll() {
        return agendaDao.findAll();
    }

    @Transactional
    public void save(Agenda agenda) {
        agendaDao.saveAndFlush(agenda);

    }

    @Transactional
    public void find(Long id) {
         agendaDao.findOne(id);
    }

    @Transactional
    public void delete(long id) {
        agendaDao.delete(id);
    }

}

