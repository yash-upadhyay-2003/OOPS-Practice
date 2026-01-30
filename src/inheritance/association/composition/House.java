package inheritance.association.composition;

import java.util.ArrayList;
import java.util.List;

public class House {



    List<Room> rooms;
    House(){
        rooms = new ArrayList<>();
    }
    void addRoom(Room room){
       rooms.add(room);
    }

    public void showRoom(){
        for (Room room : rooms){
            System.out.println(room.getName());
        }
    }

}
