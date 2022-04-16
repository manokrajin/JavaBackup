public class Kucing implements Mamalia,bisaDipelihara {
    private String nama;
    private Manusia pemilik;

    public Kucing(String nama){
        this.nama = nama;
    }
    public void setPemilik(Manusia pemilik){
        this.pemilik = pemilik;
    }
    public String getNama(){
        return this.nama;
    }
    public String getPemilik(){
        return pemilik.getNama();
    }
    public void bernafas(){

    }
    public void berkembangBiak(){

    }
    public boolean bisaDipelihara() {
        return true;
    }


}
