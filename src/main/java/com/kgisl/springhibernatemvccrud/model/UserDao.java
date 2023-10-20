package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

public interface UserDao {

    public void save(User user);

    public List<User> list();
       
    }
    

