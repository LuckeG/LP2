import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Notebook("Acer", 3000, 4));
        produtos.add(new Smartphone("Positivo", 4000, 5));
        produtos.add(new Notebook("AlienWare", 9000, 2));
        produtos.add(new Smartphone("HP", 1000, 10));


    }
}
