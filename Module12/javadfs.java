public class javadfs {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int cnt = 0;
  
    public static void main(String[] args) {
  
  
      int[][] board = new int[3][3];
      boolean[][] visited = new boolean[3][3];
  
      board[0]=new int[]{0,0,0};
      board[1]=new int[]{0,0,1};
      board[2]=new int[]{1,0,0};
  
      dfs(board, visited, 0, 0);
  
      System.out.println(cnt);
    }
  
    static void dfs(int[][] board, boolean[][] visited, int x, int y) {
  
      if (x == 2 && y == 2) {
        cnt++;
        return;
      }
      visited[x][y] = true;
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx >= 0 && ny >= 0 && nx < board.length && ny < board.length) {
          if (!visited[nx][ny] && board[nx][ny] == 0) {
            dfs(board, visited, nx, ny);
            visited[nx][ny] = false;
          }
        }
      }
    }
  }