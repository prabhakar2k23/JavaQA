package Abstraction;
// using class
public class Abs01 {
    public static void main(String[] args){
        Car c = new Car();
        c.Start();
        c.Stop();
        
    }
}

abstract class Vehicle{
    abstract void Start();

    void Stop(){
        System.out.println("Vehicle Stoped..");
    }
}

class Car extends Vehicle{
    @Override
    void Start(){
        System.out.println("Car start with a key");
    }
}