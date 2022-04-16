public class App {
    public static void main(String[] args)  {
        dosen namaDosen = new dosen();
        //namaDosen.setNewObj();
        namaDosen.setNama("manokrajin");
        namaDosen.setAlamat("jakarta");
        namaDosen.setNip("105219001");

        namaDosen = null;
        

        namaDosen = new dosen();
        //namaDosen.setNewObj();
        namaDosen.setNama("manokrajin");
        namaDosen.setAlamat("jakarta");
        namaDosen.setNip("105219001");

        System.out.println(namaDosen.getNama());
        System.out.println(namaDosen.getAlamat());
        System.out.println(namaDosen.getNip() + "\n\n");


        
        // universitas namaUniversitas = new universitas();
        // namaUniversitas.setNama("Universitas Pertamina");
        // namaUniversitas.setAlamat("Simprug");
        // namaUniversitas.setWarna("putihbiru");
        // System.out.println(namaUniversitas.getNama());
        // System.out.println(namaUniversitas.getAlamat());
        // System.out.println(namaUniversitas.getWarna() + "\n\n");

        // mahasiswa namaMahasiswa = new mahasiswa();
        // namaMahasiswa.setNama("ewinghd");
        // namaMahasiswa.setAlamat("jakarta");
        // namaMahasiswa.setNim("10521900001");
        // System.out.println(namaMahasiswa.getNama());
        // System.out.println(namaMahasiswa.getAlamat());
        // System.out.println(namaMahasiswa.getNim());

        // namaMahasiswa = null;


        // namaMahasiswa = new mahasiswa();
        // namaMahasiswa.setNama("ewinghd");
        // namaMahasiswa.setAlamat("jakarta");
        // namaMahasiswa.setNim("10521900001");
        // System.out.println(namaMahasiswa.getNama());
        // System.out.println(namaMahasiswa.getAlamat());
        // System.out.println(namaMahasiswa.getNim());

    }
}
    
