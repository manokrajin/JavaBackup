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
public class Lembur {
    private double lembur;
    private double persentase;
    public void setLembur(String[] hariLembur, double gajiBruto){
        //lengkapi
        //persentase lembur adalah jumlah hari lembur dibagi 30 hari (hint: casting dengan double)
        //nilai lembur adalah gajibruto dikali persentase
        persentase = hariLembur.length/30;
        lembur = persentase * gajiBruto;
    } 
    
    public double getLembur(){
        return lembur;
    }
}
