package TrabalhoSistemaDeControleDeEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RoupaPMG camisa = new RoupaPMG("camisa", 5, 5, 5, 2, 10);
        Acessorio cinto = new Acessorio("relogio", 6, 10, 3);
        TamanhoUnico saia = new TamanhoUnico("saia", 6, 12, 4);
        Acessorio pulseira = new Acessorio("pulseira",3,10,1);
        RoupaPMG saidadePraia = new RoupaPMG("saida de praia", 5, 5, 5, 2, 10);


        List<Item> vetor = new ArrayList<>();

        vetor.add(camisa);
        vetor.add(saia);
        vetor.add(cinto);
        vetor.add(pulseira);
        vetor.add(saidadePraia);

        int opcao;
        do {
            System.out.println("menu\n0-camisa\n1-saia \n2-cinto\n3-Pulseira\n4-Saida de praia\n5-Sair");
            System.out.println("escolha uma opcao de compra:");
            opcao = Integer.parseInt(scan.nextLine());
            try {
                Item item = vetor.get(opcao);
                item.venda();
                item.reposicaoDoEstoque();
            }catch (Exception E){
                
            }

        } while (opcao != 5);

    }

}
