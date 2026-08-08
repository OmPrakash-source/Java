
public class inheritance {
	public static void main(String[] args){
        Car c1 = new Car();
        c1.car_speed();
        System.out.println(c1.speed);
        System.out.println(c1.doors);
        Tempo t1 = new Tempo();
        t1.Tempo_speed();
        System.out.println(t1.weighting);
        t1.Tempo_speed();

        t1.stop(t1); //this work only tempo
    }
}
class Vehical{
    double speed = 60.45;
    void go(){
        System.out.println("This vehical is moving...");
    }
    // void stop(){
    //     System.out.println("This vehical is stop...");
    // }

    void stop(Tempo t1){ // because of this tempo 
        System.out.println("This vehical is stop with weight "+ t1.weighting);
    }
}
class Car extends Vehical{
    int doors = 4;
    void car_speed(){
        System.out.println("This car is moving at " + speed + " Hr");
    }
}
class Tempo extends Vehical{
    String weighting = "400 KG";
    
    void Tempo_speed(){
        System.out.println("This tempo is moving at " + speed + " Hr");
    }
}

