import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero  = sc.nextInt();

        int quadrado = numero*numero;
        int cubic = numero*numero*numero;

        System.out.println("O numero ao quadrado: " + quadrado + " e o cubo: " + cubic);
    }
}
