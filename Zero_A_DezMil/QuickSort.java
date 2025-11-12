package Zero_A_DezMil;
import Util.IO;

public class QuickSort {
    public static void algoritmos(){
        // 100
        cem();
        // 1000
        mil();
        // 10000
        dezMil();
        // 100000
        cemMil();
        // 1000000
        umMilhao();
        // 10000000
        dezMilhoes();
    }

    public static void cem(){
        int[] array = IO.gerarValoresAleatorios(100, 0, 10000);
    }

    public static void mil(){
        int[] array = IO.gerarValoresAleatorios(1000, 0, 10000);
    }

    public static void dezMil(){
        int[] array = IO.gerarValoresAleatorios(10000, 0, 10000);
    }

    public static void cemMil(){
        int[] array = IO.gerarValoresAleatorios(100000, 0, 10000);
    }

    public static void umMilhao(){
        int[] array = IO.gerarValoresAleatorios(1000000, 0, 10000);
    }
    
    public static void dezMilhoes(){
        int[] array = IO.gerarValoresAleatorios(10000000, 0, 10000);
    }
}
