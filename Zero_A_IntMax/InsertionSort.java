package Zero_A_IntMax;
import Util.IO;

public class InsertionSort {
    public static void algoritmos(){

        IO.divisoria();
        System.out.println("Iniciando testes 0 a INT_MAX: Insertion Sort");
        IO.divisoria();

        cem();
        mil();
        dezMil();
        cemMil();
        umMilhao();
        dezMilhoes();
    }

    public static void cem(){
        int[] array = IO.gerarValoresAleatorios(100, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 100 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }

    public static void mil(){
        int[] array = IO.gerarValoresAleatorios(1000, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 1000 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }

    public static void dezMil(){
        int[] array = IO.gerarValoresAleatorios(10000, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 10.000 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }

    public static void cemMil(){
        int[] array = IO.gerarValoresAleatorios(100000, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 100.000 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }

    public static void umMilhao(){
        int[] array = IO.gerarValoresAleatorios(1000000, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 1.000.000 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }
    
    public static void dezMilhoes(){
        int[] array = IO.gerarValoresAleatorios(10000000, 0, Integer.MAX_VALUE-1);
        System.out.println("Conjunto de 10.000.000 elementos: ");
        long tempoInicio = IO.medirTempoIniciar();
        System.out.println("Rodando...");
        IO.insertionSort(array);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempoInicio);

        System.out.println("Tempo: " + tempoTotal + "\n");
    }
}