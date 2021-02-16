public class Produto extends ItensVenda {
    private Integer qtd;
    private String validade;

    public Produto(Double preco, String nome, Integer qtd, String validade) {
        super(preco, nome);
        this.qtd = qtd;
        this.validade = validade;
    }

    public Integer getQtd() {
        return qtd;
    }

    public String getValidade() {
        return validade;
    }

//    @Override
//    public String toString() {
//        return super.getNome() + "\n" +
//                ", Preço: R$" + super.getPreco() +
//                ", Qtd: " + getQtd() +
//                ", Validade: " + getValidade() +
//                " Total produto: " + (getQtd()*getPreco());
//    }

    @Override
    public String toString() {
        return super.getNome() + "\n" +
                getQtd() + " Un    X    " + super.getPreco() + "         Total produto: " + (getQtd() * getPreco()) + "\n";
    }
}
