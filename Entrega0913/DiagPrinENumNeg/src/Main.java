import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite a ordem da matriz: ");
        int ordem = read.nextInt();

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = read.nextInt();
            }

            System.out.println();
        }

        for (int i = 0; i < ordem; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }
    }
}
