public class override extends superclass1 {
    String senjata;
    
    public void setSenjata(String senjata){
        this.senjata = senjata;
    }
    public String getSenjata(){
        return senjata;
    }
    public void senjata(){
        System.out.println(senjata);
    }
    @Override
    public void mirage(){
        System.out.println("nah boy you gettin' killed with " + senjata);
        System.out.println("Child Method");
    }
    
    public void wraith(){
        System.out.println("Good choice " + senjata + " ,for me");
        System.out.println("Child Method");
    }

}
