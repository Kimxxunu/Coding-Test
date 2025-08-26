import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < players.length; i++) pos.put(players[i], i);

        for (String name : callings) {
            int i = pos.get(name);
            if (i == 0) continue;          
            String front = players[i - 1];   

            players[i - 1] = name;
            players[i] = front;

            pos.put(name, i - 1);
            pos.put(front, i);
        }
        return players; 
    }
}
