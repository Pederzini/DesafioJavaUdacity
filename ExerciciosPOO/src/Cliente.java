public class Cliente {
    Desconto desconto = new Desconto();
    String nome;
    String assinatura;
    Double descontoServico;
    Double descontoProduto = desconto.getDescontoProduto();

    public Cliente(String nome, String assinatura) {
        this.nome = nome;
        this.assinatura = assinatura;
        if (this.assinatura.equalsIgnoreCase("Premium")) {
            descontoServico = desconto.getPremiumServico();
        } else if (this.assinatura.equalsIgnoreCase("Gold")) {
            descontoServico = desconto.getGoldServico();
        } else if (this.assinatura.equalsIgnoreCase("Silver")) {
            descontoServico = desconto.getSilverServico();
        } else {
            this.assinatura = "comum";
            descontoServico = desconto.getComumServico();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public Double getDescontoServico() {
        return descontoServico;
    }

    public Double getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(Double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    @Override
    public String toString() {
        return "Informações do Cliente: " +
                "[Nome: " + getNome() +
                ", Tipo de Assinatura: " + getAssinatura() +
                ", Desconto em Serviço: " + getDescontoServico() +
                ", Desconto em Produto: " + getDescontoProduto() + "]";
    }
}
