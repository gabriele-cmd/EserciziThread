/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Gabriele
 */
public class Corridore extends Thread {
    private String nome;
    public static int metri = 100;
    private int iterazioni;

    public String getNome() {
        return nome;
    }

    public static int getMetri() {
        return metri;
    }

    public int getIterazioni() {
        return iterazioni;
    }
    Thread t;
    
    public Corridore(String nome) {
        this.t = new Thread(this, nome);
        t.start();
        this.nome = nome;
        iterazioni = 0;
    }
    
    public synchronized void increments(){
        iterazioni++;
        System.out.println(nome + ": " + iterazioni);
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(t.getName() + " " + + i+1 + "m");
            try{
                Thread.sleep((long)(Math.random() * 400));
            } catch(Exception e){
                
            }
        }
        System.out.println(t.getName() + "Arrivato!");
    }
    
}
