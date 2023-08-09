import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

            // int x;
            // String s1, s2, s3;

            // x = sc.nextInt();
            // sc.nextLine();
            // // RECEBE A QUEBRA DE LINHA DO nextInt()
            // s1 = sc.nextLine();
            // s2 = sc.nextLine();
            // s3 = sc.nextLine();
            
            // System.out.println("DADOS DIGITADOS: ");
            // System.out.println(x);
            // System.out.println(s1);
            // System.out.println(s2);
            // System.out.println(s3);

            double price = sc.nextDouble();
            double discount = 0;

            if (price > 100.0) {
                discount = price * 0.1;
            }

            System.out.println(discount);

        sc.close();
        
    }
}