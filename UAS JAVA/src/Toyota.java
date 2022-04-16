public class Toyota extends Mobil {
    public int getTahun(){
        return tahun;
    }
    public String getMerk(){
        return merk;
    }
    public void setTahunMerk(int tahun, String merk){
        this.tahun = tahun;
        this.merk = merk;
    }
    public String getBahanBakar(){
        return this.bahanBakar;
    }
}
