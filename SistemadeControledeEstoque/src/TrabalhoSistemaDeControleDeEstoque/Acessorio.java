package TrabalhoSistemaDeControleDeEstoque;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {


    public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);

    }


    @Override
    public void venda() {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a quantidade:");
        int qtdVendas = scan.nextInt();
        if (quantidade > 0 && quantidade >= qtdVendas) {
            quantidade -= qtdVendas;
            System.out.println("Item vendido , agora possui " + quantidade);
        } else {
            System.out.println("estoque insuficiente");
        }

    }

    @Override
    public void reposicaoDoEstoque() {
        if (quantidade < estoqueMinimo) {
            System.out.println("reposicao feita");
            quantidade = estoqueMinimo;

        }
    }


}
