package backtrack;
public class nRainhas {

    public static int[][] NRainhas(int NRainhas){
        int tabuleiro[][] = new int[NRainhas][NRainhas];
        for (int i = 0; i<NRainhas; i++ ){
            for(int j = 0; j<NRainhas; j++){
                tabuleiro[i][j] = 0;
            }  
        }
        calculaNRainhas(tabuleiro,0, NRainhas );
        return tabuleiro;         
    }

    

static void printNRainhas(int board[][], int N)
    {
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
        System.out.println();
    }
    

    // function to check whether the position is safe or not 
    static boolean ehSeguro(int[][] board, int row, int col) {
        int i, j;

        // Verifica na linha à esquerda
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Verifica na diagonal superior à esquerda
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Verifica na diagonal inferior à esquerda
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // The function that solves the problem using backtracking 
    public static boolean calculaNRainhas(int board[][], int col, int NRainhas)
    {
        if (col == NRainhas){
            printNRainhas(board,NRainhas);
            return true;
        }
            

        for (int i = 0; i < NRainhas; i++) {
            //if it is safe to place the queen at position i,col -> place it
            if (ehSeguro(board, i, col)) {
                board[i][col] = 1;
                calculaNRainhas(board, col +1 , NRainhas);
                //backtrack if the above condition is false
                board[i][col] = 0;
            }
        }
        return false;
    }

}