public class Servico extends ItensVenda {
    private final Double duracaoHoras;

    public Servico(Double preco, String nome, Double duracaoHoras) {
        super(preco, nome);
        this.duracaoHoras = duracaoHoras;
    }

    public Double getDuracaoHoras() {
        return duracaoHoras;
    }

//    @Override
//    public String toString() {
//        return "Informações do Serviço: [" +
//                "Nome: " + super.getNome() +
//                ", Preço: R$" + super.getPreco() +
//                ", Duração em Horas: " + getDuracaoHoras() + "]";
//    }

    @Override
    public String toString() {
        return super.getNome() + "\n" +
                "1 Un    X    " + super.getPreco() + " Duração: " + getDuracaoHoras() +
                "h          Total serviço: " + getPreco() + "\n";
    }
}
