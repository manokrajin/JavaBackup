class Ruang {
    // Data variabel object
    String nama = "Budi";
    String nim = "105219000";

    // Constructor
    Ruang() {
        System.out.println("Nama: " + this.nama + "\nNIM : " + this.nim);
    }

    Ruang(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Clone constructor
    Ruang(Ruang ob) {
        nama = ob.nama;
        nim = ob.nim;
    }

    // method tanpa parameter dan return (void di c++ | procedure)
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM : " + this.nim);
    }

    // method dengan parameter tapi tanpa return
    void setNama(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // method dengan return tapi tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNim() {
        return this.nim;
    }

    // method dengan return dan parameter (c++ | Function)
    String Hello(String pesan) {
        return pesan + ", perkenalkan nama saya adalah " + this.nama;
    }

}


public class method {
    public static void main(String[] args) {
        Ruang obj = new Ruang("Mr.Construct", "123");
        new Ruang(); // Belum ada object apapun

        // pemanggilan method void
        obj.show();
        obj.setNama("Bento", "105219100");
        obj.show();

        System.out.println("Nama: " + obj.getNama());
        System.out.println("NIM : " + obj.getNim());

        //obj.Hello("Assalamu'alaikum");
        String output = obj.Hello("Assalamu'alaikum");
        System.out.println(output);

        //Clone Object Passing obj2 = obj
        Ruang obj2 = new Ruang(obj);
        System.out.println(obj2.getNama());
        System.out.println(obj2.getNim());

    }
}
