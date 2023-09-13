import java.util.Locale;
import java.util.Scanner;

import entities.Coord;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        Coord ponto = new Coord();

        System.out.println("Coordenada: ");
        System.out.print("X: ");
        float x = read.nextFloat();
        ponto.setX(x);

        System.out.print("Y: ");
        float y = read.nextFloat();
        ponto.setY(y);

        read.close();
        
        ponto.quadrante();
    }
}
