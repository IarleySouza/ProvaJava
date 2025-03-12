package lista;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        //7 Crie um programa em Java que leia um número real e mostre na tela o seu dobro e a sua
        //terça parte.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float num = sc.nextFloat();

        float dobro = num * 2;
        float tercaparte = num / 3;


        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + tercaparte);
    }
}
