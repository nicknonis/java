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
public class guessinggame {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanz = new Scanner(System.in);
        int usrin = 1;
        int randy = 0;
        int a = (int)(Math.random()* 100);
       
        do{
        
        
         
        randy = a ;
        System.out.println("Guess the value:");
        usrin = scanz.nextInt();
        
        if (usrin > randy){
            System.out.println("Your input is higher...");
        }
        else if (usrin < randy) {
            System.out.println("Your guess is too low...");
        }
        
        else
             System.out.println("Good guess!");
        
    
            }while(usrin != randy);
    }
}

