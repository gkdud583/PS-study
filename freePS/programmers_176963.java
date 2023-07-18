import java.util.HashMap;
import java.util.Map;

public class programmers_176963 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];
    Map<String, Integer> friends = new HashMap<>();

    for (int i = 0; i < name.length; i++) {
      friends.put(name[i], yearning[i]);
    }
        /*
        may : 5,
        kein : 10,
        kain : 1,
        radi : 3
        */
    for (int i = 0; i < photo.length; i++) {
      int sum = 0;
      for (int j = 0; j < photo[i].length; j++) {
        if (friends.containsKey(photo[i][j])) {
          sum += friends.get(photo[i][j]);
        }
      }
      answer[i] = sum;
    }

    return answer;
  }
}
