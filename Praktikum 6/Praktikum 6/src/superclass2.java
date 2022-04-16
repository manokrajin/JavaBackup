public class superclass2 {
    String[] weapon = {"Operator" , "Vandal" , "Phantom"};
    public void weaponShow(){
        for (int i = 0; i < weapon.length; i++){
            System.out.println(weapon[i]);
        }
    }
    public void weaponExactShow(int i){
        if (i < weapon.length){
            System.out.println(weapon[i]);
            System.out.println("Parent Downcast");
        }
    }
}
