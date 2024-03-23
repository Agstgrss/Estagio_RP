package Questoes;


public class questao4 {

    public static void main(String[] args) {

        boolean[] lampadas = new boolean[3];

        ligarInterruptor(1, lampadas, 15);

        ligarInterruptor(2, lampadas);

        //ligarInterruptor(3,lampadas); //não sera utilizado apenas representei

        // Verifique qual lâmpada está acesa, quente e fria
        boolean lampadaAcesa = false;
        boolean lampadaQuente = false;


        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                lampadaAcesa = true;
                System.out.println("Lâmpada " + (i + 1) + " está acesa, correspondendo ao interruptor " + (i + 1));
                System.out.println("Lâmpada " + (i + 2) + " está apagada e fria, correspondendo ao interruptor " + (i + 2));
                break;
            } else {
                    lampadaQuente = true;
                    System.out.println("Lâmpada " + (i + 1) + " está apagada e quente, correspondendo ao interruptor " + (i + 1));
                }
            }
        }

    public static void ligarInterruptor(int numeroInterruptor, boolean[] lampadas, int minutos) {
        System.out.println("Ligando o interruptor " + numeroInterruptor + " por " + minutos + " minutos...");

        lampadas[numeroInterruptor - 1] = true;
        System.out.println("Desligando o interruptor " + numeroInterruptor);
        lampadas[numeroInterruptor - 1] = false;
    }

    public static void ligarInterruptor(int numeroInterruptor, boolean[] lampadas) {
        System.out.println("Ligando o interruptor " + numeroInterruptor);
        lampadas[numeroInterruptor - 1] = true;
    }
}