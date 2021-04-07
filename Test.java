/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threadexercise;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class Test {

    // We'll use this to randomly sleep our threads
    static Random random = new Random(System.currentTimeMillis());

    public static void main(String args[]) throws InterruptedException {

        // create object of unsafe counter
        Counter badCounter = new Counter();

        // setup thread1 to increment the badCounter 200 times
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 800; i++) {
                    badCounter.increment();
//                    Test.sleepRandomlyForLessThan10Secs();
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        // setup thread2 to decrement the badCounter 200 times
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 800; i++) {
                    badCounter.decrement();
                    Test.sleepRandomlyForLessThan10Secs();
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        // run both threads
        thread1.start();
        thread2.start();

        // wait for t1 and t2 to complete.
        thread1.join();
        thread2.join();

        // print final value of counter
        badCounter.printFinalCounterValue();
    }

    public static void sleepRandomlyForLessThan10Secs() {
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException ie) {
        }
    }
}
