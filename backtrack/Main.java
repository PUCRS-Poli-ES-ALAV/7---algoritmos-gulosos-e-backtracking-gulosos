package backtrack;
import java.util.ArrayList;
import java.util.List;
import backtrack.nRainhas;

public class Main {
    public static ArrayList<Integer> calcularTroco(List<Integer> moedas, int valor) {
        
        ArrayList<Integer> resultado = new ArrayList<>();
        int cont = 0;
        
        for (int moeda : moedas) {
            while (valor >= moeda) {
                valor -= moeda;
                resultado.add(moeda);
                cont++;
            }
        }
        
        System.out.println("Cont --> " + cont);
        return resultado;
    }

   // print the final solution matrix 
    static void printNRainhas(int board[][], int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ArrayList<Integer> moedas = new ArrayList<>();
        // moedas.add(100);
        // moedas.add(25);
        // moedas.add(10);
        // moedas.add(5);
        // moedas.add(1);
        
        // // Cont --> 10
        // // Menor quantidade de moedas --> 10
        // // Moedas utilizadas --> [100, 100, 25, 25, 25, 10, 1, 1, 1, 1]
        // int valor = 289;
        
        // ArrayList<Integer> troco = calcularTroco(moedas, valor);
        // System.out.println("Menor quantidade de moedas --> " + troco.size());
        // System.out.println("Moedas utilizadas --> " + troco);

        final int NRainhas = 32;

         

        printNRainhas(nRainhas.NRainhas( NRainhas), NRainhas);

    }

}