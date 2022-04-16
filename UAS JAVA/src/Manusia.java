public class Manusia {
    private String namaLengkap;
    private Alamat alamat;
    private Mobil[] mobil;
    private Kucing[] kucing;

    public Manusia(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }
    
    public String getNama(){
        return this.namaLengkap;
    }
    public Alamat getAlamat(){
        return this.alamat;
    }
    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
    public void setMobil(Mobil[] mobil){
        this.mobil = mobil;
    }
    public Mobil[] getMobil(){
        return mobil;
    }
    public void setKucing(Kucing[] kucing){
        this.kucing = kucing;
    }
    public Kucing[] getKucing(){
        return kucing;
    }
}
