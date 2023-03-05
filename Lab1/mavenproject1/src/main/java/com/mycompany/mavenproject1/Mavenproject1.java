/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author user
 */
class Staff {
    int code;
    String name;
}
class Teacher extends Staff{
    String subject;
    String publication;
    public void display(){
        code = 1;
        name = "Reshmi";
        subject = "C";
        publication = "KEC";
        System.out.println("Code No." + code + "Name:" + name + "Subject :" + subject + "Publication :"+publication);
    }
      
}
class Officer extends Staff{
    String grade;
    public void display(){
        name ="Nick";
        code =99;
        grade="B";
        System.out.println("Code No." + code + "Name:" + name + "Grade No. :" +grade);
    }
}
public class Mavenproject1 {

    public static void main(String[] args) {
        Teacher t= new Teacher();
        t.display();
        Officer o=new Officer();
        o.display();
    }
}
