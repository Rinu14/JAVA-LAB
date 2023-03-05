/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodoverloading;

/**
 *
 * @author user
 */
class Area {
    double areaofrectangle,areaoftriangle;
public void areas(int l,int b)
{
    areaofrectangle = l*b;
    System.out.println("Area of Rectangle:"+areaofrectangle);
}
public void areas( double l,double b)
{
    areaoftriangle = (l*b)/2;
    System.out.println("Area of Triangle:"+areaoftriangle);

}
}
public class MethodOverloading {
   public static void main(String[] args) {
        Area ar = new Area();
        //Area ar1 = new Area();
        ar.areas(29,2);
        ar.areas(9.8, 10.0);
        //ar.areas(34.0,23.30);
    }
}
