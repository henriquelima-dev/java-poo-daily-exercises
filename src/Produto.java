public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    void adicionarEstoque(int quantidade){
        if( quantidade > 0 ){
            quantidadeEstoque += quantidade;
            System.out.println("Temos " + quantidadeEstoque + " Produtos em estoque.");
        } else {
            System.out.println("Quantidade nao permitida");
        }
    }

    void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            System.out.println("Produto removido!");
        } else {
            System.out.println("Quantidade nao permitida.");
        }
    }

    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
}
