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
public class ShowBorderLayout extends JFrame{
    public ShowBorderLayout(){
        //set a border with horizontal gap 5 and vertical gap 10
        setLayout(new BorderLayout(5,10));
        
        //add buttons to frame
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("Center"), BorderLayout.CENTER);
        
        
        
    }
    
    public static void main(String[] args){
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//displays frame.
        
        
        
    }
}
