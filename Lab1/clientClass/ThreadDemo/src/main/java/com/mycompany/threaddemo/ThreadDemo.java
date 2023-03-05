/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.threaddemo;

/**
 *
 * @author user
 */
public class ThreadDemo implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        
        Thread T = new Thread(t1);
        T.start();
        ThreadDemo t2 = new ThreadDemo();
        
        Thread T1 = new Thread(t2);
        T1.start();
        
        
        
    }
}

