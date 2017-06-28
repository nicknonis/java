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
public class monthy {
    public static void main(String[] args){
        Scanner newscan = new Scanner(System.in);
        System.out.println("Enter a number for the month you wish to see:");
        int monthy = newscan.nextInt();
        switch(monthy){
            case 1: System.out.println("January");break;
            case 2: System.out.println("Feb");break;    
            case 3: System.out.println("Mar");break;    
            case 4: System.out.println("Apr");break; 
            case 5: System.out.println("May");break; 
            case 6: System.out.println("Jun");break; 
            case 7: System.out.println("Jul");break; 
            case 8: System.out.println("Aug");break; 
            case 9: System.out.println("Sept");break;
            case 10: System.out.println("Oct");break; 
            case 11: System.out.println("Nov");break;
            case 12: System.out.println("Dec");break; 
            default: System.out.println("INVALID CHOICE GO DIE!");break;
        }
}}
