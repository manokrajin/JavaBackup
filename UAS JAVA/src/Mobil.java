public class Mobil {
    protected String bahanBakar = "Bensin";
    protected int tahun;
    protected String merk;

    public int getTahun(){
        return this.tahun;
    }
    public String getMerk(){
        return this.merk;
    }
    public String getBahanBakar(){
        return this.bahanBakar;
    }
    public void setTahunMerk(int tahun, String merk){
        this.tahun = tahun;
        this.merk = merk;
    }
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }


}
