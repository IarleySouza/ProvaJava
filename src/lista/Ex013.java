package lista;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //13 Faça um programa em Java que leia o salário de um funcionário, calcule e mostre o
        //seu novo salário, com 15% de aumento.
        System.out.print("Digite seu salario: ");
        double salario = sc.nextFloat();
        double novoSalario = salario + (salario * 0.15);

        System.out.println("Novo salario: " + novoSalario);
    }
}
