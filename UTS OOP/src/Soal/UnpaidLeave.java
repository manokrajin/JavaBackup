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
public class UnpaidLeave {
    private double unpaidLeave;
    private double persentase;
        
    public void setUnpaidLeave(String[] hariUnpaidLeave, double gajiBruto){
        //lengkapi
        //persentase adalah jumlah hari unpaidleave dibagi 30 hari (hint: dicasting double)
        //unpaidleave adalah gajibruto dikali persentase
        persentase = hariUnpaidLeave.length/30;
        unpaidLeave = persentase * gajiBruto;
    }
    
    public double getUnpaidLeave(){
        return unpaidLeave;
    }
}
