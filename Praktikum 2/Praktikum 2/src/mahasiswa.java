public class mahasiswa {
    private String nama;
    private String nim;
    private String alamat;

    public mahasiswa(){
        System.out.println("Mahasiswa Entri : ");
    }

    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim(){
        return this.nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
