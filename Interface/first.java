package Interface;

public class first {
    public static void main(String[] args){
        Car obj = new Car();
        obj.Start();
        obj.Stop();
    }
}

interface a{
    void Start();
}
interface b{
    void Stop();
}

class Car implements a,b{
    public void Start(){
        System.out.println("Car Started..");
    }
    public void Stop(){
        System.out.println("Car Stopped..");
    }
}