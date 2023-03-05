/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checkboxexample;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample {
    CheckBoxExample(){
        JFrame f = new JFrame("Check Box Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,200);
        JCheckBox checkBox1 = new JCheckBox("SPM");
        checkBox1.setBounds(20, 50,100,30);

        JCheckBox checkBox2 = new JCheckBox("JAVA");
//        checkBox2.setHorizontalAlignment(JCheckBox.CENTER);
//        checkBox2.setSize(400,200);
        checkBox2.setBounds(20, 80,100,30);
    
        f.add(label); f.add(checkBox1);f.add(checkBox2);
        
                
        checkBox1.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e){
                 label.setText("SPM CheckBox:" + (e.getStateChange()==1? "checked":"unchecked"));
                 
             }
        });
         checkBox2.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e){
                 label.setText("JAVA CheckBox:" + (e.getStateChange()==1? "checked":"unchecked"));
                 
             }
        });
         f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
        
    

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
