/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.ArrayList;
/**
 *
 * @author Gabriele
 */
public class Classifica {
    public static ArrayList<Corridore> classifica;

    public Classifica() {
        this.classifica = new ArrayList<>();
    }
    
    public static synchronized boolean addCorridore (Corridore c){
        return classifica.add(c);
    }
    
    @Override
    public String toString(){
        String lista = "Classifica:\n";
        int pos = 0;
        
        for(Corridore c: classifica){
            pos = classifica.indexOf(c) + 1;
            lista += pos + ".  " + c.toString() + "\n";
        }
        return lista;
    }
    
}