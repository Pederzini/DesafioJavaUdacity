import java.util.List;

public class Livro {

    private String nome;
    private Autor autor;
    private Double preco;
    private Integer qtd;

    public Livro(String nome, Autor autor, Double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String nome, Autor autor, Double preco, Integer qtd) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Informações do Livro:\n" +
                "Título: " + nome + "\n" +
                autor.toString() + "\n" +
                "Preço: R$" + preco + "\n" +
                "Qtd: " + qtd + "\n";
    }
}
