import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        // Gera um número aleatório entre 0 e 100
        int numeroSecreto = gerador.nextInt(101); // 101 porque o limite superior é exclusivo
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("🎯 Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + tentativas + " tentativas.\n");

        // Loop das tentativas
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = entrada.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou o número secreto: " + numeroSecreto);
                acertou = true;
                break; // Sai do loop
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que " + palpite + ".\n");
            } else {
                System.out.println("O número secreto é MENOR que " + palpite + ".\n");
            }
        }

        if (!acertou) {
            System.out.println("😢 Suas tentativas acabaram. O número era: " + numeroSecreto);
        }

        entrada.close();
    }
}
