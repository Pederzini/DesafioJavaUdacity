public class Autor {
    private final String nome;
    private String email;
    private final Character genero;

    public Autor(String nome, String email, Character genero) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Character getGenero() {
        return genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Informações do autor: [Nome: " + getNome() + ", Email: " + getEmail() + ", Gênero: " + getGenero() + "]";
    }
}
