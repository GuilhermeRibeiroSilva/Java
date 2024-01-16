package TrabalhoSistemaDeControleDeEstoque;

public class TamanhoUnico extends Peca implements Item{

    public TamanhoUnico(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
        super(descricao, quantidade, estoqueMaximo, estoqueMinimo);

    }
    @Override
    public void venda() {
        quantidade--;
        System.out.println("venda feita");

    }

    @Override
    public void reposicaoDoEstoque() {
        if (quantidade < estoqueMinimo) {
            System.out.println("reposicao feita");
            quantidade = estoqueMinimo;

        }
    }


}
