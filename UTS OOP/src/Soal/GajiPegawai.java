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
public class GajiPegawai {
    private double gajiBruto;
    private DataPegawai dataPegawai;
    private Potongan potongan;
    private Tunjangan tunjangan;

    //lengkapi var
    private double gajiTotal;
    public GajiPegawai(DataPegawai dataPegawai,double  gajiBruto, Potongan potongan, Tunjangan tunjangan){
        this.dataPegawai = dataPegawai;
        this.gajiBruto = gajiBruto;
        this.potongan = potongan;
        this.tunjangan = tunjangan;
    }
    
    public double getGajiBruto(){
        return gajiBruto;
    }
    
    public double getPotongan(){
        return potongan.getPotonganTotal(dataPegawai, gajiBruto);
    }
    
    public double getTunjangan(){
       return tunjangan.getTunjanganTotal(dataPegawai, gajiBruto);
    }
    
    public double getGaji(){
        gajiTotal = getGajiBruto() + getTunjangan() - getPotongan();
        return gajiTotal;
    }
    
}
