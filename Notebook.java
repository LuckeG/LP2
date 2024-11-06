public class Notebook extends Produto{
    Notebook(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    public double calcularDesconto(){
        if(preco > 3000){
            preco = preco + ((preco*100) / preco);
            System.out.println("Preço com desconto: "+preco);
        }
        return 0;
    }
}
