/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal;


/**
 *
 * @author User
 */
public class Pajak {
    private double pajak;
    
    public void setPajak(String jabatan, double gajiBruto){
        //jika jabatan manager persentase pajak adalah 10% dari gaji bruto
        //jika jabatan staff persentase pajak adalah 5% dari gaji bruto
        //set nilai pajak
        if (jabatan.equals("manager")){
            pajak = (10/100) * gajiBruto;
        } else {
            pajak = (5/100) * gajiBruto;
        }
        
    }
    
     public double getPajak(){
         return pajak;
     }
    
}
