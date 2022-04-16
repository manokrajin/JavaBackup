public class mahasiswa {
    private String nama;
    private String nim;
    private int tinggi;
    private int berat;
    private int bmi;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }

    public void setTinggi(int tinggi) {
       this.tinggi = tinggi;
    }
    public int getTinggi() {
        return tinggi;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
    public int getBerat() {
        return berat;
    }

    public void setBmi (){
        this.bmi = (berat + tinggi)/2;
    }
    public int getBmi(){
        return bmi;
    }
}

