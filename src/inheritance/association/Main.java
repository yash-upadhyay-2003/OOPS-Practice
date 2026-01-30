package inheritance.association;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");
        Person person = new Person("John",car);
        person.goForDrive();
    }
}
