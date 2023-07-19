import java.util.Map;

public class programmers_172928 {
  static final int dy[] = {0, 0, 1, -1};
  static final int dx[] = {1, -1, 0, 0};
  static final Map<String, Integer> directions = Map.of("E", 0, "W", 1, "S", 2, "N", 3);
  public int[] solution(String[] park, String[] routes) {

    int cur[] = new int[2]; //y,x
    int map[][] = new int[park.length][park[0].length()];

    for (int i = 0; i < park.length; i++) {
      String row = park[i];
      for (int j = 0; j < park[0].length(); j++) {
        if (row.charAt(j) == 'S') {
          cur[0] = i;
          cur[1] = j;
          continue;
        }
        if (row.charAt(j) == 'X') {
          map[i][j] = -1;
          continue;
        }
      }
    }
    System.out.println(cur[0] + " " + cur[1]);
    for (int i = 0; i < routes.length; i++) {
      String values[] = routes[i].split(" ");
      int distance = Integer.parseInt(values[1]);
      int temp[] = {cur[0], cur[1]};
      boolean success = true;
      for (int j = 0; j < distance; j++) {
        int ny = temp[0] + dy[directions.get(values[0])];
        int nx = temp[1] + dx[directions.get(values[0])];

        if (isOutOfArray(ny, nx, park.length, park[0].length()) || map[ny][nx] == -1) {
          success = false;
          break;
        }
        temp[0] = ny;
        temp[1] = nx;
      }
      if (success) {
        cur[0] = temp[0];
        cur[1] = temp[1];
      }

    }

    return cur;
  }
  private boolean isOutOfArray(int y, int x, int rs, int cs) {
    return y < 0 || x < 0 || y >= rs || x >= cs;
  }
}
