import java.util.Locale;
import java.util.Scanner;

import entities.Peca;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        Peca[] pecas = new Peca[2];
        float precoTotal = 0f;

        for (int i = 0; i < pecas.length; i++) {
            pecas[i] = new Peca();
            
            System.out.printf("Código da %da peça: ", i + 1);
            pecas[i].setCodigo(read.nextInt());

            System.out.printf("Quantidade da %da peça: ", i + 1);
            pecas[i].setQuant(read.nextInt());

            System.out.printf("Preço da %da peça: ", i + 1);
            pecas[i].setPreco(read.nextFloat());
        }
        
        read.close();

        for (Peca peca : pecas) {
            precoTotal += peca.precoTotal();
        }
        
        System.out.printf("VALOR TOTAL À PAGAR: R$ %.2f", precoTotal);
    }
}
