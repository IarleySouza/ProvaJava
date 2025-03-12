package lista;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //programa que leia o nome e o salário de um funcionário, mostrando no final uma
        //mensagem.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu salario: ");
        int salario = sc.nextInt();

        System.out.println("Nome do funcionario: " + nome + "\nSalario: " + salario);
        System.out.println("O funcionario " + nome + " tem um salario de R$" + salario + " em junho");
    }
}
