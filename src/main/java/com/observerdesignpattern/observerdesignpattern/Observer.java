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
public interface Observer {

    void subscribeBrand(ClothingBrand cb);

    void update();
    
}
