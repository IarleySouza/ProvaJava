package desafio;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        System.out.print( "Digite um numero ou digite um numero negativo para encerrar a aplicação: ");
        while((numero = sc.nextInt()) >= 0) {
            soma += numero;
            contador++;
            System.out.print("Digite um numero ou digite um numero negativo para encerrar a aplicação: ");
        }
        sc.close();
        int media = soma / contador;
        System.out.println("A media dos números digitados são: " + media + " \nForam digitados: " + contador);
    }
}
