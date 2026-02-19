package abstraction_prc;
//abstraction means hiding the internal implementation and showing essential features/ function
//in abstarction , both abstarct and not abstract method
//By default variable is instance
//if method is abstract , class should be abstract
//also wa can not create object of abstract class beacuse inside class abstract method, this method has no implimention
//we can achieve abstraction using abstract class and interface
// avoid code duplication , complexity , easily understand interface
//loose couple,achieve polymorphism, increase scalability, avoid duplication

abstract class Vehicle{
    int noOfVehicle;
    void No_of_vehicle(){
        System.out.println(noOfVehicle);
    }
    abstract void start();
}

class Truck extends Vehicle{
    void start(){
        noOfVehicle = 4;
        System.out.println("truck is start");
    }
}

class Scooter extends Vehicle{
    void start(){
        noOfVehicle = 2;
        System.out.println("Scooter is start");
    }

}
public class Main {

    public static void main(String[] args) {
        Truck v1 = new Truck();
        v1.start();
        v1.No_of_vehicle();

        Scooter v2 = new Scooter();
        v2.start();
        v2.No_of_vehicle();

    }
}
