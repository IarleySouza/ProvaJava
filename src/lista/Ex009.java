package lista;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {

        // 9.Faça um programa em Java que leia quanto dinheiro uma pessoa tem na carteira (em R$)
        //e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou cotação
        //atual)
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que está em sua carteira: ");
        double valor = sc.nextDouble();
        double dorlar = valor / 6.75;

        System.out.printf("Você pode comprar com R$%.2f reais %.2f dolares.", valor, dorlar);

        sc.close();
    }
}
