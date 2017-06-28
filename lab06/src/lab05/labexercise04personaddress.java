/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;
import java.util.Scanner;
/**
 *
 * @author TP034088
 */
public class labexercise04personaddress {
    public static void main(String[] args){
       Scanner scanz = new Scanner(System.in);
        personadd p01 = new personadd("ali","babu","kk@kk.com","123 street selangor", 555555);
        System.out.println("Name: "+ p01.returnname() + "\n Last name: " + p01.lname + "\n Address: " + p01.address + "\n Email: " + p01.email + "\n Telephone: " + p01.tel);
    
        System.out.println("\n Enter a new email:");
        String newmail = scanz.nextLine();
        p01.changeemail(newmail);
        
        System.out.println("\n Enter a new telephone number: ");
        int newtel = scanz.nextInt();
        p01.changetel(newtel);
        
        System.out.println("\n New telephone number: " +p01.tel + "\n New Email: " + p01.email);
    }
}
