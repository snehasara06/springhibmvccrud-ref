package com.kgisl.springhibernatemvccrud.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long agendaId;

    @Column
    private String time;

    @Column
    private String description;

    @Column 
    private String instructor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="eventId", updatable = false, insertable = true)
    private Event event;

    public Agenda()
    {
        super();
    }

    //getters and setters

    public Long getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(Long agendaId) {
        this.agendaId = agendaId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

 
    
    
    
}
