public class Pedido {

    private int numero;
    private String cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(int numero, String cliente, Produto produto, int quantidade){
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public void realizarPedido(){
        if(produto.getQuantidadeEstoque() >= quantidade){
            produto.removerEstoque(quantidade);
            double valorTotal = produto.getPreco() * quantidade;
            System.out.println("Numero do pedido: " + numero);
            System.out.println("Cliente : " + cliente);
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + quantidade );
            System.out.println("Valor: " + valorTotal);
            System.out.println("Pedido realizado com sucesso!");
        } else {
            System.out.println("Nao ha quantidade em estoque suficiente.");
        }
    }
}
