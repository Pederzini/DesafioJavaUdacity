public class Esfera implements Movimento{
    // Atributos:
    Integer distanciaCima;
    Integer distanciaBaixo;
    Integer distanciaEsquerda;
    Integer distanciaDireita;

    // Construtor:
    public Esfera() {
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
        System.out.println("A Esfera pula para cima, 1m a cada vez");
        setDistanciaCima(getDistanciaCima() + 1);
        System.out.println("No total, a Esfera pulou " + getDistanciaCima() + "m para cima");
    }

    @Override
    public void baixo() {
        System.out.println("A Esfera cai, 4m a cada vez");
        setDistanciaBaixo(getDistanciaBaixo() + 4);
        System.out.println("No total, a Esfera caiu " + getDistanciaBaixo() + "m");
    }

    @Override
    public void esquerda() {
        System.out.println("A Esfera rola para a esquerda, 3m a cada vez");
        setDistanciaEsquerda(getDistanciaEsquerda() + 3);
        System.out.println("No total, a Esfera rolou " + getDistanciaEsquerda() + "m para a esquerda");
    }

    @Override
    public void direita() {
        System.out.println("A Esfera rola para a direita, 2m a cada vez");
        setDistanciaDireita(getDistanciaDireita() + 2);
        System.out.println("No total, a Esfera rolou " + getDistanciaDireita() + "m para a direita");
    }

    @Override
    public void total() {
        System.out.println("Movimentação final da Esfera: \n" +
                "Cima: " + getDistanciaCima() + "m\n" +
                "Baixo: " + getDistanciaBaixo() + "m\n" +
                "Esquerda: " + getDistanciaEsquerda() + "m\n" +
                "Direita: " + getDistanciaDireita() + "m\n");
    }
}
