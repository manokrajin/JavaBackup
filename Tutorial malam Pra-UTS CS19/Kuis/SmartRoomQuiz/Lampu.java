package SmartRoomQuiz;

public class Lampu {
    
    private final Musik musik;
    private int time;
    private int on;
    
    
    public Lampu(Musik musik){
        this.musik = musik;
    }
    

    public void setOn(int on){
        this.on = on;
    }

    public int getOn() {
        return on;
    }

    public void statusLampu(int on) {
        //0 = lampu tidur mati,
        // 1 = lampu tidur nyala
        if(on == 0) {
            System.out.println("Off");
        }
        else if(on == 1) {
            System.out.println("On");
        }
    }
    
    public void setTime(int time){
        this.time = time;
    }

    public int getTime() {
        return time;
    }
                                                                                                            
    public void triggerMusik(int on, int time){
        statusLampu(on);
        //jika lampu mati maka tidak ada musik
        if(on == 0) {
            musik.setMusik(0);
        }
        //jika jam 5 mainkan musik pop
        else if(time >= 5 && time < 22) {
            musik.setMusik(1);
        }
        //jika jam besar atau sama dengan 22 sampai kecil dari 5 mainkan musik instrument
        else if(time >= 22) {
            musik.setMusik(2);
        }

    }
}


