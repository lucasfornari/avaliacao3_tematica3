
import java.util.Scanner;

public class ListaNotas {

    private final Nota[] notas;
    private int quantidadeInserida;

    public ListaNotas(int quantidade) {
        notas = new Nota[quantidade];
        quantidadeInserida = 0;
    }

    public void inserirNotas(Scanner scanner) {
        System.out.println("\n---------------- inserindo notas dos alunos ----------------");

        for (int i = 0; i < notas.length; i++) {
            double valor = -1;
            boolean valorValido = false;

            while (!valorValido) {
                System.out.print("digite a nota " + (i + 1) + " (0-10): ");

                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    scanner.nextLine();

                    if (valor >= 0 && valor <= 10) {
                        valorValido = true;
                    } else {
                        System.out.println("nota invalida. digite um valor entre 0 e 10.");
                    }
                } else {
                    System.out.println("valor invalido. digite um numero.");
                    scanner.nextLine();
                }
            }

            notas[i] = new Nota(valor);
            quantidadeInserida++;
        }

        System.out.println("\ntodas as " + quantidadeInserida + " notas foram inseridas com sucesso!");
        System.out.println("------------------------------------------------------------");
    }

    public void ordenarNotas() {
        for (int i = 0; i < notas.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j].getValor() < notas[indiceMenor].getValor()) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                Nota guardarNota = notas[i];
                notas[i] = notas[indiceMenor];
                notas[indiceMenor] = guardarNota;
            }
        }
    }

    public void exibirNotas() {
        if (quantidadeInserida == 0) {
            System.out.println("    nenhuma nota foi inserida ainda.");
            return;
        }

        System.out.println("\n-------------------- lista de notas (" + quantidadeInserida + " notas) --------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("posicao: [" + (i + 1) + "] | " + notas[i].toString());
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public boolean notasInseridas() {
        return quantidadeInserida == notas.length;
    }
}
