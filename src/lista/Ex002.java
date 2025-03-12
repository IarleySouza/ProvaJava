package lista;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
        //vindas para ela:
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}
