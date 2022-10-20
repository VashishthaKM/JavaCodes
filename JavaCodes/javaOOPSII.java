package OPPS;

public class javaOOPSII{
    //inheritence class
    public static void main(String[] args) {
        Samsung glaxym30s=new Samsung();
        glaxym30s.playPUBG();   

        Apple a1= new Apple();
        a1.playPUBG();
    }
}
class Samsung extends MobilePhone{
    void playPUBG(){
        System.out.println("PLaying PUBG in Samsung.");
    }
}
class Apple extends MobilePhone{
}
class MobilePhone{
    String os;
    int price;
    int dimension;
    void playPUBG(){
        System.out.println("Sunny is Playing game.");
    }
}