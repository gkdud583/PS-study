
class programmers_161989 {
  public int solution(int n, int m, int[] section) {
    boolean needPaint[] = new boolean[n];
    for (int i = 0; i < section.length; i++) {
      needPaint[section[i] - 1] = true;
    }
    int paintCount = 0;
    for (int i = 0; i < n;) {
      if (needPaint[i]) {
        i += m;
        paintCount++;
        continue;
      }
      i++;
    }
    return paintCount;
  }
}
