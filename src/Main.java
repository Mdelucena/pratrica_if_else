import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                -------------Menu------------
                Oque voce vai querer?
                1. Cachorro quente
                2. X-Salada
                3. X - Bacon
                4. Torrada Simples
                5. Refrigerante
                """);

        int quantidade;
        int cachorroQuente = 1;
        int xSalada = 2;
        int xBanco = 3;
        int torraSimples = 4;
        int refrigerante = 5;
        double valor;
        int codigo;

        codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Quantos Cachorros quente você vai querer?");
            quantidade = sc.nextInt();
            valor = 4.00 * quantidade;
            System.out.printf("valor do pedido é R$: %.2f%n", valor);
        } else if (codigo == 2) {
            System.out.println("Quantos X-salada você vai querer?");
            quantidade = sc.nextInt();
            valor = 4.50 * quantidade;
            System.out.printf("valor do pedido é R$: %.2f%n", valor);
        } else if (codigo == 3) {
            System.out.println("Quantos X-banco você vai querer?");
            quantidade = sc.nextInt();
            valor = 5.50 * quantidade;
            System.out.printf("valor do pedido é R$: %.2f%n", valor);
        } else if (codigo == 4) {
            System.out.println("Quantas Torradas Simples você vai querer?");
            quantidade = sc.nextInt();
            valor = 2.20 * quantidade;
            System.out.printf("valor do pedido é R$: %.2f%n", valor);
        } else if (codigo == 5) {
            System.out.println("Quantos Regrigerantes você vai querer?");
            quantidade = sc.nextInt();
            valor = 1.50 * quantidade;
            System.out.printf("valor do pedido é R$: %.2f%n", valor);

        } else {
            System.out.println("opção invalida");
        }

        System.out.println("Muito obrigado!");

        sc.close();

    }
}