package exercicio1;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void imprimirDados() {
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular:");
        titular.imprimirDados();
    }
}
