package Encapsulation;
public class E01 {
    
    public static void main(String[] args){
        Person p = new Person();
        p.setNum(5,10);
        System.out.println(p.getNum());
    }
    
}

class Person{
    private int num;
    private int num2;
    public void setNum(int a,int b){
        num = a;
        num2 = b;
    }
    public int getNum(){
        return num*num2;
    }
}
