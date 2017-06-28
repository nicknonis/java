//this is the primary project using builder...
package kebab;
import javax.swing.*;

/**
 *
 * @author Nicholas Ian Nonis TP034089
 */
public class Kebab {


    public static void main(String[] args) {
        gui kgui = new gui();      
        kgui.setTitle("California Kebab Ordering System");
        kgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensure close on x
        kgui.setVisible(true);//displays frame.
        kgui.setLayout(null);
    }
    
   
}
