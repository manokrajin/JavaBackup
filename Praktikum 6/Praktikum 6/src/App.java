import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String temp;
        int angka;
        superclass1 apex = new superclass1();
        override apexWeapon = new override();
        System.out.println("======Override=====\n");
        apex.mirage();
        apex.wraith();
        temp = apexWeapon.senjata;
        if(temp == null){
            apex.mirage();
        } else {
            apexWeapon.mirage();
        }
        apexWeapon.setSenjata("R-99");
        temp = apexWeapon.senjata;
        if(temp == null){
            apex.mirage();
        } else {
            apexWeapon.mirage();
        }
        System.out.println("\n======Downcast=====\n");
        superclass2 valorant = new superclass2();
        Scanner input = new Scanner(System.in);
        valorant.weaponShow();
        System.out.print("Masukkan angka senjata dibawah 3 = ");
        angka = input.nextInt();
        valorant.weaponExactShow(angka);
        System.out.println("---------");
        //downcast child = new superclass2();
        superclass2 valorantChild = new downcast();
        downcast child = (downcast)valorantChild;
        child.showText();
        System.out.println(child.weapon[1]);
        input.close();

        
    }
}
