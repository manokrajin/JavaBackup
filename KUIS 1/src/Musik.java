/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Musik {
    private Integer type;
    public void setMusik(int type){
       //display tipe musik yang sedang dimainkan 
       //Type Musik off=0, pop=1, instrument=2;
       this.type = type;
       if(this.type == 0 ){
           System.out.println("Musik off");
       }
       else if(this.type == 1){
           System.out.println("Musik Pop");
       }
       else if(this.type == 2){
            System.out.println("Musik Instrument");
       }
    }              
}
