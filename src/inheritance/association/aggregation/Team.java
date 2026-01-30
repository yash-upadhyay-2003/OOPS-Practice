package inheritance.association.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Team {
    String teamName;
    List<Player> players ;
    Team(String teamName){
        players = new ArrayList<>();
        this.teamName = teamName;
    }
    void addPlayer(Player player){
        players.add(player);
    }
    void showTeam(){
        System.out.println("Team " + teamName + " has players:");
        for(Player p :players){
            System.out.println(p.name);
        }
    }
}
