import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        System.out.print("Quantos empregados serão registrados? ");
        Empregado[] vetor = new Empregado[read.nextInt()];
        
        int id;
        for (int i = 0; i < vetor.length; i++) {
            id = read.nextInt();
            read.nextLine();
            String nome = read.nextLine();
            double salario = read.nextDouble();

            vetor[i] = new Empregado(id, nome, salario);
        }

        System.out.print("Digite o ID do funcionário que terá um aumento no salário: ");
        id = read.nextInt();
        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagem = read.nextDouble();

        vetor[id].aumentarSalario(porcentagem);

        for (Empregado empregado : vetor) {
            System.out.print(empregado);
        }
        
        read.close();
    }
}
