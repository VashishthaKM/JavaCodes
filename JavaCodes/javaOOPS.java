package OPPS;
class Animal{
    int legs;
    String name;
    void walk(){
        System.out.println(name +" Can walk");
    }
}
public class javaOOPS{
    public static void main(String[] args) {
        Animal a1= new Animal();
        Animal a2= new Animal();

        a1.name="Joy";
        a1.legs=4;
        a2.name="Rio";
        a2.legs=2;
        System.out.println(a1.name +" "+ a1.legs);
        a1.walk();
    }
}