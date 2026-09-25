public class TesteProdutos {
    public static void main(String[] args) {


        Produto produto = new Produto("teclado", 153, 4);
        Pedido pedido = new Pedido(1, "Henrique", produto, 2);

        System.out.println("Temos " + produto.getQuantidadeEstoque() + " em estoque.");
        produto.exibirInformacoes();

        produto.adicionarEstoque(2);

        produto.exibirInformacoes();

        produto.removerEstoque(3);

        produto.exibirInformacoes();

        pedido.realizarPedido();


    }
}
