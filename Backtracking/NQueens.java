public class NQueens {
    public static boolean nQueens(String chess[][] , int row ) {
        //base case
        if(row == chess.length){
            // for printing number of counts
            printChess(chess);

            count++; // to get corre t way comment return true
            
            // return true;
        }
        // recursive approach
        for(int j = 0; j < chess.length;j++){
            if(isSafe(chess, row, j)){
            chess[row][j] = "Q";
            // nQueens(chess, row+1);

            // Use If to print only one solution and write retuen true in if statement;
            if(nQueens(chess, row+1)){
              return true;
            }

            chess[row][j] = "X";
            }
            
        }
        return false;
    }
    public static boolean isSafe(String chess[][], int row ,int col){
        // upword vertical
        for(int i = row-1 ; i>=0; i--){
            if(chess[i][col] == "Q")
            {
                return false;

            }
        }
        // left diagonal
        for(int i = row-1,j = col-1;j>=0 && i>=0; i--, j--){
                if(chess[i][j] == "Q")
                {
                    return false;

                }
            }

        // right diagonal
        for(int i = row-1,j = col+1; i>=0 && j<chess.length; i-- ,j++){
                if(chess[i][j] == "Q")
                {
                    return false;

                }
            }


        return true;
    
}

    public static void printChess(String chess[][]) {
        System.out.println("----------chess board -------------");
        for( int i=0; i < chess.length; i++){
            for( int j=0; j < chess.length; j++){
                System.out.print(chess[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String args[]){
        int n = 4;
        String chess[][] = new String[n][n];

        // initialize
        for( int i=0; i < n; i++){
            for( int j=0; j < n; j++){
                chess[i][j] = "X";
            }
        }
        nQueens(chess, 0);
        System.out.println("The total number of ways to print "+ n + " queens is " + count);
    }

}
