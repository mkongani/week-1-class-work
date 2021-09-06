/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerdesignpattern.observerdesignpattern;

/**
 *
 * @author Mohit Computers
 */
public interface Subject {

    void notifyUsers(String title);

    void subscribe(Users user);

    void unSubscribe(Users user);

    
    
}
