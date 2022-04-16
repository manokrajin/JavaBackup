package Modifier;
import Modifier2.*;

// READ AND WRITE (MODIFIER BERPERAN)


class Player{
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class tapi terbatas
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja
    protected int ubahExp; // protected, sama halnya public akan tetapi tidak universal saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display(){
        tambahExp(); // contoh mengakses private methods
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health); // membaca, tapi didalam class
    }

    // public
    public void ubahName(String nameBaru){
        this.name = nameBaru;
    }

    // private
    private void tambahExp(){
        this.exp += 100;
    }

    
    // protected
    protected void ubahExp(int expBaru){
        this.exp = expBaru;
    }
}


class Main{
    public static void main(String[] args) {
        
        Player player1 = new Player("Marni", 0, 100);

        // default
        System.out.println(player1.name); // membaca data
        player1.name = "Surti"; // Menulis data
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 100; // Menulis data
        System.out.println(player1.exp); // membaca data

        // private (tidak bisa diakses)
        // System.out.println(player1.health); // membaca data
        // player1.health = 200; // Menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // default
        player1.display();

        // public
        player1.ubahName("Tejo");

        //protected
        player1.ubahExp(500);
        player1.display();

        // private (tidak bisa diakses)
        // player1.tambahExp();

        //=====================================================================//
        System.out.println("\n=====\n");
        Pemain pemain1 = new Pemain("Nopal",0,100);

        // default
        System.out.println(pemain1.name); // membaca data
        pemain1.name = "Cuty"; // Menulis data
        System.out.println(pemain1.name); // membaca data

        // public
        System.out.println(pemain1.exp); // membaca data
        pemain1.exp = 100; // Menulis data
        System.out.println(pemain1.exp); // membaca data

        // private (tidak bisa diakses)
        // System.out.println(pemain1.health); // membaca data
        // pemain1.health = 200; // Menulis data
        // System.out.println(pemain1.health); // membaca data

        // methods

        // default
        pemain1.display();

        // public
        pemain1.ubahName("Bejo");
        pemain1.display();

        // protected (tidak bisa diakses, diluar package)
        // pemain1.ubahExp(200);

        // private (tidak bisa diakses)
        // pemain1.tambahExp();
    }
}