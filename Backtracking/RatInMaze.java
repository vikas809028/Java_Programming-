public class RatInMaze {
    public static void ratMaze(int maze[][], int sol[][],int x,int y){
        int n = maze.length;
        if( x == n-1 && y == n-1) {
            printMaze(sol);
        }

        if(isSafe(maze, x, y-1, sol)==true){
            sol[x][y-1]=1;
            ratMaze(maze, sol, x, y-1);
            sol[x][y-1]=0;
            
        }
        if(isSafe(maze, x, y+1, sol)==true){
            sol[x][y+1]=1;
            ratMaze(maze, sol, x, y+1);
            sol[x][y+1]=0;
            
        }
        if(isSafe(maze, x-1, y, sol)==true){
            sol[x-1][y]=1;
            ratMaze(maze, sol, x-1, y);
            sol[x-1][y]=0;
            
        }
        if(isSafe(maze, x+1, y, sol)==true){
            sol[x+1][y]=1;
            ratMaze(maze, sol, x+1, y);
            sol[x+1][y]=0;
            
        }

    }



    public static boolean isSafe(int maze[][] , int x, int y,int sol[][]){
        int n =  maze.length;
        if(x<0 || x>=n || y<0 || y>=n || sol[x][y]==1 || maze[x][y] == 0){
            return false;
        }
        return true;
    }



    public static void printMaze(int sol[][]){
        for(int i = 0; i < sol.length;i++)
        {
            for(int j = 0; j < sol.length;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int maze[][] ={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int N = maze.length;
        int sol[][] = new int [N][N];
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                sol[i][j]=0;
            }
        }
        sol[0][0] = 1;
        ratMaze(maze, sol, 0, 0);
        

    }
}
