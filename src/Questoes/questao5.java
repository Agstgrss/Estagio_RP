package Questoes;
import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma string: ");
    String string1 = sc.nextLine();

    String string2 = inverter(string1);

        System.out.println("String original: " + string1);
        System.out.println("String invertida: " + string2);
}

    public static String inverter(String string) {
        char[] caracteres = string.toCharArray();
        int tamanho = caracteres.length;
        char[] invertido = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertido[i] = caracteres[tamanho - i - 1];
        }

        return new String(invertido);
    }
}
