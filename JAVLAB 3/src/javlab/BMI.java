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
public class BMI {
    public static void main (String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Enter weight(pound):");
        double weight = skan.nextDouble();
        weight = weight * 0.45359237;
        System.out.println("Enter height(inch):");
        double height = skan.nextDouble();
        height = height * 0.0254;
        double BMI = weight / (height * height);
        
        if(BMI < 18.5)
            System.out.println("Underweight");        
        else if(BMI >= 18.5 || BMI <25.0)
            System.out.println("Normal");        
        else if(BMI >= 25.0 || BMI <30.0)
            System.out.println("Overweight");        
        else if(BMI >= 30 )
            System.out.println("Obese");        
        else 
            System.out.println("INVALID");
        System.out.println("Your BMI is:" + BMI);
    }
}

