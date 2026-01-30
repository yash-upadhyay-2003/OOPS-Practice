package inheritance.association.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Mumbai Indians");
        team.addPlayer(new Player("Rohit Bakchod"));

        team.showTeam();
    }
}
