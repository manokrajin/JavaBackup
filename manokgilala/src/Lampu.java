public class Lampu {
    
    private final Musik musik;
    private int time;
    
    public Lampu(Musik musik){
        this.musik=musik;
    }
    
    public void setOn(int on){
        if ( on == 0){
            System.out.println("Lampu Mati");
        } else {
            System.out.println("Lampu Hidup");
        }
    }
    
    public void setTime(int time){
        this.time = time;
    }     
                                                                                                            
    public void triggerMusik(){
        if (time == 5){
            musik.setMusik(1);
        } else if (time >= 22 || time < 5){
            musik.setMusik(2);
        } else{
            musik.setMusik(0);
        }
    }
}


