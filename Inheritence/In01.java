package Inheritence;

public class In01 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}



