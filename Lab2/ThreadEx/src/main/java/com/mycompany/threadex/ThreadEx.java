/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.threadex;

/**
 *
 * @author user
 */
public class ThreadEx extends Thread {
    
    public void run(){
        System.out.println("This method is executed by Child Thread.");
    }
    public static void main(String[] args) {
        ThreadEx te = new ThreadEx();
        te.start();
        System.out.println("This method is executed by Main Thread.");
       
    }
}
