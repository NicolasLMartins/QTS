package entities;

import java.util.List;

public class Empregado {
    private int id;
    private String nome;
    private double salario;
    
    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario *= (1 + porcentagem / 100);
    }

    public static void listar(List<Empregado> lista) {
        for (Empregado emp : lista) {
            System.out.println(emp);
        }
    }

    public String toString() {
        return String.format("%d, %s, %.2f", this.id, this.nome, this.salario);
    }
}
