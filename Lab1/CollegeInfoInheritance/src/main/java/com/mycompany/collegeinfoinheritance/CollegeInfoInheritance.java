/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collegeinfoinheritance;
import java.util.Scanner;
/**
 *
 * @author user
 */
class Staff{
    int code;
    String name;
    Scanner in =  new Scanner(System.in);
    
}
class Teacher extends Staff{
    String subject;
    String publication;
    void get(){
        
        System.out.println("Enter your Name:");        
        name = in.nextLine();
        
        System.out.println("Enter your code:");        
        code = in.nextInt();
       
       
       
       System.out.println("Enter your subject:");        
        subject = in.nextLine();
       
       System.out.println("Enter your Publication:");
        publication = in.nextLine();
      
       
     
        
    }
    void show(){
        System.out.println("Your code is"+code);
        System.out.println("name:"+name);
        System.out.println("Your subject:"+subject);
         System.out.println("publication:"+publication);
        
    }
    
}
class Officer extends Staff{
    String grade;
    void insert(){
    System.out.println("Enter your code:");        
        code = in.nextInt();
       
    System.out.println("Enter your Name:");        
        name = in.nextLine();
    
    System.out.println("Enter your grade:");
        grade = in.nextLine();
}
    void display(){
        System.out.println("Your code is"+code);
        System.out.println("name:"+name);
        System.out.println("Your grade: "+grade);
        
    }
}
public class CollegeInfoInheritance {

    public static void main(String[] args) {
        Teacher T = new Teacher();
        Officer O = new Officer();
        T.get();
        T.show();
        O.insert();
        O.display();
    }
}
