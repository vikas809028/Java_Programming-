public class SudokuSolver {

    public static void sudokuSolver(int sudoku[][], int row, int col){
        
        if(row==sudoku.length-1 && col == sudoku.length-1){
            printSolution(sudoku);
            
        }
        int newrow = row;
        int newcol = col+1;
        if(col==sudoku.length-1){
            newrow = row+1;
            newcol = 0;
        }
        // if(sudoku[row][col]!=0){
        //     sudokuSolver(sudoku,newrow,newcol);
        // }/
        if(sudoku[row][col]==0){
        
            for(int digit=1; digit<=9;digit++){
            if(isValid(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                sudokuSolver(sudoku,newrow,newcol);
                sudoku[row][col]=0;

            }

        }
    }

    }
    public static boolean isValid(int sudoku[][], int x, int y, int digit){
        // calculating row
        for(int i=0; i<9;i++){
            if(sudoku[x][i]==digit){
                return false;
            }
        }
        // calculating column
        for(int i=0; i<9;i++){
            if(sudoku[i][y]==digit){
                return false;
            }
        }
        
        //calculating grid
        int sr = (x/3)*3;
        int sc = (y/3)*3;

        for( int i=sr; i<sr+3; i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
        

    public static void printSolution(int sol[][]) {
        System.out.println("------------------The Sudoku is-----------");
        for(int i =0; i < 9; i++){
            for(int j=0;j < 9;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,0,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        sudokuSolver(sudoku,0,0);
        
        
    }
}
