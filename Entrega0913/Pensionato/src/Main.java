import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        Hospede[] vetor = new Hospede[10];
        
        System.out.print("Quantos quartos serão alugados? ");
        int n = read.nextInt();

        while (n < 1 || n > 10) {
            System.out.print("Valor inválido! Tente novamente.");

            System.out.print("\nQuantos quartos serão alugados? ");
            n = read.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nAluguel #%d: \n", i + 1);
            System.out.print("Nome: ");
            read.nextLine();
            String nome = read.nextLine();
            System.out.print("Email: ");
            String email = read.nextLine();
            System.out.print("Quarto: ");
            int quarto = read.nextInt();
            
            vetor[quarto - 1] = new Hospede(nome, email);
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.printf("%d: %s\n", i + 1, vetor[i]);
            }
        }

        read.close();
    }
}
