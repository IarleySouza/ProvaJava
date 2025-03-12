package lista;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        //Desenvolva um programa em Java que leia dois números inteiros e mostre o somatório
        //entre eles.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        System.out.println("A soma dos dois numeros são: "+(num+num2));
    }
}
