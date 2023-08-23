import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Insira o raio da circunferência: ");
        double raio = read.nextDouble();

        read.close();

        System.out.printf("Circunferência: %.2f%n", Calculadora.circunferencia(raio));
        System.out.printf("Volume: %.2f%n", Calculadora.volume(raio));
        System.out.printf("Valor de PI: %.5f%n", Calculadora.PI);
    }
}
