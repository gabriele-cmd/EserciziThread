/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Gabriele
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Corridore c1 = new Corridore("Mario");
        Corridore c2 = new Corridore("Luca");
        Corridore c3 = new Corridore("Beppe");
        Corridore c4 = new Corridore("Francesco");
        
        Classifica classifica = new Classifica();
        classifica.addCorridore(c1);
        classifica.addCorridore(c2);
        classifica.addCorridore(c3);
        classifica.addCorridore(c4);
        
        System.out.println(classifica.toString());
        
        
        
    }
    
}
