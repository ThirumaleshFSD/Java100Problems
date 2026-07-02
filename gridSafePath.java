public class gridSafePath {
    public static void main(String[] args){
        int[][] grid={{0,0,0},{0,1,0},{0,0,0}};
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        if(dfs(grid,visited,0,0)){
            System.out.println("Safe Path Exists");
        }else{
            System.out.println("No Safe Path");
        }
    }
   public static boolean dfs(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==1 || visited[i][j]){
            return false;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return true;
        }
        visited[i][j]=true;
        boolean left=dfs(grid,visited,i,j-1);
        boolean right=dfs(grid,visited,i,j+1);
        boolean up=dfs(grid,visited,i-1,j);
        boolean down=dfs(grid,visited,i+1,j);
        return left || right || up || down;
    }
}
