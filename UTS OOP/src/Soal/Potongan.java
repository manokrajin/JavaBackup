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
public class Potongan {
    private double jmlPotongan;
    private String[] hariUnpaidLeave;
    private double gajiBruto;    
    private double pajak;
    //lengkapi var
    private String jabatan;
    private double unpaidLeave;
    
    //Lengkapi Constructor
    
    public double getPajak(){
        Pajak pajak = new Pajak();
        pajak.setPajak(jabatan, gajiBruto);
        this.pajak = pajak.getPajak();
        return this.pajak;
    }
    
    public double getUnpaidLeave(){     
        //lengkapi dengan nilai Unpaid Leave
        UnpaidLeave unpaidLeave = new UnpaidLeave();
        this.unpaidLeave = unpaidLeave.getUnpaidLeave();
        return this.unpaidLeave;
    }
    
    public String[] getHariUnpaidLeave(){
        return hariUnpaidLeave;
    }
    
    public double getPotonganTotal(DataPegawai dataPegawai, double gajiBruto){       
       jmlPotongan = pajak + unpaidLeave;
       return jmlPotongan;
    }
    
    
    
    
    
    
}
