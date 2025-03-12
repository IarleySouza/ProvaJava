package lista;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        //6 Faça um programa em Java que leia um número inteiro e mostre o seu antecessor e seu
        //sucessor.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("O antecessor de " + num + " é " + (num - 1) + "\nO sucesso de " + num + " é " + (num + 1));
    }
}
