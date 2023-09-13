package entities;

public class Empregado {

    private int id;
    private String nome;
    private double salario;

    

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario *= (1 + porcentagem);
    }

    public String toString() {
        return String.format("%d, %s, %f", this.id, this.nome, this.salario);
    }
}
