import Util.IO;

public class Main {
    public static void main(String[] args) {
        IO.divisoria();
        System.out.println("Temporizador - Algorítmos de Ordenação");
        IO.divisoria();

        int escolha1 = IO.lerInt("Escolha uma opção (1 ou 2):\n\n" +
                                "[1] ZERO a DEZ MIL\n" +
                                "[2] ZERO a INT_MAX\n");
        
        int escolha2 = IO.lerInt("Escolha uma opção (1 ou 2):\n\n" + 
                                "[1] Rodar TODOS os algorítmos\n" +
                                "[2] Rodar um algorítmo em específico\n");

        if ((escolha1 < 1 || escolha1 > 2) || (escolha2 < 1 || escolha2 > 2)) {
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
                    case 1: Zero_A_DezMil.BubbleSort.algoritmos();
                    case 2: Zero_A_DezMil.CountingSort.algoritmos();
                    case 3: Zero_A_DezMil.InsertionSort.algoritmos();
                    case 4: Zero_A_DezMil.MergeSort.algoritmos();
                    case 5: Zero_A_DezMil.QuickSort.algoritmos();
                    case 6: Zero_A_DezMil.RadixSort.algoritmos();
                    case 7: Zero_A_DezMil.SelectionSort.algoritmos();   
                    default:
                        System.out.println("ERRO: Algorítmo Inválido");
                }
            } else {
                switch (algoritmo) {
                    case 1: Zero_A_IntMax.BubbleSort.algoritmos();
                    case 2: Zero_A_IntMax.CountingSort.algoritmos();
                    case 3: Zero_A_IntMax.InsertionSort.algoritmos();
                    case 4: Zero_A_IntMax.MergeSort.algoritmos();
                    case 5: Zero_A_IntMax.QuickSort.algoritmos();
                    case 6: Zero_A_IntMax.RadixSort.algoritmos();
                    case 7: Zero_A_IntMax.SelectionSort.algoritmos();
                    default:
                        System.out.println("ERRO: Algorítmo Inválido");
                }
            }
        }

    }

    public static int menuAlgoritmos() {
        return IO.lerInt(
            "Escolha o algoritmo:\n\n" +
            "[1] BubbleSort\n" +
            "[2] CountingSort\n" +
            "[3] InsertionSort\n" +
            "[4] MergeSort\n" +
            "[5] QuickSort\n" +
            "[6] RadixSort\n" +
            "[7] SelectionSort\n"
        );
    }
}