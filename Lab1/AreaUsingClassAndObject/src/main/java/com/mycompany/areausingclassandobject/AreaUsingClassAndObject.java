/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areausingclassandobject;

/**
 *
 * @author user
 */
class AreaOfRectangle{
    int len,bred;
    double area;
    void insertArea(int l, int br){
        len =l;
        bred = br;
    }
    void calculateArea(){
        area = len*bred;
        System.out.println("Area of Rectangle:"+area);
    }
}
class AreaOfTriangle{
    int breadth, height;
    double areaofTriangle;
    void insertAreas(int b, int h){
        breadth=b;
        height=h;
    }
    void calculateAreas(){
        areaofTriangle= (breadth*height)/2;
        System.out.println("Area of Triangle:"+areaofTriangle);
  
    }
    
}
public class AreaUsingClassAndObject {

    public static void main(String[] args) {
       AreaOfRectangle rect = new AreaOfRectangle();
       AreaOfTriangle tri = new AreaOfTriangle();
       rect.insertArea(4, 5);
       tri.insertAreas(4, 7);
       rect.calculateArea();
       tri.calculateAreas();
    }
}
