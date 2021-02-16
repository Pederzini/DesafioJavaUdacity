public class ItensVenda {
    private Double preco;
    private String nome;

    public ItensVenda(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
