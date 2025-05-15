package backtrack;
public class nRainhas {

    public static int[][] NRainhas(int NRainhas){

        for (int i = 0; i<NRainhas; i++ ){
            for(int j = 0; j<NRainhas; j++){
                tabuleiro[i][j] = 0;
            }  
        }
        calculaNRainhas(tabuleiro,0, NRainhas );
        return tabuleiro;         
    }

    public static int tabuleiro[][];


    

    // function to check whether the position is safe or not 
    static boolean ehSeguro(int [][]board, int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

       
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
            
        for (i = row, j = col; j >= 0 && i < row; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // The function that solves the problem using backtracking 
    public static boolean calculaNRainhas(int board[][], int col, int NRainhas)
    {
        if (col >= NRainhas)
            return true;

        for (int i = 0; i < NRainhas; i++) {
            //if it is safe to place the queen at position i,col -> place it
            if (ehSeguro(board, i, col)) {
                board[i][col] = 1;

                if (calculaNRainhas(board, col +1 , NRainhas))
                    return true;

                //backtrack if the above condition is false
                board[i][col] = 0;
            }
        }
        return false;
    }

}