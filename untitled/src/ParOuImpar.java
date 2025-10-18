import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um Numero inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0){
        System.out.println("O número digitado é Par!");
        }
        else {
            System.out.println("O número digitado é Impar!");
        }
    }
}
