public class persegi extends shape {
    private float sisi;

    public persegi(String warna,float sisi){
        super(warna);
        this.sisi = sisi;
    }

    float getLuas(){
        return sisi * sisi;
    }

    @Override
    public String toString(){
        return "warna persegi adalah " + super.getWarna() + " luasnya adalah " + getLuas();
    }
}
