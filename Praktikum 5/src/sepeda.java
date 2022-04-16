public class sepeda implements kendaraan {
    int kecepatan;
    int gigi;
    int rem;

    public void gantiGigi(int gigi){
        this.gigi = gigi;  
    }
    public void maju(int kecepatan){
        this.kecepatan = this.kecepatan + kecepatan;
    }

    public void berhenti(int rem){
        this.rem = rem;
        this.kecepatan = this.kecepatan - rem;
    }

    public void keadaanSekarang(){
        System.out.println("sekarang gigi " + gigi + " dengan kecepatan " + this.kecepatan + " dengan perlambatan " + rem);
    }
}
