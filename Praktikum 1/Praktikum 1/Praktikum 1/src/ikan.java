public class ikan {

    int jumlahSirip;
    String jenisKelamin;
    int hargaIkan;

    public ikan(){

        System.out.println("Saya berenang!");
    }

    public ikan(int jumlahSirip){

        this.jumlahSirip = jumlahSirip;
    }

    public ikan(int jumlahSirip, int hargaIkan, String jenisKelamin){

        this.jumlahSirip = jumlahSirip;
        this.hargaIkan = hargaIkan;
        this.jenisKelamin = jenisKelamin;
    }

}
