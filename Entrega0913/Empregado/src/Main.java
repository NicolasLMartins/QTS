import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        List<Empregado> empregados = new ArrayList<>();

        System.out.print("Quantos empregados serão registrados? ");
        int n = read.nextInt();

        Id:
        for (int i = 0; i < n; i++) {
            System.out.printf("\nFuncionário #%d: ", i + 1);
            
            System.out.print("\nId: ");
            int id = read.nextInt();

            for (Empregado emp : empregados) {
                if (emp.getId() == id) {
                    System.out.println("ID já existe, tente novamente: ");
                    i--;
                    continue Id;
                }
            }
            
            System.out.print("Nome: ");
            read.nextLine();
            String nome = read.nextLine();
            
            System.out.print("Salário: ");
            double salario = read.nextDouble();
            
            empregados.add(new Empregado(id, nome, salario));
        }

        System.out.println("\nLista de empregados: ");
        Empregado.listar(empregados);

        boolean found = false;

        do {
            System.out.print("\nDigite o ID do funcionário que terá um aumento no salário: ");
            int id = read.nextInt();

            for (Empregado emp : empregados) {
                if (emp.getId() == id) {
                    System.out.print("Digite a porcentagem de aumento: ");
                    double porcentagem = read.nextDouble();
                    emp.aumentarSalario(porcentagem);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Id não encontrado, tente novamente: ");
            }
        } while (!found);

        System.out.println("\nLista de empregados atualizada: ");
        Empregado.listar(empregados);
        
        read.close();
    }
}
