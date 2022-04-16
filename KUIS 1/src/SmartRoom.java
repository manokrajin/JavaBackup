

/*
KUIS 1 ILMU KOMPUTER
Pada kuis ini disediakan sebuah project IDE netbeans. 
project ini berisi source code java yang terdiri dari beberapa class

Soal:
Terdapat sebuah smart room yang memiliki 3 device yang terintegrasi yaitu 1 lampu utama, 1 lampu tidur 
dan 1 speaker.
dimana ketiga device tersebut bisa memahami beberapa perintah dari user serta mengetahui waktu saat ini.
ketika user memberikan perintah pada waktu tertentu maka lampu akan meresponnya
ketika lampu merespon maka speaker juga akan merespon perubahan lampu dengan memainkan musik berbeda
Buatlah code dengan mengimplementasikan konsep seperti di atas dengan 
menyertakan log atau riwayat penggunaan ruangan sebagai berikut

//////////////DISPLAY///////////////////

Pada Jam 5
hanya lampu Utama On
diringi lagu pop
 
Pada Jam 8
semua lampu Off

Pada Jam 19
hanya lampu Utama On
diringi lagu pop
 
Pada Jam 22
hanya lampu Tidur On
diiringi lagu Instrumental

///////////////DISPLAY///////////////////

BACA Sebelum mulai mengerjakan :
- TIDAK boleh ubah code soal 
- Selalu Mengacu pada Method main() ada di file SmartRoom
- Lihat semua class dan pahami fungsinya.
- Boleh buat method baru sesuai kebutuhan
- Buatlah statement dari method baru atau method yang masih belum memiliki statement
- Setelah selesai mengerjakan kirim semua file .java via teams
- Kerjakan dalam waktu 2 jam

ATURAN pengerjaan file SmartRoom.java
1. lengkapi NIM dan NAMA di constuctor  SmartRoom().
2. method main tidak boleh diubah kecuali penambahan 2 buah objek lampuUtama dan lampuTidur
3. set variable yang dibutuhkan 
4. set constructor
5. pada method command
    //lengkapi code
        //jika command "Bye MyRoom" set semua lampu mati dan display
        //jika command "Hi MyRoom" set hanya lampu utama menyala dan display
        //jika command "Sleep MyRoom" set hanya lampu tidur menyala dan display
        // selain itu set semua lampu mati dan display please correct command
6.pada method readTime
    //lengkapi code untuk membaca waktu

*/


public class SmartRoom{
    

    private int time;
    private final Lampu lampuUtama;
    private final Lampu lampuTidur;
    
    public SmartRoom(Lampu utama,Lampu tidur){
        this.lampuTidur = tidur;
        this.lampuUtama = utama;
    }
    
    public void command(String command){
        if(command == "Bye MyRoom"){
            lampuUtama.setOn(0);
            lampuTidur.setOn(0);   
        }
        else if(command == "Hi MyRoom"){
            lampuUtama.setOn(1);
            lampuTidur.setOn(0);
        }
        else if(command == "Sleep MyRoom"){
            lampuUtama.setOn(0);
            lampuTidur.setOn(1);
        }
          
           
        lampuUtama.triggerMusik();
        lampuTidur.triggerMusik();  
           
    }
    
    public void readTime(int time){
        this.time = time;
    }
    
    public static void main( String args[]){
        
        
        
        Musik speaker=new Musik();
        Lampu lampuUtama = new Lampu(speaker);
        Lampu lampuTidur = new Lampu(speaker);
        //buat 2 buah objek LampuUtama dan Lampu Tidur dengan
       
        SmartRoom myroom=new SmartRoom(lampuUtama,lampuTidur);
        
        myroom.readTime(5);             //Saat bangun pagi jam 5
        myroom.command("Hi MyRoom");    //Lampu utama nyala 
        
        myroom.readTime(8);             //Saat pergi beraktifitas outdoor jam 8
        myroom.command("Bye MyRoom");   //semua lampu mati    
        
        myroom.readTime(19);            //Saat pulang ke rumah jam 19
        myroom.command("Hi MyRoom");    //Lampu utama nyala 
        
        myroom.readTime(22);            //Saat akar tidur ke rumah  jam 22
        myroom.command("Sleep MyRoom"); //lampu tidur nyala  
    }    
}
