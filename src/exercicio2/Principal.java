package exercicio2;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1500.0, 5);
        Produto produto2 = new Produto("Notebook", 3000.0, 3);
        Produto produto3 = new Produto("Tablet", 800.0, 10);

        Cliente cliente1 = new Cliente("João", 30, "Rua A, 123");

        Carrinho carrinho = new Carrinho(2);
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3, 2);

        cliente1.adicionarProdutoAoCarrinho(carrinho, produto3, 3);

        carrinho.imprimirProdutos();
    }
}
