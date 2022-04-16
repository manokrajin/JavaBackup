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
public class DataPegawai {
    private String jabatan;
    private String nama;
    private String NIP;
    
    public DataPegawai(String nama, String NIP, String jabatan){
        this.nama = nama;
        this.NIP = NIP;
        this.jabatan = jabatan;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
   public String getNama(){
        return nama;
    }
    
    public String getNIP(){
        return NIP;
    }
     
}
