import Util.IO;

public class Main {
    public static void main(String[] args) {
        IO.divisoria();
        System.out.println("Temporizador - Algorítmos de Ordenação");
        IO.divisoria();

        int escolha1 = IO.lerInt("Escolha uma opção (1 ou 2):\n\n" +
                    "[1] ZERO a DEZ MIL\n" +
                    "[2] ZERO a INT_MAX\n" +
                    "[3] FINALIZAR");

        int escolha2 = IO.lerInt("\nEscolha uma opção (1 ou 2):\n\n" +
                    "[1] Rodar TODOS os algorítmos\n" +
                    "[2] Rodar um algorítmo em específico\n");

        while (escolha1 != 3) {

            if ((escolha1 < 1 || escolha1 > 3) || (escolha2 < 1 || escolha2 > 2)) {
                System.out.println("ERRO: Escolha inválida, rode o programa novamente!");
            }

            if (escolha1 == 1 && escolha2 == 1) {
                Zero_A_DezMil.BubbleSort.algoritmos();
                Zero_A_DezMil.CountingSort.algoritmos();
                Zero_A_DezMil.InsertionSort.algoritmos();
                Zero_A_DezMil.MergeSort.algoritmos();
                Zero_A_DezMil.QuickSort.algoritmos();
                Zero_A_DezMil.RadixSort.algoritmos();
                Zero_A_DezMil.SelectionSort.algoritmos();
            }

            if (escolha1 == 2 && escolha2 == 1) {
                Zero_A_IntMax.BubbleSort.algoritmos();
                Zero_A_IntMax.CountingSort.algoritmos();
                Zero_A_IntMax.InsertionSort.algoritmos();
                Zero_A_IntMax.MergeSort.algoritmos();
                Zero_A_IntMax.QuickSort.algoritmos();
                Zero_A_IntMax.RadixSort.algoritmos();
                Zero_A_IntMax.SelectionSort.algoritmos();
            }

            if (escolha2 == 2) {
                int algoritmo = menuAlgoritmos();

                if (escolha1 == 1) {
                    switch (algoritmo) {
                        case 1: Zero_A_DezMil.BubbleSort.algoritmos(); continue;
                        case 2: Zero_A_DezMil.CountingSort.algoritmos(); continue;
                        case 3: Zero_A_DezMil.InsertionSort.algoritmos(); continue;
                        case 4: Zero_A_DezMil.MergeSort.algoritmos(); continue;
                        case 5: Zero_A_DezMil.QuickSort.algoritmos(); continue;
                        case 6: Zero_A_DezMil.RadixSort.algoritmos(); continue;
                        case 7: Zero_A_DezMil.SelectionSort.algoritmos(); continue;
                        default:
                            System.out.println("ERRO: Algorítmo Inválido"); continue;
                    }
                } else {
                    switch (algoritmo) {
                        case 1: Zero_A_IntMax.BubbleSort.algoritmos(); continue;
                        case 2: Zero_A_IntMax.CountingSort.algoritmos(); continue;
                        case 3: Zero_A_IntMax.InsertionSort.algoritmos(); continue;
                        case 4: Zero_A_IntMax.MergeSort.algoritmos(); continue;
                        case 5: Zero_A_IntMax.QuickSort.algoritmos(); continue;
                        case 6: Zero_A_IntMax.RadixSort.algoritmos(); continue;
                        case 7: Zero_A_IntMax.SelectionSort.algoritmos(); continue;
                        default:
                            System.out.println("ERRO: Algorítmo Inválido"); continue;
                    }
                }
            }

        }

        IO.divisoria();
        System.out.println("PROGRAMA FINALIZADO.");

    }

    public static int menuAlgoritmos() {
        return IO.lerInt(
                "\nEscolha o algoritmo:\n\n" +
                        "[1] BubbleSort\n" +
                        "[2] CountingSort\n" +
                        "[3] InsertionSort\n" +
                        "[4] MergeSort\n" +
                        "[5] QuickSort\n" +
                        "[6] RadixSort\n" +
                        "[7] SelectionSort\n");
    }

}