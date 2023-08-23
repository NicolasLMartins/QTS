import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();
        Produto[] vetor = new Produto[n];

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            read.nextLine();
            vetor[i] = new Produto(read.nextLine(), read.nextDouble());
            soma += vetor[i].getPreco();
        }
        
        System.out.printf("Preço médio = %.2f", (soma / n));

        read.close();
    }
}
