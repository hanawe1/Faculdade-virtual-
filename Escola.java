import java.util.Scanner;
public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo á sua faculdade virtual!");
        System.out.println("Escolha a turma (A ou B):");
        String turma = scanner.next();

        System.out.println("Escolha a sala (1 ou 2):");
        int sala = scanner.nextInt();

        System.out.println("Escolha o curso (Informática ou Direito):");
        String curso = scanner.next();

        System.out.println("Você está na turma " + turma + ", na sala " + sala + ", cursando " + curso + ".");
    }
}
