package ir.maktabkhune.android.withoneislarger.Utils.models;

import java.util.ArrayList;

public class RankList {

    ArrayList<Player> players;

    public RankList() {
        players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player newPlayer){
        players.add(newPlayer);
    }
}
