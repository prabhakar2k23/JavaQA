package Encapsulation;
public class E02 {
    public static void main(String[] args){
        Student s = new Student();
        s.calAvg(80,70,60,90,97);
        System.out.println(s.res());
    }
}

class Student{
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;
    public void calAvg(int a,int b,int c,int d,int e){
        this.m1=a;
        this.m2=b;
        this.m3=c;
        this.m4=d;
        this.m5=e;
    }
    public float res(){
        float fres =(float) (m1+m2+m3+m4+m5)/5;
        return fres;
    }
}