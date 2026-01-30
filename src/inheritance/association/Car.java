package inheritance.association;

public class Car {
    String model;
    Car(String model){
        this.model = model;
    }
    void drive(){
        System.out.println("the car which is driven is a " + model);
    }
}

