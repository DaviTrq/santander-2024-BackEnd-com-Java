import java.util.Scanner;


public class VerificaPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) { 

            boolean primo = true;

            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            
             for (int i = 2; i < num ; i++) {
            
                if (num % i == 0) {
                primo = false;
                }
            }

            if (primo == true) {
            System.out.println("O número " + num + " é primo");
            }
            else {
            System.out.println("O número " + num + " não é primo");
            }

            System.out.print("Voce deseja continuar?: s/n ");
            String resposta = scanner.next();

            if (resposta.equals("n")) {
                scanner.close();
                break;
            }

        }
    }
}