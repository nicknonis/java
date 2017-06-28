/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import javax.swing.*; //stuff for frame
import java.awt.*;
/**
 *
 * @author TP034088
 */


public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // call me maybe
        ShowFlowLayout frame = new ShowFlowLayout();
        
        frame.setSize(400,300);        //set frame size
        frame.setLocationRelativeTo(null); // center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensure close on x
        frame.setVisible(true);//displays frame.
        frame.setLayout(null);
        
         //mk button
        JButton jbtOK = new JButton("OK");
        jbtOK.setPreferredSize(new Dimension(40,40));
        jbtOK.setBounds(100,100,80,40);// distance from left,distance from top, width of text, height of text
        
        jbtOK.setBackground(Color.red);
        jbtOK.setForeground(Color.blue);
        
        frame.add(jbtOK);
        
        
        //extra btns
        JButton jbtno = new JButton("no");
        jbtno.setBackground(Color.pink);
        jbtno.setPreferredSize(new Dimension(40,40));
        jbtno.setBounds(100,100,160,80);// distance from left,distance from top, width of text, height of text
        JButton jbtbro = new JButton("bro");
        JButton jbtdont = new JButton("dont");
        JButton jbtclick = new JButton("click");
        
      
        frame.add(jbtno);
        frame.add(jbtbro);
        frame.add(jbtdont);
        frame.add(jbtclick);
    }
           
}

