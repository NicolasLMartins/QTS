import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Insira 3 números: ");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        if (a > b && a > c) {
            System.out.printf("Maior: %d%n", a);
        } else if (b > c) {
            System.out.printf("Maior: %d%n", b);
        } else {
            System.out.printf("Maior: %d%n", c);
        }
        
        read.close();
    }
}
