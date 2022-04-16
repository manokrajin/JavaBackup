/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Lampu {
    
    private final Musik musik;
    private Integer time;
    private Integer lampu;
    
    public Lampu(Musik musik){
        this.musik=musik;
    }
    
    public void setOn(int on){
        //0 = lampu tidur mati,
        // 1 = lampu tidur nyala
        this.lampu = on;
        
    }
    
    public void setTime(int time){
        this.time = time;
    }     
                                                                                                            
    public void triggerMusik(){
        
        //jika lampu mati maka tidak ada musik
        //jika jam besar atau sama dengan 22 sampai kecil dari 5 mainkan musik instrument
        //jika jam 5 mainkan musik pop
        Musik musik = new Musik();
        if(lampu == 0){
            musik.setMusik(0);
        }
        else if(time >= 22 || time < 5){
            musik.setMusik(2);
        }
        else if(time == 5){
            musik.setMusik(1);
        }
    }
}


