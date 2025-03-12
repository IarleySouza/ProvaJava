package lista;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        //Faça um programa em Java que leia as duas notas de um aluno em uma matéria e
        //mostre na tela a sua média na disciplina.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a nota de outro aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("A media entre " + nota + " e " + nota2 + " é igual "+ (nota+nota2));
    }
}
