class Crocs {
    String nama;
    String prodi;
    boolean cekNull;
    int nim, umur;
    double ipk;
}

public class classObject {

    public static void main(String[] args) {
        Crocs cs1 = new Crocs();
        cs1.nama = "Bento";
        cs1.prodi = "Ilmu Komputer";
        cs1.nim = 105219100;
        cs1.umur = 17;
        cs1.ipk = 4.1;
        System.out.println("\n" + cs1.nama);
        System.out.println(cs1.prodi);
        System.out.println(cs1.nim);
        System.out.println(cs1.umur);
        System.out.println(cs1.ipk);
        System.out.println(cs1.cekNull);

        Crocs cs2 = new Crocs();
        cs2.nama = "Tomi";
        cs2.prodi = "Ilmu Komputer";
        cs2.nim = 105219200;
        cs2.umur = 16;
        cs2.ipk = 4.3;
        System.out.println("\n===========");
        System.out.println("Nama : " + cs2.nama);
        System.out.println("Prodi: " + cs2.prodi);
        System.out.println("NIM  : " + cs2.nim);
        System.out.println("Umur : " + cs2.umur);
        System.out.println("IPK  : " + cs2.ipk);
        
    }
}
