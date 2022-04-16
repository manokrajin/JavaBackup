package badut;

import java.util.Scanner;


public class mobil {
    
        String[] nama = new String[5];
        String[] roda =  new String[5];
        String[] spion= new String[5];
        String[] bahanbakar= new String[5];
        String[] warna= new String[5];

    Scanner inputan = new Scanner(System.in);
    public mobil(){
        for (int count = 0; count < 4; count++){
            System.out.print("mau mobil jenis apa : ");
            nama[count] = inputan.next();
            System.out.println("mobil anda adalah " + nama);
            System.out.print("mau spion berapa : ");
            spion[count] = inputan.next();
            System.out.println("spion anda ada " + spion);
            System.out.print("bahan bakar anda : ");
            bahanbakar[count]= inputan.next();
            System.out.print("warna anda : ");
            warna[count] = inputan.next();
        }

        for (int count = 0; count < 4; count++){
            System.out.println(nama[count]);
            System.out.println(roda[count]);
            System.out.println(spion[count]);
            System.out.println(bahanbakar[count]);
            System.out.println(warna[count]);
        }
    }

    public mobil (String Input){
        if(Input == "on") {
            System.out.println("stending dan terbang");
        }
        else{
            System.out.println("......");
        }
    }

    public mobil(int rusak){
        if(rusak > 80){
            System.out.println("masuk bengkel");
        }
        else{
            System.out.println("santuy aja");
        }
    }

} 
