public class Smartphone extends Produto{
    Smartphone(String nome, double preco, int estoque){
        super(nome, preco, estoque);
    }
    public double calcularDesconto(){
        if(preco > 2000){
            preco = preco + ((preco*100) / preco);
        }
        return 0;
    }

}
