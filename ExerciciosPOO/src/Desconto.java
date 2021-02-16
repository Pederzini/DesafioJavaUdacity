public class Desconto {
    Double premiumServico = 0.2;
    Double goldServico = 0.15;
    Double silverServico = 0.1;
    Double comumServico = 0.0;
    Double descontoProduto = 0.1;

    public Double getPremiumServico() {
        return premiumServico;
    }

    public Double getGoldServico() {
        return goldServico;
    }

    public Double getSilverServico() {
        return silverServico;
    }

    public Double getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(Double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    public Double getComumServico() {
        return comumServico;
    }
}
