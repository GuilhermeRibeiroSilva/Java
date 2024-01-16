package TrabalhoSistemaDeControleDeEstoque;

import java.util.Scanner;

public class RoupaPMG implements Item {
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;


    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
                    int estoqueMaximo) {
        super();
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public void venda() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho (P, M , G: " + descricao);
        String tamanho = scan.nextLine();
        System.out.println("digite a quantidade:");
        int quantidade = scan.nextInt();

        switch (tamanho) {
            case "P":
                if (quantidadeP > 0 && quantidadeP >= quantidade) {
                    quantidadeP -= quantidade;
                    System.out.println("Item vendido , agora p possui " + quantidadeP);
                }else{
                    System.out.println("estoque insuficiente");
                }
                break;
            case "M":
                if (quantidadeM > 0 && quantidadeM >= quantidade) {
                    quantidadeM -= quantidade;
                    System.out.println("Item vendido");
                }else{
                    System.out.println("estoque insuficiente");
                }
                break;
            case "G":
                if (quantidadeG > 0 && quantidadeG >= quantidade) {
                    quantidadeG -= quantidade;
                    System.out.println("Item vendido");
                }else{
                    System.out.println("estoque insuficiente");
                }
                break;
            default:
                System.out.println("opcao invalida");

        }
    }

    @Override
    public void reposicaoDoEstoque() {
        if (quantidadeP < estoqueMinimo) {
            System.out.println("reposicao feita");
            quantidadeP = estoqueMinimo;

        }
        if (quantidadeM < estoqueMinimo) {
            System.out.println("reposicao feita");
            quantidadeM = estoqueMinimo;
        }
        if (quantidadeG < estoqueMinimo) {
            System.out.println("reposicao feita");
            quantidadeG = estoqueMinimo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }


}
