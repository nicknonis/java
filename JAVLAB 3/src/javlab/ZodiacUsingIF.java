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
public class ZodiacUsingIF {
     public static void main(String[] args) {
        Scanner zodiscan = new Scanner(System.in);
    
        System.out.println("Enter a year:");
        int tahun = zodiscan.nextInt();
        tahun = tahun % 12;
        if(tahun == 0)
            System.out.println("Anjing");
        else if (tahun == 1)
            System.out.println("Snake");
        else if (tahun == 2)
            System.out.println("Dragon");
        else if (tahun == 3)
            System.out.println("Banana peel");
        else if (tahun == 4)
            System.out.println("rat doto");   
        else if (tahun == 5)
            System.out.println("Watermelon");
        else if (tahun == 6)
            System.out.println("Wintermelon");
        else if (tahun == 7)
            System.out.println("Firemelon");
        else    
            System.out.println("Something happened...");
    
     }
    
    
    
    
    
}
