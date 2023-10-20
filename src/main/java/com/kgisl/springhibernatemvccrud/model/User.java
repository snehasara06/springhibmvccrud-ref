package com.kgisl.springhibernatemvccrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="tab_user")
public class User {
    
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private long id;

    
   @Column(name = "user_name")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   @NotEmpty(message="Please Enter your name")
   private String name;
 
   @Column(name = "user_email", unique = true)
   @Email(message = "{user.email.invalid}")
   @NotEmpty(message="Please Enter your email")
   private String email;

public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

   
}
