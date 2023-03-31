package exercicio2;

public class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private Carrinho carrinho;

    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        carrinho = new Carrinho(10);
    }

    public void adicionarProdutoAoCarrinho(Carrinho carrinho, Produto produto,int quantidade) {

        carrinho.adicionarProduto(produto, quantidade);
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }


    public void adicionarProdutoAoCarrinho(String nomeProduto, Produto[] listaProdutos) {
        carrinho.adicionarProduto(nomeProduto, listaProdutos);
    }

    public void imprimirProdutosNoCarrinho() {
        carrinho.imprimirProdutos();
    }
}
