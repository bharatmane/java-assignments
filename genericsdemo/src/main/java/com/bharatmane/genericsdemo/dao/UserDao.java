package com.bharatmane.genericsdemo.dao;

import java.util.ArrayList;
import java.util.List;

public class UserDao<T> {
    private final List<T> users = new ArrayList<>();

    public void create(T user){
        users.add(user);
    }

    public void update(T user){
       T foundUser = users.stream().filter(u -> u.equals(user)).findFirst().get();
       users.remove(foundUser);
       users.add(user);
    }
    public void delete(T user){
        T foundUser = users.stream().filter(u -> u.equals(user)).findFirst().get();
        users.remove(foundUser);
    }
    public T get(T user){
        return users.stream().filter(u -> u.equals(user)).findFirst().get();
    }

    public List<T> getAllUsers(){
        return users;
    }
}
