package desafio;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do seu mes: ");
        int numero = sc.nextInt();
        String mensagem = "";

        switch (numero) {
            case 1: System.out.println("Janeiro");
            break;

            case 2: System.out.println("Fevereiro");
            break;

            case 3: System.out.println("Marco");
            break;
        }
    }
}
