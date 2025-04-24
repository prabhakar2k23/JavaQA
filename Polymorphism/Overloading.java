package Polymorphism;

public class Overloading {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(4.4,5.5));
        System.out.println();
    }
}

class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}