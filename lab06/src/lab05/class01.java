/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author TP034088
 */
class circle{
    
    public double radiusz;
    
    circle(){radiusz = 1;}
    
    circle(double a){
        radiusz = a;
        }
    
    double getarea(){return radiusz*radiusz*radiusz*Math.PI;}
    
    double getperi(){
        return 2 * radiusz * Math.PI;    }
  
    void setradi(double a){
        radiusz = a;
    }
    
    
}
