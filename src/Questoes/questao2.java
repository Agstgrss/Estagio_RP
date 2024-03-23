package Questoes;
import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número :");
        int numero = sc.nextInt();

        if (pertenceSequenciaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        sc.close();
    }

    public static boolean pertenceSequenciaFibonacci(int numero) {

        int a = 0;
        int b = 1;

        if (numero == 0) {
            return true;
        }


        while (b <= numero) {
            if (b == numero) {
                return true;
            }

            int soma = b;
            b = a + b;
            a = soma;
        }
        return false;
    }
}
