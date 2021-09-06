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
public class Users implements Observer {
 private String name;
    private ClothingBrand clothingbrand = new ClothingBrand();
    
    public Users(String name)
    {
        super();
        this.name=name;
    }
    
    @Override
    public void update(){
        System.out.println("\nHey " + name + "!" + clothingbrand.title);
    }
    
    @Override
    public void subscribeBrand(ClothingBrand cb)
    {
    clothingbrand = cb;
    }   
}
