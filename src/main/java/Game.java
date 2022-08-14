import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    //private ArrayList<Player> playerList = new ArrayList<Player>();
    HashMap<String, Integer> playerMap = new HashMap<>();

    public void register(Player player) {
        playerMap.put(player.getName(), player.getStrength());
    }

    public int strenghtByName(String name) {

        if (playerMap.containsKey(name)) {
            return playerMap.get(name);
        }

        throw new NotRegisteredException("Player with name: " + name + " is not registered!");
    }

    public int round(String playerName1, String playerName2) {
        if (strenghtByName(playerName1) > strenghtByName(playerName2)) {
            return 1;
        } else if (strenghtByName(playerName1) < strenghtByName(playerName2)) {
            return 2;
        } else {
            return 0;
        }
    }
}
