import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número da Agência: ");
        String agency = scan.nextLine();

        System.out.println("Por favor digite o número da Conta: ");
        int number = scan.nextInt();

        System.out.println("Por favor digite o nome do Cliente");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println("Por favor digite o depósito inicial: ");
        double balance = scan.nextDouble();

        System.out.println("\nOlá " + name + ", obrigado por criar uma conta em nosso banco, "
            + "sua agência é " + agency + ", conta " + number + " e seu saldo " + 
            String.format("%.2f", balance)
            + " já está disponível para saque.");
        scan.close();
    }
}
