package lista;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //15 Crie um programa Java que leia o número de dias trabalhados em um mês e mostre o
        //salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
        //hora trabalhada.
        System.out.print("Digite os dias trabalhados em um mês: ");
        int diasTrabalhadas = sc.nextInt();

        int horasTrabalhadas = 8;

        System.out.println("Salario: " + (25*horasTrabalhadas)*diasTrabalhadas);
    }
}
