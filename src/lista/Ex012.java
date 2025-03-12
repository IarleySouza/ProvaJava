package lista;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //12 Crie um programa em Java que leia o preço de um produto, calcule e mostre o seu
        //PREÇO PROMOCIONAL, com 5% de desconto.

        System.out.print("Digite o valor de um produto: ");
        float produto = sc.nextFloat();
        System.out.printf("O produto com PREÇO PROMOCIONAL: %.2f", (produto-(produto * (0.05))));
    }
}
