public class Triangulo implements Movimento {
    // Atributos:
    Integer distanciaCima;
    Integer distanciaBaixo;
    Integer distanciaEsquerda;
    Integer distanciaDireita;

    // Construtor:
    public Triangulo() {
        distanciaCima = 0;
        distanciaBaixo = 0;
        distanciaEsquerda = 0;
        distanciaDireita = 0;
    }

    // Métodos especiais:
    public Integer getDistanciaCima() {
        return distanciaCima;
    }

    public void setDistanciaCima(Integer distanciaCima) {
        this.distanciaCima = distanciaCima;
    }

    public Integer getDistanciaBaixo() {
        return distanciaBaixo;
    }

    public void setDistanciaBaixo(Integer distanciaBaixo) {
        this.distanciaBaixo = distanciaBaixo;
    }

    public Integer getDistanciaEsquerda() {
        return distanciaEsquerda;
    }

    public void setDistanciaEsquerda(Integer distanciaEsquerda) {
        this.distanciaEsquerda = distanciaEsquerda;
    }

    public Integer getDistanciaDireita() {
        return distanciaDireita;
    }

    public void setDistanciaDireita(Integer distanciaDireita) {
        this.distanciaDireita = distanciaDireita;
    }

    // Métodos abstratos
    @Override
    public void cima() {
        System.out.println("O Triângulo flutua para cima, 5m a cada vez");
        setDistanciaCima(getDistanciaCima() + 5);
        System.out.println("No total, o Triângulo flutuou " + getDistanciaCima() + "m para cima");
    }

    @Override
    public void baixo() {
        System.out.println("O Triângulo flutua para baixo, 3m a cada vez");
        setDistanciaBaixo(getDistanciaBaixo() + 3);
        System.out.println("No total, o Triângulo flutuou " + getDistanciaBaixo() + "m para baixo");
    }

    @Override
    public void esquerda() {
        System.out.println("O Triângulo arrasta para a esquerda, 7m a cada vez");
        setDistanciaEsquerda(getDistanciaEsquerda() + 7);
        System.out.println("No total, o Triângulo arrastou " + getDistanciaEsquerda() + "m para a esquerda");
    }

    @Override
    public void direita() {
        System.out.println("O Triângulo arrasta para a direita, 10m a cada vez");
        setDistanciaDireita(getDistanciaDireita() + 10);
        System.out.println("No total, o Triângulo arrastou " + getDistanciaDireita() + "m para a direita");
    }

    @Override
    public void total() {
        System.out.println("Movimentação final do Triângulo: \n" +
                "Cima: " + getDistanciaCima() + "m\n" +
                "Baixo: " + getDistanciaBaixo() + "m\n" +
                "Esquerda: " + getDistanciaEsquerda() + "m\n" +
                "Direita: " + getDistanciaDireita() + "m\n");
    }
}
