package inheritance.association.composition;

public class HouseClient {

    public static void main(String[] args) {
        House house = new House();

        house.addRoom(new Room("LivingRoom"));
        house.addRoom(new Room("Hall"));

        house.showRoom();

    }
}
