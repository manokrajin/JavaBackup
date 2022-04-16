package SmartRoomQuiz;

public class Musik {
    
    protected int type;

    public void setMusik(int type){
          //display tipe musik yang sedang dimainkan 
          //Type Musik off=0, pop=1, instrument=2;
          if(type == 1) {
               System.out.println("diiringi lagu Pop");
          }
          else if(type == 2) {
               System.out.println("diiringi lagu Instrumental");
          }
          else if(type == 0) {
               System.out.print("");
          }
    }              
}
