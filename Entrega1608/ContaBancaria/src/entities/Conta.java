package entities;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
    public void saque(double valor) {
        this.saldo -= valor + 5.00;
    }

    public String toString() {
        return String.format("Conta %d, Titular: %s, Saldo: R$ %.2f");
    }
}
