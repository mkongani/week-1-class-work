/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerdesignpattern.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohit Computers
 */
public class ClothingBrand implements Subject {
    private List<Users> users = new ArrayList<>();
    String title;
    
    @Override
    public void subscribe(Users user)
    {
        users.add(user);
    }
    
    @Override
    public void unSubscribe(Users user)
    {
        users.remove(user);
    }
    
    @Override
    public void notifyUsers(String title)
    {
                this.title = title;
        for(Users user : users)
        {
            user.update();
        }
    }

    
    
    
}
