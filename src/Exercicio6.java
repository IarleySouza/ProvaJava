import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;
        System.out.println("O valor de delta: " + delta);
    }
}
