public class dosen {
    private String nama;
    private String nip;
    private String alamat;
    public dosen() {
        System.out.println("dosen baru : ");
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }

    public void setNewObj(){
        mahasiswa namaMahasiswa = new mahasiswa();
        namaMahasiswa.setNama("ewinghd");
        namaMahasiswa.setAlamat("jakarta");
        namaMahasiswa.setNim("10521900001");
        System.out.println(namaMahasiswa.getNama());
        System.out.println(namaMahasiswa.getAlamat());
        System.out.println(namaMahasiswa.getNim());
    }
}
