import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu imc é: %.2f" , imc);


    }
}
