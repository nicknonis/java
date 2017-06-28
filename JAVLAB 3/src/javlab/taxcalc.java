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
public class taxcalc {
    public static void main (String[] args){
        Scanner taxscan = new Scanner(System.in);
        System.out.println("Give teh wage:");
        double wage = taxscan.nextDouble();
        double tax = 0;
        if (wage <= 57600)
            tax = 0.124 * wage;
        else if (wage > 57600)
            tax = 0.124 * 57600;
        else
            System.out.println("ERROR!");
        System.out.println("Your taxes are: " + tax);
    }
}
