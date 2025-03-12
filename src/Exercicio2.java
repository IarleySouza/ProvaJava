import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Celsius: ");
        double celsius = sc.nextDouble();


        double conversao =  (celsius * 9/5) + 32;

        System.out.println("O valor do Fahrenheit: " + conversao);
        //F = C x 1,8 + 32.
    }
}
