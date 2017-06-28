/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author TP034089
 */
public class tuitionfee {
    public static void main(String[] args){
        
    double fee = 10000;
    double doubled = fee * 2;
    int whatsmyfee = 0; 
 
    do{
        
    
    fee = fee * (1.07); 
    whatsmyfee += 1;
    
    }while(fee <= doubled);
    
    System.out.println(whatsmyfee);
    
    }
}
