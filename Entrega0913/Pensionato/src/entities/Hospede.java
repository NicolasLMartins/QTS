package entities;

public class Hospede {
    
    private String nome;
    private String email;
    
    public Hospede(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String toString() {
        return String.format("%s, %s ", this.nome, this.email);
    }
}