public class Renault extends Mobil{
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
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    public String getBahanBakar(){
        return this.bahanBakar;
    }
}
