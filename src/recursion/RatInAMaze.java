package recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        boolean[][] visited=new boolean[maze.length][maze.length];
        helper(maze,0,0,"",visited);
        System.out.println(ans);
    }
    public static void helper(int[][] maze, int r,int c, String path, boolean[][] visited){
        if(r<0 || c<0 ||r>=maze.length || c>=maze.length || maze[r][c]==0 || visited[r][c])
            return;
        if(r==maze.length-1 && c==visited.length-1){
            ans.add(path);
            return;
        }
        visited[r][c]=true;
        helper(maze,r+1,c,path+"D",visited);
        helper(maze,r,c-1,path+"L",visited);
        helper(maze,r,c+1,path+"R",visited);
        helper(maze,r-1,c,path+"U",visited);
        visited[r][c]=false;
    }
}
