package exercicio1;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 30, "123.456.789-00");
        Conta conta1 = new Conta(1, 1000.0, cliente1);

        Cliente cliente2 = new Cliente("Maria", 25, "987.654.321-00");
        Conta conta2 = new Conta(2, 500.0, cliente2);

        System.out.println("Dados da conta 1:");
        conta1.imprimirDados();

        System.out.println("\nDados da conta 2:");
        conta2.imprimirDados();

        conta1.transferir(500.0, conta2);

        System.out.println("\nDados atualizados da conta 1:");
        conta1.imprimirDados();

        System.out.println("\nDados atualizados da conta 2:");
        conta2.imprimirDados();
    }
}
