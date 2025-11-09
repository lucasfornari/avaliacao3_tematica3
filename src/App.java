
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ListaNotas gerenciador = null;

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n============== sistema de gerenciamento de notas ==============");
                System.out.println("1. inserir quantidade e notas dos alunos");
                System.out.println("2. ordenar as notas");
                System.out.println("3. exibir a lista de notas");
                System.out.println("0. encerrar o programa");
                System.out.println("===============================================================");
                System.out.print("escolha uma opcao: ");

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("opcao invalida, digite um numero de 0 a 3.");
                    scanner.nextLine();
                    opcao = -1;
                    continue;
                }

                switch (opcao) {
                    case 1 -> {
                        System.out.print("digite a quantidade de notas do aluno...: ");
                        if (scanner.hasNextInt()) {
                            int quantidade = scanner.nextInt();
                            scanner.nextLine();

                            if (quantidade <= 0) {
                                System.out.println("a quantidade deve ser maior que zero.");
                            } else {
                                gerenciador = new ListaNotas(quantidade);
                                gerenciador.inserirNotas(scanner);
                            }
                        } else {
                            System.out.println("valor invalido. digite um numero inteiro.");
                            scanner.nextLine();
                        }
                    }
                    case 2 -> {
                        if (gerenciador == null || !gerenciador.notasInseridas()) {
                            System.out.println("primeiro insira as notas (opcao 1).");
                        } else {
                            System.out.println("\nordenando notas usando selection sort...");
                            gerenciador.ordenarNotas();
                            System.out.println("notas ordenadas com sucesso!");
                        }
                    }
                    case 3 -> {
                        if (gerenciador == null || !gerenciador.notasInseridas()) {
                            System.out.println("primeiro insira as notas (opcao 1).");
                        } else {
                            gerenciador.exibirNotas();
                        }
                    }
                    case 0 -> {
                        System.out.println("programa finalizado.");
                    }
                    default -> {
                        System.out.println("opcao invalida, digite um numero de 0 a 3.");
                    }
                }

            } while (opcao != 0);

        }
    }
}
