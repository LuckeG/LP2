public abstract class Produto {
    public abstract double calcularDesconto();

    String nome;
    double preco;
    int estoque;

    Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

    }
}
