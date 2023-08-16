import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Conta conta;
        
        System.out.print("Insira o número da conta: ");
        int numero = read.nextInt();

        System.out.print("Insira o nome do titular: ");
        String titular = read.nextLine();

        System.out.print("Deseja efetuar um depósito inicial (s/n)? ");
        char depInicial = read.next().charAt(0);

        if (depInicial == 's') {
            System.out.print("Insira o valor do depósito inicial: ");
            double saldoInicial = read.nextDouble();

            conta = new Conta(numero, titular, saldoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println("");

        read.close();
    }
}
