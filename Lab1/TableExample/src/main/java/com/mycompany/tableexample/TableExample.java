/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tableexample;

/**
 *
 * @author user
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class TableExample {

    public static void main(String[] args) {
        JFrame f = new JFrame("Table Example");
        String data[][]={{"1","Ram","Senior Developer"},{"2","Sita","Mid Developer"},{"3","Hari","Project Manager"}};
        String columnName[] = {"S.no","Name","Position"};
        JTable table = new JTable(data,columnName);
        table.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(table);
        
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);  
    }
}
