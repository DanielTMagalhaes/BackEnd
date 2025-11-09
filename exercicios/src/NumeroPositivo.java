import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int numero = entrada.nextInt();

        if (numero > 0 ){
            System.out.println("Número Positivo!!");
        }
        else
            System.out.println("Número negativo");

    }
}
