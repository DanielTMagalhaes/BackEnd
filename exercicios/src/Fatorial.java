import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i; // multiplica fatorial pelo número atual
        }

        System.out.println(n + "! = " + fatorial);
        entrada.close();
    }
}
