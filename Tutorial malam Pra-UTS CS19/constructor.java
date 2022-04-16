// Class dgn constructor
class Construct {
    String code, pw;
    int pin = 100;

    // Nama constructor mesti sama dgn nama Class
    // Ini dipanggil pas object pertama kali dibuat
    Construct() {
        System.out.println("Output ini Constructor (cst)");
    }

    // cst1 dan cst2
    Construct(String inputCode, int inputPin, String inputPw) {
        code = inputCode;
        pin = inputPin;  // Pergantian value
        pw = inputPw;

        // Dibuat lah outputnya disini
        System.out.println("\n=== Output dari Constructor (cst1&2) ===");
        System.out.println(code);
        System.out.println(pin);
        System.out.println(pw);
    }

    // cst3 (Beda urutan parameter tipe data )
    Construct(int inputPin, String inputPw, String inputCode) {
        code = inputCode;
        pin = inputPin;
        pw = inputPw;

        System.out.println("\n=== Output dari Constructor === (cst3)");
        System.out.println(code);
        System.out.println(pin);
        System.out.println(pw);
    }

    // cst4 (Pemakaian 'this' dalam parameter dengan nama var sama)
    Construct(String pw, String code, int pin) {
        // 'this' merujuk pada variabel yang dideklarasikan di Class Construct
        this.code = code;
        this.pw = pw;
        this.pin = pin;
        //pin = inputPin; // tanpa ini akan dihasilkan 100, jika pake hasilnya 200

        System.out.println("\n=== Output dari Constructor (cst4) ===");
        System.out.println(code);
        System.out.println(pin);
        System.out.println(pw);
    }

}

public class constructor {

    public static void main(String[] args) {

        Construct cst = new Construct(); // Pembuatan objek yang belum dimanfaatkan objeknya
        new Construct(); // Hanya pemanggilan constructor

        // Memanggil constructor berupa output
        Construct cst1 = new Construct("RedCode", 919, "RDCOD");
        Construct cst2 = new Construct("GreenCode", 81, "GRCOD");

        // Supaya efektif dan tidak repeat syntax yg sama sperti di bwah ini pada body bgian method
        System.out.println("\n=== Output dari Body Method ===");
        System.out.println(cst1.code + "\n" + cst1.pin + "\n" + cst1.pw);
        System.out.println(cst2.code + "\n" + cst2.pin + "\n" + cst2.pw);


        // Menguji inputan berdasarkan tipe data yang berbeda susunannya
        Construct cst3 = new Construct(919, "BLCOD", "BlueCode");

        System.out.println("\n=== Output dari Body Method ===");
        System.out.println(cst3.code + "\n" + cst3.pin + "\n" + cst3.pw);

        // Menambahkan 'this' pada constructor nya
        Construct cst4 = new Construct("YLCOD", "YellowCode", 200);

        System.out.println("\n=== Output dari Body Method ===");
        System.out.println(cst4.code + "\n" + cst4.pin + "\n" + cst4.pw);

    }

}
