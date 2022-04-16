/*
============================================
Harap DIPERHATIKAN sebelum mulai mengerjakan:
- Method main() ada di file Laporan.java
- Ikuti perintah yang tertera di tiap-tiap file hingga output sesuai dengan soal
- JANGAN dihapus code apapun yang sudah disediakan sebagai template
- Setelah selesai mengerjakan kirim semua file .java via ms. teams
- Output di capture dan masukkan ke file docx
================================================

Soal
Code berikut adalah template untuk membuat Sistem Pelaporan Gaji Pegawai
terdapat beberapa komponen dalam Sistem Pelaporan Gaji Pegawai ini yaitu:
1. data pegawai: nama, NIP dan jabatan
2. gaji bruto
3. tunjangan: tunjangan jabatan + lembur
4. potongan: pajak + UnpaidLeave
5. gaji Take Home Pay: gaji bruto + tunjangan - potongan
6. keterangan: tanggal lembur dan unpaidleave
7. SignatureCEO

lengkapilah code berikut sehingga ouputnya menjadi sbb:
++++++++++++++++++++++++++++++++++++++++++++++++++
          Slip Gaji Bulan Januari 2020
 
Nama              : Tiara
NIP               : 112490
Jabatan           : manager
Gaji Bruto        : 10000.00 
Tunjangan         : 833.33 
     Jabatan      : 500.00 
     Lembur       : 333.33 
Potongan          : 1666.67 
     Pajak        : 1000.00 
     UnpaidLeave  : 666.67 
Gaji Take Home Pay: 9166.67 
 
Keterangan
Tanggal UnpaidLeave: [02-01-2020]  [03-01-2020]  
Tanggal Lembur     : [04-01-2020]  
 
 
Tertanda
NAMA              : Isi Nama Anda
NIM               : Isi NIM Anda
Founder and CEO, MyCompany
++++++++++++++++++++++++++++++++++++++++++++++++++
 
++++++++++++++++++++++++++++++++++++++++++++++++++
          Slip Gaji Bulan Januari 2020
 
Nama              : Berlian
NIP               : 112491
Jabatan           : staff
Gaji Bruto        : 7000.00 
Tunjangan         : 840.00 
     Jabatan      : 140.00 
     Lembur       : 700.00 
Potongan          : 583.33 
     Pajak        : 350.00 
     UnpaidLeave  : 233.33 
Gaji Take Home Pay: 7256.67 
 
Keterangan
Tanggal UnpaidLeave: [05-01-2020]  
Tanggal Lembur     : [06-01-2020]  [07-01-2020]  [08-01-2020]  
 
 
Tertanda
NAMA              : Isi Nama Anda
NIM               : Isi NIM Anda
Founder and CEO, MyCompany
++++++++++++++++++++++++++++++++++++++++++++++++++

 */
package Soal;

public class Laporan {
    
    private GajiPegawai gajiPegawai;
    private UnpaidLeave hariUnpaidLeave;
    private Tunjangan tunjangan;
    
    
    public Laporan(GajiPegawai gajiPegawai){
        this.gajiPegawai = gajiPegawai;
    }


   public Potongan(String[] hariUnpaidLeave) {
      this.hariUnpaidLeave = hariUnpaidLeave;
      return hariUnpaidLeave;
  }

    public Tunjangan(Tunjangan tunjangan){
       this.tunjangan = tunjangan;
    }
    
    public void CEOSignature(){
       System.out.println(" ");
       System.out.println(" "); 
       System.out.println("Tertanda"); 
       system.out.println("Nama :Mahran Radifan Zhafir");
       system.out.println("NIM   :  105219001");
       System.out.println("Founder and CEO, MyCompany");
    }
    
    public void keterangan(){
       System.out.println(" "); 
       System.out.println("Keterangan");
       System.out.print("Tanggal UnpaidLeave:");
       
       System.out.print("Tanggal Lembur     :");
       //Lengkapi tanggal Lembur
    }
    
    public void cetakHari(String[] hari){
       //lengkapi sehingga bisa mencetak hari
    }
    
    public void cetakLaporan(){
       //Lengkapi fungsi ini sesuai format output diatas
       //manfaatkan method yang sudah dibuat
       DataPegawai dataPegawai = new DataPegawai()
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("          Slip Gaji Bulan Januari 2020");
       System.out.println(" ");
       
       System.out.println("Nama              : " + DataPegawai.getNama());
       System.out.println("NIP               : " + DataPegawai.getNIP());
       System.out.println("Jabatan           : " + DataPegawai.getJabatan());       
       System.out.printf("Gaji Bruto        : %.2f %n", gaji.getGajiBruto()); 
       System.out.printf("Tunjangan         : %.2f %n", tunjangan.getTunjanganTotal());       
       System.out.printf("     Jabatan      : %.2f %n", DataPegawai.getJabatan());
       System.out.printf("     Lembur       : %.2f %n", Lembur.getLembur());      
       System.out.printf("Potongan          : %.2f %n", Potongan.getPotonganTotal());       
       System.out.printf("     Pajak        : %.2f %n", Pajak.getPajakTotal());
       System.out.printf("     UnpaidLeave  : %.2f %n", UnpaidLeave.getUnpaidLeave());              
       System.out.printf("Gaji Take Home Pay: %.2f %n", GajiPegawai.getGaji());
       
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println(" ");       
    }
    
    public static void main(String[] args) {
        
        //M adalah manager
        String[] unpaidLeaveM={"02-01-2020","03-01-2020"};
        String[] lemburM={"04-01-2020"};
        double gajiBrutoM=10000;
        
        //S adalah staff
        String[] unpaidLeaveS={"05-01-2020"};
        String[] lemburS={"06-01-2020","07-01-2020","08-01-2020"};
        double gajiBrutoS=7000;
                
        DataPegawai M = new DataPegawai("Tiara","112490","manager");
        Potongan potonganM = new Potongan(unpaidLeaveM);
        Tunjangan tunjanganM = new Tunjangan(lemburM);
        Gaji gajiM = new GajiPegawai(M.getNama(), gajiBrutoM, potonganM, tunjanganM);
        Laporan laporanM = new Laporan(GajiM);
        laporanM.cetakLaporan();
       
        //lengkapi dengan instanisasi object gajiM, laporanM
        //kemudian cetak laporan
        
        DataPegawai S = new DataPegawai("Berlian","112491","staff");
        Potongan potonganS = new Potongan(unpaidLeaveS);
        Tunjangan tunjanganS = new Tunjangan(lemburS);
        Gaji gajiM = new GajiPegawai(S.getNama(), gajiBrutoS, potonganS, tunjanganS);
        Laporan laporanS = new Laporan(GajiS);
        laporanS.cetakLaporan();
        //lengkapi dengan instanisasi object potonganS, tunjanganS, gajiS, laporanS
        //kemudian cetak laporan      
    }

}

