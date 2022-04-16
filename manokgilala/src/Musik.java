public class Musik {
    
    public void setMusik(int type){
       //display tipe musik yang sedang dimainkan 
       //Type Musik off=0, pop=1, instrument=2;
       if (type == 1){
           System.out.println("Musik Pop");
       } else if (type == 2){
           System.out.println("Musik instrument");
       } else {
           System.out.println("Musik Off");
       }
    }              
}
