/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import java.util.Scanner;

/**
 *
 * @author TP034089
 */
public class random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanz = new Scanner(System.in);
        int usrin = 1;
        int randy = 0;
        do{
        
        int a = (int)(Math.random()* 9);
        int b = (int)(Math.random()* 9);  
        randy = a + b;
        System.out.println("Guess the value:");
        usrin = scanz.nextInt();
        
        if (usrin == randy){
        System.out.println("Good guess!");
        }
        else 
            System.out.println("Nice try! The value is actually..." + randy);
            }while(usrin != randy);
        
    }
    
}
