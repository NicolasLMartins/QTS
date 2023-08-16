import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        
        System.out.println("Insira as medidas do triângulo X: ");
        x.a = read.nextDouble();
        x.b = read.nextDouble();
        x.c = read.nextDouble();
        
        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = read.nextDouble();
        y.b = read.nextDouble();
        y.c = read.nextDouble();

        read.close();

        System.out.printf("Área do triângulo X: %.4f%n", x.area());
        System.out.printf("Área do triângulo Y: %.4f%n", y.area());

        if (x.area() > y.area()) {
            System.out.printf("Maior área: X");
        } else {
            System.out.printf("Maior área: Y");
        }
    }
}
