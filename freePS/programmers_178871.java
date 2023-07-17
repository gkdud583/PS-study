import java.util.Map;
import java.util.HashMap;

class programmers_178871 {
  public String[] solution(String[] players, String[] callings) {
    String ranks[] = new String[players.length]; //어떤 순서에 어떤 선수가 있는지

    for (int i = 0; i < players.length; i++) {
      ranks[i] = players[i];
    }

    Map<String, Integer> location = new HashMap<>(); //어떤 선수가 어떤 순서에 있는지
    int rank = 0;
    for (String player : players) {
      location.put(player, rank++);
    }

    for (String calling : callings) {
      int cur = location.get(calling); //현재 순위
      int nxt = cur - 1;
      location.replace(calling, nxt);
      location.replace(ranks[nxt], cur);
      ranks[cur] = ranks[nxt];
      ranks[nxt] = calling;

    }
    return ranks;
  }
}
