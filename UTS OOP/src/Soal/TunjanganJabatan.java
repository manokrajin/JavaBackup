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
public class TunjanganJabatan {
    double tujab;
      
    public void setTujab(String jabatan, double gajiBruto){
        //jika jabatan manager persentase tunjangan jabatan adalah 5% dari gajiBruto
        //jika jabatan staff persentase tunjangan jabatan adalah 2% dari gajiBruto
        //set nilai tunjangan jabatan
        if(jabatan.equals("manager")){
            tujab = (5/100) * gajiBruto;
        } else {
            tujab = (2/100) * gajiBruto;
        }
    }
    
    public double getTujab(){
        return tujab;
    }
}
