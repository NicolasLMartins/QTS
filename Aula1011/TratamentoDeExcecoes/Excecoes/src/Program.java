import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        
        try {
            String[] vect = read.nextLine().split(" ");
            int position = read.nextInt();
            System.out.println(vect[position]);
        } catch (InputMismatchException e) {
            System.out.println("Input position!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input position!");
        }

        read.close();
    }
}
