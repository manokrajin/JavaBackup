package Statics;

import java.util.ArrayList;

class Player{

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }

    // static method
    static void showNumberOfPlayer(){
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }

}

class Methods{
    public static void main(String[] args) {
        Player player1 = new Player("Naruto");
        Player player2 = new Player("Dragon");
        Player player3 = new Player("Saitama");
        Player player4 = new Player("ZeroOne");

        Player.showNumberOfPlayer();
        
        System.out.println("Names = " + Player.getNames());
        // System.out.println("Names = " + player1.getNames()); // ini bisa dilakukan
        
    }
}