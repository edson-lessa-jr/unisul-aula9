package exercicio2;

public class Carrinho {
    private Produto[] produtos;

    public Carrinho(int quantidade) {
        produtos = new Produto[quantidade];
    }

    public void adicionarProduto(Produto produto) {
        if (produto.getQuantidadeEmEstoque() > 0) {
            int posicao = retornarIndiceVazio();
            produtos[posicao]= produto;
            produto.diminuirEstoque();
        } else {
            System.out.println("Produto indisponível no estoque!");
        }
    }
    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEmEstoque() > 0) {
            int posicao = retornarIndiceVazio();
            produtos[posicao]= produto;
            produto.diminuirEstoque(quantidade);
        } else {
            System.out.println("Produto indisponível no estoque!");
        }
    }

    private int retornarIndiceVazio(){
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i]==null){
               return i;
            }
        }
        return this.produtos.length-1;
    }

    public void adicionarProduto(String nomeProduto, Produto[] listaProdutos) {
        boolean encontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(nomeProduto)) {
                encontrado = true;
                adicionarProduto(produto);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado no estoque!");
        }
    }

    public void imprimirProdutos() {
        if (produtos.length > 0) {
            System.out.println("Produtos no carrinho:");
            for (Produto produto : produtos) {
                if (produto!=null) {
                    produto.imprimirDados();
                }
            }
        } else {
            System.out.println("Nenhum produto no carrinho!");
        }
    }
}
