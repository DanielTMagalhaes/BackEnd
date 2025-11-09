import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro Número:");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo Número:");
        int numero2 = entrada.nextInt();


        if (numero1 == numero2){
            System.out.println("Estes Número são Iguais!");
        } else if (numero1 > numero2) {
            System.out.println("Este número é o Maior: " + numero1);
        } else
            System.out.println("Este número é o Maior: " + numero2);

    }
}
