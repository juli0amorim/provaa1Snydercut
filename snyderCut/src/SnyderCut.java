import java.util.Scanner;

public class SnyderCut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você assistiu ao Snyder Cut? (Digite 'sim' ou 'nao')");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Qual nota você daria de 1 a 10?");
            int nota = scanner.nextInt();

            if (nota >= 1 && nota <= 10) {
                for (int i = 0; i < nota; i++) {
                    System.out.println("For Darkseid");
                }
            } else {
                System.out.println("Nota inválida. Por favor, insira uma nota de 1 a 10.");
            }
        } else if (resposta.equalsIgnoreCase("nao")) {
            System.out.println("Thanos is Inevitable");
        } else {
            System.out.println("Resposta inválida. Por favor, responda 'sim' ou 'nao'.");
        }

        scanner.close();
    }
}


// Julio Henrique Amorim Silva
// RA: 1232020573