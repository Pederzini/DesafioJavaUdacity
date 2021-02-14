import java.util.Scanner;

public class ExercicioTresMain {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Esfera esfera = new Esfera();
        Scanner scanner = new Scanner(System.in);
        Integer escolha;
        Boolean movimentar;

        System.out.println("Qual objeto você deseja mover? Digite o número correspondente à resposta:");
        System.out.println("1) Esfera");
        System.out.println("2) Triângulo");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                movimentar = true;
                while (movimentar) {
                    System.out.println("Escolha para qual direção quer mover a Esfera:");
                    System.out.println("1) Cima");
                    System.out.println("2) Baixo");
                    System.out.println("3) Esquerda");
                    System.out.println("4) Direita");
                    System.out.println("0) Não quero mais mover");
                    escolha = scanner.nextInt();
                    switch (escolha) {
                        case 1:
                            esfera.cima();
                            break;
                        case 2:
                            esfera.baixo();
                            break;
                        case 3:
                            esfera.esquerda();
                            break;
                        case 4:
                            esfera.direita();
                            break;
                        case 0:
                            esfera.total();
                            movimentar = false;
                            break;
                    }
                }
                break;
                
            case 2:
                movimentar = true;
                while (movimentar) {
                    System.out.println("Escolha para qual direção quer mover o Triângulo:");
                    System.out.println("1) Cima");
                    System.out.println("2) Baixo");
                    System.out.println("3) Esquerda");
                    System.out.println("4) Direita");
                    System.out.println("0) Não quero mais mover");
                    escolha = scanner.nextInt();
                    switch (escolha) {
                        case 1:
                            triangulo.cima();
                            break;
                        case 2:
                            triangulo.baixo();
                            break;
                        case 3:
                            triangulo.esquerda();
                            break;
                        case 4:
                            triangulo.direita();
                            break;
                        case 0:
                            triangulo.total();
                            movimentar = false;
                            break;
                    }
                }
                break;
        }
    }
}
