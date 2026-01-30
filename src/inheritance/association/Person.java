package inheritance.association;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    Car car;
    Person(String name, Car car){
        this.name=name;
        this.car=car;
    }
    void goForDrive(){
        System.out.println(name + "is going for a drive");
        car.drive();
    }
}
