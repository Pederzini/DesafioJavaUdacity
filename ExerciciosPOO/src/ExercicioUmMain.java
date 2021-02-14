import java.util.Scanner;

public class ExercicioUmMain {
    public static void main(String[] args) {
        Autor autor1 = new Autor("H. P. Lovecraft", "lovecraft@gmail.com", 'm');
        Autor autor2 = new Autor("Edgar Allan Poe", "allanpoe@gmail.com", 'm');
        Autor autor3 = new Autor("Arthur C. Clarke", "arthurclarke@gmail.com", 'm');
        Scanner scannerTexto = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        Integer escolha;
        Integer escolha2;
        String email;

        // Todas as informações sobre cada autor:
        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);
        System.out.println("----------------------\n");

        // Mudar email de cada autor:
        System.out.println("Quer mudar o email de algum autor? Digite o número correspondente à resposta:");
        System.out.println("1) Sim");
        System.out.println("2) Não");
        escolha = scannerNum.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("De qual autor quer mudar? Digite o número correspondente à resposta:");
                System.out.println("1) " + autor1.getNome());
                System.out.println("2) " + autor2.getNome());
                System.out.println("3) " + autor3.getNome());
                escolha2 = scannerNum.nextInt();

                switch (escolha2) {
                    case 1:
                        System.out.println("O email atual do autor " + autor1.getNome() + " é: " + autor1.getEmail() + ".");
                        System.out.println("Informe o novo email do autor " + autor1.getNome() + ":");
                        email = scannerTexto.nextLine();
                        autor1.setEmail(email);
                        System.out.println("O novo email do autor " + autor1.getNome() + " é: " + autor1.getEmail() + ".");
                        break;
                    case 2:
                        System.out.println("O email atual do autor " + autor2.getNome() + " é: " + autor2.getEmail() + ".");
                        System.out.println("Informe o novo email do autor " + autor2.getNome() + ":");
                        email = scannerTexto.nextLine();
                        autor1.setEmail(email);
                        System.out.println("O novo email do autor " + autor2.getNome() + " é: " + autor2.getEmail() + ".");
                        break;
                    case 3:
                        System.out.println("O email atual do autor " + autor3.getNome() + " é: " + autor3.getEmail() + ".");
                        System.out.println("Informe o novo email do autor " + autor3.getNome() + ":");
                        email = scannerTexto.nextLine();
                        autor1.setEmail(email);
                        System.out.println("O novo email do autor " + autor3.getNome() + " é: " + autor3.getEmail() + ".");
                        break;
                }
                break;
            case 2:
                System.out.println("Deixe como está então!");
                break;
        }
    }
}
