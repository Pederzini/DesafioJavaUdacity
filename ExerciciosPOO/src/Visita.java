import java.util.ArrayList;
import java.util.Scanner;

public class Visita {
    Scanner scannerTexto = new Scanner(System.in);
    Scanner scannerNum = new Scanner(System.in);

    Integer escolha;
    String produtoDesejado;
    String servicoDesejado;
    Double precoProduto;
    Double precoServico;
    Double duracaoServico;
    Integer qtd;
    String validade;
    Double totalServicos = 0.0;
    Double totalProdutos = 0.0;
    Boolean queroComprar = true;
    ArrayList<Produto> produtosAdquiridos = new ArrayList<>();
    ArrayList<Servico> servicosAdquiridos = new ArrayList<>();

    Cliente cliente = new Cliente("Mimzy", "Premium");

    // Métodos:
    public void visitar() {
        while (queroComprar) {
            System.out.println("Olá! Seja bem vindo ao Salão Embelezar.");
            System.out.println("O que você deseja adquirir? Digite o número correspondente à resposta:");
            System.out.println("1) Produto");
            System.out.println("2) Serviço");
            System.out.println("3) Quero fechar a conta");
            escolha = scannerNum.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do produto que deseja adquirir:");
                    produtoDesejado = scannerTexto.nextLine();
                    System.out.println("Digite o preço de " + produtoDesejado + ":");
                    precoProduto = scannerNum.nextDouble();
                    System.out.println("Digite a quantidade de " + produtoDesejado + " que deseja comprar:");
                    qtd = scannerNum.nextInt();
                    System.out.println("Digite a validade de " + produtoDesejado + ":");
                    validade = scannerTexto.nextLine();
                    Produto produto = new Produto(precoProduto, produtoDesejado, qtd, validade);
                    produtosAdquiridos.add(produto);
                    totalProdutos += (precoProduto * qtd);
                    break;
                case 2:
                    System.out.println("Digite o nome do serviço que deseja adquirir:");
                    servicoDesejado = scannerTexto.nextLine();
                    System.out.println("Digite o preço de " + servicoDesejado + ":");
                    precoServico = scannerNum.nextDouble();
                    System.out.println("Digite a duração em horas de " + servicoDesejado + ":");
                    duracaoServico = scannerNum.nextDouble();
                    Servico servico = new Servico(precoServico, servicoDesejado, duracaoServico);
                    servicosAdquiridos.add(servico);
                    totalServicos += precoServico;
                    break;
                case 3:
                    System.out.println("Obrigado por comprar conosco, " + cliente.getNome() + "!");
                    System.out.println("Os produtos que adquiriu foram:");
                    System.out.println("-------------------------------------");
                    for (Produto p : produtosAdquiridos) {
                        System.out.println(p);
                    }
                    System.out.println("Você gastou R$" + getTotalProdutos() + " em produtos\n");
                    System.out.println("Todos os clientes têm desconto de " + cliente.getDescontoProduto() * 100 +
                            "% em produtos");
                    System.out.println("-------------------------------------\n");
                    System.out.println("Os serviços que adquiriu foram:");
                    System.out.println("-------------------------------------");
                    for (Servico s : servicosAdquiridos) {
                        System.out.println(s);
                    }
                    System.out.println("Você gastou R$" + getTotalServicos() + " em serviços\n");
                    System.out.println(cliente.getNome() + " tem desconto de " +
                            (cliente.getDescontoServico() * 100) + "% em serviços por ser " +
                            cliente.getAssinatura());
                    System.out.println("-------------------------------------");
                    System.out.println("No total, aplicando o desconto de " + cliente.getAssinatura() + " para os serviços " +
                            "e de " + cliente.getDescontoProduto() * 100 + "% para produtos, sua conta foi de: R$" +
                            ((getTotalServicos() * (1 - cliente.getDescontoServico())) +
                                    (getTotalProdutos() * (1 - cliente.getDescontoProduto()))) + ".\nVocê economizou R$" +
                            ((getTotalServicos() * cliente.getDescontoServico()) + (getTotalProdutos() * cliente.descontoProduto)));
                    queroComprar = false;
                    break;
            }
        }
    }

    public Double getTotalServicos() {
        return totalServicos;
    }

    public Double getTotalProdutos() {
        return totalProdutos;
    }

}
