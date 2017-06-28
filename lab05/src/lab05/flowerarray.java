package lab05;
import java.util.Scanner;

/**
 *
 * @author TP034088
 */
public class flowerarray {
    public static void main (String[] args){
        Scanner scanz = new Scanner(System.in);
        String[] flower = {"petunia","pansy", "rose", "violet", "carnation"};
        double[] cost = {0.50, 0.75, 1.50, 0.5, 0.8};
        int choice = 0;
        
        System.out.println("Pick a flower[0-4]:");
        
        for (int ctr =0; ctr <= 4; ctr++){
            System.out.println(ctr + ". " + flower[ctr]);
        }
        
        String flow = scanz.nextLine();
        
        for (int ctr2 = 0; ctr2 <=4; ctr2++){
            System.out.println(ctr2);
            if(flower[ctr2].equals(flow)){ //strcmp
                choice = ctr2;
            }
         
                  }
        System.out.println("Enter quantity: ");
        double numb = scanz.nextDouble();
        
        System.out.println("\n Selected flower: " + flower[choice] + "\n Quantity: " + numb + "\n Total: " + (numb * cost[choice]));
        
            
        
        
    }
    
}
