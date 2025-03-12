package lista;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //11 Desenvolva uma programa em Java que leia os valores de A, B e C de uma
        //equação do segundo grau e mostre o valor de Delta. (formula Δ = b
        //2 – 4ac)
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        System.out.println("Delta: " + delta);
    }
}
