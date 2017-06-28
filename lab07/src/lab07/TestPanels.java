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
public class TestPanels extends JFrame{
    public TestPanels(){
        //create panel p1 for the buttons and set gridlayout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        
        //add btns to panel
        for (int i = 1; i <= 9; i++){
            p1.add(new JButton(" " + i));
        }
        
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));
        
        //create panel p2 to hold a text field and p1
       JPanel p2 = new JPanel(new BorderLayout());
       p2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
       p2.add(p1, BorderLayout.CENTER);
       
      
       
       //add contents into the frame
       add(p2, BorderLayout.EAST);
       add(new JButton("Food to be placed here"), BorderLayout.CENTER);
       
    }
    
    public static void main (String[] args){
        TestPanels frame = new TestPanels();
        
        frame.setTitle("The Front View of a Microwave Oven");
        frame.setSize(400,250);        //set frame size
        frame.setLocationRelativeTo(null); // center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensure close on x
        frame.setVisible(true);//displays frame.
        frame.setLayout(null);
    }
}
