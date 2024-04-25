import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Bem vindo");

        System.out.println("Digite um numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero:");
        num2 = scanner.nextInt();

        System.out.println("Resultado:");

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

    }
}