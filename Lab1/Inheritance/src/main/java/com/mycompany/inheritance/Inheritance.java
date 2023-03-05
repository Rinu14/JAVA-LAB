/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance;

/**
 *
 * @author user
 */
class SuperClass{
    int i,j;
//    void get(){
//        System.out.println(i+j);
//    }
    void show(){
        System.out.println("The value of i and j:"+i+" "+j);
    }
}
class SubClass extends SuperClass{
    int k;
    void subShow(){
        System.out.println("The value of k:"+k+" "+i);
    }
    void sum(){
        System.out.println("The sum of values:"+(i+j+k));
    }
}
public class Inheritance {

    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        SubClass sb = new SubClass();
      
        System.out.println("SuperClass:");
        
//        sp.get();
        sp.i=2;
        sp.j =3;
        sp.show();
         //System.out.println(sb.i);
         sb.i=10;
         sb.j=20;
        sb.k=6;
        sb.subShow();
        sb.sum();
        
    }
}
