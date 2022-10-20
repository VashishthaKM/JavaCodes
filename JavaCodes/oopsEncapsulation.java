package OPPS;

public class oopsEncapsulation {
    public static void main(String[] args) {
        Secret obj=new Secret();
        obj.setData(103);
        obj.setData(104);
        System.out.println(obj.getData());
    }
}
class Secret {
    private int data;
    public void setData(int data){
        if(data>100){
            this.data=data;
        }
    }
    public int getData(){
        return data;
    }
}
