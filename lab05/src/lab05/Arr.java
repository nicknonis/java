/*
 * Calculates totals using arrays and calculates its average
 */
package lab05;
import java.util.Scanner;
/**
 *
 * @author TP034088
 */
public class Arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] shaka = new int[10];
        int total = 0;
        int ctr = 0;
        for(int i=0; i <= 9; i++){
            System.out.println("Input value " + i + " :" );
            shaka[i] = scan.nextInt();
            total = (shaka[i] + total);
            System.out.println("Current Total = " + total);
            System.out.println("Current Average = "+ (total/shaka.length));
        }
        
        for(int o = 0; o<= 9; o++){
            if(shaka[o] > (total/shaka.length)){
                ctr += 1;
            }
            else 
                continue;
        }
        System.out.println("Total numbers above average: " + ctr);
    }
    
}
