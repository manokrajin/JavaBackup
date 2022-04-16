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
public class Tunjangan {
    private double jmlTunjangan;
    private String[] hariLembur;
    private double gajiBruto;   
    private double tujab;
    //lengkapi var
    private String jabatan;
    private double lembur;
    //lengkapi Constructor
    
    public double getTujab(){        
        TunjanganJabatan tunjanganJabatan = new TunjanganJabatan();
        tunjanganJabatan.setTujab(jabatan, gajiBruto);
        tujab = tunjanganJabatan.getTujab();
        return tujab;
    }
    
    public double getLembur(){
       Lembur lembur = new Lembur();
       lembur.setLembur(getHariLembur(), gajiBruto);
       this.lembur = lembur.getLembur();
       return this.lembur;
    }
    
    public String[] getHariLembur(){
        return hariLembur;
    }
    
    public double getTunjanganTotal(DataPegawai dataPegawai,double gajiBruto){ 
        jmlTunjangan = tujab + lembur;
        return jmlTunjangan;
    }
    
    
    
}
 
