/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threadexercise;

/**
 *
 * @author Gabriele
 */
public class Counter {
    int counter = 0;
    
    synchronized void increment(){
        counter++;
    }
    
    synchronized void decrement(){
        counter--;
    }
    
    void printFinalCounterValue() {
        System.out.println("counter is: " + counter);
    }
}
