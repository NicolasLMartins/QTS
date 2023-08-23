import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        double[] vetor = new double[n];

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            vetor[i] = read.nextDouble();
            soma += vetor[i];
        }

        read.close();

        System.out.printf("Altura média = %.2f", (soma / n));
    }
}
