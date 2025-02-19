import java.util.*;

class RatInAMaze{
    
    private static void findPath(int maze[][] , int x , int y , int n , boolean visited[][] , String path , List<String> paths){
        if(x == n-1 && y == n-1){
            paths.add(path);
            return;
        }
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        char[] move = {'R','L','D','U'};

        for(int i = 0 ; i < 4 ; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(isSafe(maze, newX, newY, n, visited)){
                visited[newX][newY] = true;
                findPath(maze, newX, newY, n, visited, path + move[i], paths);
                visited[newX][newY] = false;
            }
        }
    }

    private static boolean isSafe(int maze[][] , int x , int y , int n , boolean visited[][]){
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y];
    }

    public static List<String> findPath(int maze[][] , int n){
        List<String> paths = new ArrayList<>();
        boolean visited[][] = new boolean[n][n];
        visited[0][0] = true;
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0){
            return paths;
        }
        findPath(maze , 0 , 0 , n , visited , "" , paths);
        return paths;
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        int n = maze.length;
        List<String> paths = findPath(maze, n);
        for(String path : paths){
            System.out.println(path);
        }
    }
}