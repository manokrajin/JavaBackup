////////////// DISPLAY ///////////////////

// Pada Jam 5
// hanya lampu Utama On
// diringi lagu pop
 
// Pada Jam 8
// semua lampu Off

// Pada Jam 19
// hanya lampu Utama On
// diringi lagu pop
 
// Pada Jam 22
// hanya lampu Tidur On
// diiringi lagu Instrumental

///////////////DISPLAY///////////////////
public class SmartRoom{

    private int time;
    public static Lampu lampuUtama;
    public static Lampu lampuTidur;
    
    public SmartRoom(Lampu lampuUtama, Lampu lampuTidur){
        this.lampuUtama = lampuUtama;
        this.lampuTidur = lampuTidur;
        System.out.println("Mahran Radifan Zhafir\n105219001\n================================\n");
    }

    public void command(String command){
        if (command.equals("Hi MyRoom")){
            System.out.println("lampu utama ");
            lampuUtama.setOn(1);
            System.out.println("lampu tidur ");
            lampuTidur.setOn(0);
        } else if(command.equals("Bye MyRoom")){
            System.out.println("lampu keduanya ");
            lampuUtama.setOn(0);
            lampuTidur.setOn(0); 
        } else if(command.equals("Sleep MyRoom")){
            System.out.println("lampu utama ");
            lampuUtama.setOn(0);
            System.out.println("lampu tidur");
            lampuTidur.setOn(1); 
        } else{
            lampuUtama.setOn(0);
            lampuTidur.setOn(0); 
            System.out.println("masukkan command yang benar");
        }
        lampuUtama.setTime(time);
        lampuTidur.setTime(time);
        lampuUtama.triggerMusik();
        lampuTidur.triggerMusik(); 
    }
    
    public void readTime(int time){
        this.time = time;
        System.out.println("sekarang jam :  " + time);
    }
    
    public static void main( String args[]){
        Musik speaker=new Musik();

        lampuUtama = new Lampu(speaker);
        lampuTidur = new Lampu(speaker);
        
        //buat 2 buah objek LampuUtama dan Lampu Tidur dengan

        SmartRoom myroom=new SmartRoom(lampuUtama,lampuTidur);
        
        myroom.readTime(5);             //Saat bangun pagi jam 5
        myroom.command("Hi MyRoom");    //Lampu utama nyala 
        System.out.println("\n================================\n");
        myroom.readTime(8);             //Saat pergi beraktifitas outdoor jam 8
        myroom.command("Bye MyRoom");   //semua lampu mati    
        System.out.println("\n================================\n");
        myroom.readTime(19);            //Saat pulang ke rumah jam 19
        myroom.command("Hi MyRoom");    //Lampu utama nyala 
        System.out.println("\n================================\n");
        myroom.readTime(22);            //Saat akar tidur ke rumah  jam 22
        myroom.command("Sleep MyRoom"); //lampu tidur nyala  
    }    
}

// 