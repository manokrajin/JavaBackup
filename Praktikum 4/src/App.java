public class App {
    public static void main(String[] args) throws Exception {
        mobil mobil = new mobil();
        mobil.jumlahBan = 4;
        mobil.model = "Xenia";
        mobil.tahun = 2010;
        System.out.println("Model : " + mobil.model);
        System.out.println("Jumlah : " + mobil.jumlahBan);
        System.out.println("tahun : " + mobil.tahun);
        mobil.bergerak();
        mobil.lampuMenyala();

        truk truk = new truk();
        truk.jumlahBan = 6;
        truk.model = "Fuso";
        truk.tahun = 1999;
        System.out.println("Model : " + truk.model);
        System.out.println("Jumlah : " + truk.jumlahBan);
        System.out.println("tahun : " + truk.tahun);
        truk.bergerak();
        truk.lampuMenyala();

        traktor traktor = new traktor();
        traktor.jumlahBan = 5;
        traktor.model = "Concat";
        traktor.tahun = 1990;
        System.out.println("Model : " + traktor.model);
        System.out.println("Jumlah : " + traktor.jumlahBan);
        System.out.println("tahun : " + traktor.tahun);
        traktor.bergerak();
        traktor.lampuMenyala();

    }
}
