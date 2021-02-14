import java.util.Scanner;

public class ExercicioDoisMain {
    public static void main(String[] args) {
        // Instanciamento de classes
        Autor autor1 = new Autor("H. P. Lovecraft", "lovecraft@gmail.com", 'm');
        Autor autor2 = new Autor("Edgar Allan Poe", "allanpoe@gmail.com", 'm');
        Autor autor3 = new Autor("Arthur C. Clarke", "arthurclarke@gmail.com", 'm');
        Livro livro1 = new Livro("Nas Montanhas da Loucura", autor1, 31.99);
        Livro livro2 = new Livro("O Retrato Oval", autor2, 20.99);
        Livro livro3 = new Livro("O Fim da Infância", autor3, 30.00);

        // Declaração de variáveis
        Scanner scannerNum = new Scanner(System.in);
        Double novoPreco;
        Integer escolha;
        Integer novaQtd;


        // Todas as informações sobre cada livro:
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println("----------------------\n");

        // Mudar preço ou quantidade de cada livro:
        System.out.println("Quer mudar o preço ou qtd de algum livro? Digite o número correspondente à resposta:");
        System.out.println("1) Sim, quero mudar o preço.");
        System.out.println("2) Sim, quero mudar a qtd.");
        System.out.println("3) Não quero mudar nada");
        escolha = scannerNum.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("De qual livro quer mudar o preço? Digite o número correspondente à resposta:");
                System.out.println("1) " + livro1.getNome() + ", cujo preço unitário é R$" + livro1.getPreco());
                System.out.println("2) " + livro2.getNome() + ", cujo preço unitário é R$" + livro2.getPreco());
                System.out.println("3) " + livro3.getNome() + ", cujo preço unitário é R$" + livro3.getPreco());
                escolha = scannerNum.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Preço atual: R$" + livro1.getPreco());
                        System.out.println("Informe o novo preço:");
                        novoPreco = scannerNum.nextDouble();
                        livro1.setPreco(novoPreco);
                        System.out.println(livro1.getNome() + " agora custa R$" + livro1.getPreco());
                        break;
                    case 2:
                        System.out.println("Preço atual: R$" + livro2.getPreco());
                        System.out.println("Informe o novo preço:");
                        novoPreco = scannerNum.nextDouble();
                        livro2.setPreco(novoPreco);
                        System.out.println(livro2.getNome() + " agora custa R$" + livro2.getPreco());
                        break;
                    case 3:
                        System.out.println("Preço atual: R$" + livro3.getPreco());
                        System.out.println("Informe o novo preço:");
                        novoPreco = scannerNum.nextDouble();
                        livro3.setPreco(novoPreco);
                        System.out.println(livro3.getNome() + " agora custa R$" + livro3.getPreco());
                        break;
                }
            case 2:
                System.out.println("De qual livro quer mudar a qtd? Digite o número correspondente à resposta:");
                System.out.println("1) " + livro1.getNome() + ", que possuímos " + livro1.getQtd() + " unidades");
                System.out.println("2) " + livro2.getNome() + ", que possuímos " + livro2.getQtd() + " unidades");
                System.out.println("3) " + livro3.getNome() + ", que possuímos " + livro3.getQtd() + " unidades");
                escolha = scannerNum.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Qtd atual: " + livro1.getQtd());
                        System.out.println("Informe a nova qtd:");
                        novaQtd = scannerNum.nextInt();
                        livro1.setQtd(novaQtd);
                        System.out.println(livro1.getNome() + " agora tem " + livro1.getQtd() + " unidades");
                        break;
                    case 2:
                        System.out.println("Qtd atual: " + livro2.getQtd());
                        System.out.println("Informe a nova qtd:");
                        novaQtd = scannerNum.nextInt();
                        livro2.setQtd(novaQtd);
                        System.out.println(livro2.getNome() + " agora tem " + livro2.getQtd() + " unidades");
                        break;
                    case 3:
                        System.out.println("Qtd atual: " + livro3.getQtd());
                        System.out.println("Informe a nova qtd:");
                        novaQtd = scannerNum.nextInt();
                        livro3.setQtd(novaQtd);
                        System.out.println(livro3.getNome() + " agora tem " + livro3.getQtd() + " unidades");
                        break;
                }
            case 3:
                System.out.println("Deixe como está então!");
        }
    }
}
