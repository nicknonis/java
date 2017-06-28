/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javlab;
import java.util.Scanner;
/**
 *
 * @author TP034089
 */
public class JAVLAB {

    /**
     * zodiac stuff
     */
    public static void main(String[] args) {
        Scanner zodi = new Scanner(System.in);
        
        System.out.println("Enter a year:");
        int tahun = zodi.nextInt();
        
        switch(tahun % 12){
            case 0: System.out.println("monkey");break;
            case 1: System.out.println("rooster");break;
            case 2: System.out.println("doggy");break; 
            case 3: System.out.println("bacon");break;   
            case 4: System.out.println("backdoor tactix");break;
            case 5: System.out.println("Barathum");break;
            case 6: System.out.println("anjing");break;
            case 7: System.out.println("Pineapple");break;  
            case 8: System.out.println("Dragon");break;    
            case 9: System.out.println("Elephant");break;    
            case 10: System.out.println("Lion");break;    
            case 11: System.out.println("Tiger");break;    
            default: System.out.println("Something happened...");
        }
    }
    
}
