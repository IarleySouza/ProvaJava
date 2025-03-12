import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double conversao =  9/5 * (fahrenheit - 32);
        //C = 5/9 x (F – 32)
        System.out.println("O valor de conversao para Celsius: " + conversao);
    }
}
