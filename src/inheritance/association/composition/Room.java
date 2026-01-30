package inheritance.association.composition;

public class Room {
    String name;
    Room(String name){
        this.name  = name;
    }

    public String getName() {           //getter method
        return name;
    }
}
