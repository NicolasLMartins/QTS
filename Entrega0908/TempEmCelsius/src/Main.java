import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        char resp;
        
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = read.nextDouble();

            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Desena repetir (s/n)? ");
            resp = read.next().charAt(0);
        } while (resp != 'n');
        
        read.close();
    }
}
