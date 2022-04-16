import java.util.ArrayList;
public class modal {
    ArrayList<String> harga = new ArrayList<String>();
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> stok = new ArrayList<Integer>();

    public modal(String harga, String namaBarang, int stok){
        this.harga.add(harga);
        this.namaBarang.add(namaBarang);
        this.stok.add(stok);
    }

    public void kelolaBarang(String namaBarang, int stok, String status){
        int pos = this.namaBarang.indexOf(namaBarang);
        if(status.equals("tambah")){
            this.namaBarang.add(namaBarang);
            this.stok.add(stok);
        } else {
            int stokCurr = this.stok.get(pos);
            stokCurr = stokCurr - stok;
            this.stok.set(pos, stokCurr);
        }
        for (String i : this.namaBarang) {
            System.out.println(i);
          }
        for (String i : this.harga) {
            System.out.println(i);
        }
        for (int i : this.stok) {
            System.out.println(i);
        }
    }

    public void kelolaStok(String namaBarang, int stok, String status){
        int pos;
        pos = this.namaBarang.indexOf(namaBarang);
        if(status.equals("tambah")){
            int stokCurr = this.stok.get(pos);
            stokCurr = stokCurr + stok;
            this.stok.set(pos, stokCurr);
        } else {
            int stokCurr = this.stok.get(pos);
            stokCurr = stokCurr - stok;
            this.stok.set(pos, stokCurr);
        }
        for (String i : this.namaBarang) {
            System.out.println(i);
          }
        for (String i : this.harga) {
            System.out.println(i);
        }
        for (int i : this.stok) {
            System.out.println(i);
        }
    }

    public void report(){
        for (String i : this.namaBarang) {
            System.out.println(i);
          }
        for (String i : this.harga) {
            System.out.println(i);
        }
        for (int i : this.stok) {
            System.out.println(i);
        }
    }


}