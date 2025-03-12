package lista;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //10 Faça um programa em Java que leia a largura e altura de uma parede, calcule e mostre
        //a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que
        //cada litro de tinta pinta uma área de 2 metros quadrados.

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        System.out.println("Area: " + area);

        double quantidadeTinta = area / 2;
        System.out.println("Quantidade de tinta para pintar a parede é de: " + quantidadeTinta +" listros");
    }
}
