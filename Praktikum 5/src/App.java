import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String warna;
        float angka;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan warna : ");
        warna = scanner.next();
        System.out.print("Masukkan sisi : ");
        angka = scanner.nextFloat();

        persegi persegi = new persegi(warna,angka);
        System.out.println(persegi.toString());
        
        int gigi;
        int kecepatan;
        int rem;
        sepeda sepeda = new sepeda();
        System.out.print("Masukkan gigi :  ");
        gigi = scanner.nextInt();
        sepeda.gantiGigi(gigi);
        System.out.print("Masukkan kecepatan : ");
        kecepatan = scanner.nextInt();
        sepeda.maju(kecepatan);
        System.out.print("Masukkan rem : ");
        rem = scanner.nextInt();
        sepeda.berhenti(rem);

        sepeda.keadaanSekarang();
        scanner.close();


    }
}
