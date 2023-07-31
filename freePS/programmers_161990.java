
import java.util.*;
import java.math.*;


public class programmers_161990 {
  public int[] solution(String[] wallpaper) {
    int ly = wallpaper.length, lx = wallpaper[0].length(), ry = -1, rx = -1;
    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[i].length(); j++) {
        char c = wallpaper[i].charAt(j);
        if (c == '#') {
          if (ly > i) {
            ly = i;
          }
          if (lx > j) {
            lx = j;
          }
          if (ry < i + 1) {
            ry = i + 1;
          }
          if (rx < j + 1) {
            rx = j + 1;
          }
        }
      }
    }
    return new int[]{ly, lx, ry, rx};
}
