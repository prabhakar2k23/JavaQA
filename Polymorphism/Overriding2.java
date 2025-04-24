package Polymorphism;

public class Overriding2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound(); // Calls Animal's method, NOT Dog's method!
        
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Mistakenly wrote makeSounds() instead of makeSound()
    @Override
    void makeSound() { 
        System.out.println("Dog barks");
    }
}
