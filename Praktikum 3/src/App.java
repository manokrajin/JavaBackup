import java.util.Scanner;

import java.io.*;

public class App {
    public static void main(String[] args){
        mahasiswa mah1 = new mahasiswa();
        mahasiswa mah2 = new mahasiswa();
        String tempStr;
        int tempInt;
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============================");
        System.out.print("Masukkan Nama : ");
        tempStr = input.next();
        mah1.setNama(tempStr);
        System.out.print("Masukkan NIM : ");
        tempStr = input.next();
        mah1.setNim(tempStr);
        System.out.print("Masukkan tinggi : ");
        tempInt = input.nextInt();
        mah1.setTinggi(tempInt);
        System.out.print("Masukkan Berat : ");
        tempInt = input.nextInt();
        mah1.setBerat(tempInt);
        mah1.setBmi();

        System.out.println("=============================");
        System.out.print("Masukkan Nama : ");
        tempStr = input.next();
        mah2.setNama(tempStr);
        System.out.print("Masukkan NIM : ");
        tempStr = input.next();
        mah2.setNim(tempStr);
        System.out.print("Masukkan tinggi : ");
        tempInt = input.nextInt();
        mah2.setTinggi(tempInt);
        System.out.print("Masukkan Berat : ");
        tempInt = input.nextInt();
        mah2.setBerat(tempInt);
        mah2.setBmi();

        PrintWriter output;
        try {
            output = new PrintWriter("bmi.txt");
            output.println("Mahasiswa 1 :");
            output.println("Nama : " + mah1.getNama());
            output.println("NIM : " + mah1.getNim());
            output.println("tinggi : " + mah1.getTinggi());
            output.println("berat : " + mah1.getBerat());
            output.println("bmi : " + mah1.getBmi());
            output.println("Mahasiswa 2 :");
            output.println("Nama : " + mah2.getNama());
            output.println("NIM : " + mah2.getNim());
            output.println("tinggi : " + mah2.getTinggi());
            output.println("berat : " + mah2.getBerat());
            output.println("bmi : " + mah2.getBmi());
            output.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            File inputFile = new File("bmi.txt");
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       
    }
   
    

}
