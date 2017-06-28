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
public class multitab1 {
    
    public static void main(String[] args){
     int multi = 0;
     
//create table
System.out.format("  ");
for (int i =0 ; i <= 12; i++){
    System.out.format("%4d", i);
}

System.out.println();
System.out.println("-------------------------------------------------------");
     
//multiplication 
for(int ctr =0; ctr<= 12; ctr++){  
    //print left most column
    System.out.format("%d|" ,ctr);

        for(int ctr2 = 0;ctr2<=12;ctr2++){
            multi = ctr * ctr2;
            System.out.format("%4d",multi );
    }
System.out.println();
}
           
    
    }
}
