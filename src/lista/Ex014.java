package lista;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //14 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
        //programa em Java que pergunte a quantidade de Km percorridos por um carro alugado e
        //a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo
        //que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

        System.out.println("Quantidade de Km percorridos: ");
        double km = sc.nextDouble();
        System.out.println("Quantidade de dias: ");
        double dias = sc.nextDouble();


        double precoTotal = (km*0.20) + (dias*90);
        System.out.println("O valor total a ser pago: R$ " + precoTotal);

    }
}
