public class App {
    /*Petunjuk Pengerjaan
    -Jangan mengurangi isi template Utama.java, hanya tambahkan di bagian yang diminta
    -Lengkapi semua class sesuai dengan class diagram
    -Jangan ditambahkan System.out.print() di file apapun
    */
    
    public static void main(String[] args) {
        System.out.println("NIM: 105219001");
        
        Manusia manusia=new Manusia("Mahran Radifan Zhafir ");       
        Alamat alamat=new Alamat();
        //Set alamat Dian Anastasya dengan kota Jakarta dan negara Indonesia
        alamat.setKota("Banda Aceh");
        alamat.setNegara("Indonesia");
        manusia.setAlamat(alamat);

        System.out.print("Nama Lengkap: "+ manusia.getNama()+"\n");
        System.out.print("Alamat: "+ manusia.getAlamat().getKota()
                +","+manusia.getAlamat().getNegara()+"\n");
        
        Mobil mobil[]=new Mobil[2];
        mobil[0] = new Renault();
        mobil[1] = new Toyota();
        mobil[0].setTahunMerk(2020, "Twizy");
        mobil[0].setBahanBakar("Listrik");
        mobil[1].setTahunMerk(2015, "Yaris"); 
        manusia.setMobil(mobil);  
        //Gunakan Upcasting untuk instanisasi objek renault dan toyota
        //Set mobil renault dengan Merk Twizy tahun 2020 dengan bahan bakar Listrik
        //Set mobil toyota dengan Merk Yaris tahun 2015
        //Set pemilik mobil yaitu Dian Anastasha
 
        System.out.print("Mobil Pertama: "+ manusia.getMobil()[0].getMerk()
                +" Tahun "+manusia.getMobil()[0].getTahun()
                +" Bahan Bakar "+ manusia.getMobil()[0].getBahanBakar()+"\n");
        System.out.print("Mobil Kedua: "+ manusia.getMobil()[1].getMerk()
                +" Tahun "+manusia.getMobil()[1].getTahun()
                +" Bahan Bakar "+ manusia.getMobil()[1].getBahanBakar()+"\n");
         
        Kucing kucing[]=new Kucing[2];
        kucing[0] = new Kucing("Anggora");
        kucing[1] = new Kucing("Bengal");
        kucing[0].setPemilik(manusia);
        kucing[1].setPemilik(manusia);
        manusia.setKucing(kucing);
        //instanisasi kucing Anggora dan kucing Bengal tanpa Upcasting
        //SetPemilik kedua kucing yaitu Dian Anastasha
        //SetKucing yang dimiliki oleh Dian Anastasha yaitu Anggora dan Bengal
        
        System.out.print("Kucing Pertama: Jenis "+ manusia.getKucing()[0].getNama()
                +" Dipelihara oleh "+manusia.getKucing()[0].getPemilik()+"\n");
        System.out.print("Kucing Kedua: Jenis "+ manusia.getKucing()[1].getNama()
                +" Dipelihara oleh "+manusia.getKucing()[1].getPemilik()+"\n");
                
        Harimau harimau = new Harimau();
        System.out.print("Apakah harimau bisa dipelihara? "+harimau.bisaDipelihara()+"\n");
           
    }
}
