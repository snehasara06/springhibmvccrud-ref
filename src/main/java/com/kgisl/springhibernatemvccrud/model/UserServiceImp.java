package com.kgisl.springhibernatemvccrud.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService{


    @Autowired
    private UserDao userDao;


    @Transactional
    public void save(User user) {
       userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        
        return userDao.list();
    }
    
}
