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
public class Brand {
    public static void main(String[] args)
    {
        ClothingBrand Nike = new ClothingBrand();
        Users user1 = new Users("Micheal");
        Users user2 = new Users("Blake");
        Users user3 = new Users("Gray");
        Users user4 = new Users("Amelia");
        Users user5 = new Users("Ava");
        
        Nike.subscribe(user1);
        Nike.subscribe(user2);
        Nike.subscribe(user3);
        Nike.subscribe(user4);
        Nike.subscribe(user5);
        
        user1.subscribeBrand(Nike);
        user2.subscribeBrand(Nike);
        user3.subscribeBrand(Nike);
        user4.subscribeBrand(Nike);
        user5.subscribeBrand(Nike);
        
        Nike.notifyUsers(" New collection arrives in store.");
        
        Nike.unSubscribe(user2);
        
        Nike.notifyUsers(" Get Exited: SEASON SALE has started.");
    }
}
