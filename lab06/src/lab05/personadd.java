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
public class personadd {
    public String fname;
    public String lname;
    public String email;
    public String address;
    public int tel;
    
    personadd (String a, String b, String c, String d, int tela) {
            fname = a;
            lname = b;
            email = c;
            address = d;
            tel = tela;
    }
    
    void changeemail(String d){
        email = d;
    }
    
    void changetel (int tela){
        tel = tela;
    }
    
// give name from class.
    public String returnname(){
        return fname;
    }
}
