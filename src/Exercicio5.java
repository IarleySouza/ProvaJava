import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();

        double area = (base*altura) / 2;

        System.out.print("Sua area é: " + area);
    }
}
