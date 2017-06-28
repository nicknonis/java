/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;


public class kebabclass {
    
    private String[] sizen ={"Small", "Medium", "Large"}; //sizes for kebabs
    private double[] sizeprice = {7.50,8.50,10}; // prices based on size
    private int sidesctr; //ctr for sides
    private String[] sides = {"","Coleslaw,","Salad,","Banoffi Pie,", "Chocolate Fudge Cake,", "500ml Fanta Fruit Twist,", "500ml Coke,", "Bottle of Water,"};
    private String sidesch = "";
    private double price; //price changes according to formula
    private String[] selectedkebab ={"","Chicken Kebab,","Kofteh Kebab,", "Kebab Meat & Chips,", "Chicken Shish Kebab,", "Meat Shish Kebab,", "Mixed Kebab,"}; //kebab menu
    private String kebabch = ""; //for concatenating all the kebabs for usage in GUI later
    private int selectedsize; // for array usage 
    
    kebabclass(int totalkebab,String sizen, int sidesctr , int[] i1, int[] i2){
    
    
    this.sidesctr = sidesctr;
    
      for (int ctr = 0; ctr <i1.length; ctr++){ // find kebabs
            kebabch +=  selectedkebab[i1[ctr]];
            
               
      }
      for (int ctr2 = 0; ctr2 <i2.length; ctr2++){ //find the appropriate add-ons
        sidesch += sides[i2[ctr2]];
       
      }
      
      for (int ctr = 0; ctr <=2; ctr++){ //finding the size from my size array
         if(this.sizen[ctr].equals(sizen)){ //for size
                selectedsize = ctr;
            }
      }
      price = sizeprice[selectedsize] * totalkebab + (sidesctr * 3.50);
     
  }
    
       
        
    
    
    
    // return my selected kebabs + values (after making changes)
    public String returnkebabtype(){
        return kebabch;
    } 
    public String returnsize(){
        return sizen[selectedsize];       
    }
    public String returnsides(){
        return sidesch;
    }
    public double returnprice(){
        return price;
    }
    public int returnselectedsize(){
        return selectedsize;
    }
}
