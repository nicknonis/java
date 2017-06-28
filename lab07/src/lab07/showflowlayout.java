/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author TP034088
 */
public class ShowFlowLayout extends JFrame{
        public ShowFlowLayout(){
            //set layout align left with horizontal gap 10
            // vertical gap 20 between components
           
            
           
        JFrame frame = new JFrame ("Framous");        //make frame
        frame.setSize(400,300);        //set frame size
        frame.setLocationRelativeTo(null); // center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensure close on x
        frame.setVisible(true);//displays frame.
        frame.setLayout(null);
        
            
         setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
            
            
            //add labels and text fields to the frame
            add(new JLabel("\n First Name"));
            add(new JTextField(8));
            add(new JLabel("\n MI"));
            add(new JTextField(1));
            add(new JLabel("\n Last Name"));
            add(new JTextField(8));
        
        
        
        
        }
        
    }

