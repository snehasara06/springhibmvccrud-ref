package com.kgisl.springhibernatemvccrud.model;

import java.util.List;


public interface UserService {

    void save(User user);
    
    List<User> list();

}
