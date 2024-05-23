import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Criando variaveis

        int numeroConta;
        String numeroAgencia = "";
        String nomeDoCliente = "";
        double saldo = 0.0;

        // Solicitando informações para usuario

        System.out.print("Informe o numero da conta: ");
        numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Informe o número da agência: ");
        numeroAgencia = scanner.nextLine();

        System.out.print("Informe o nome do cliente: ");
        nomeDoCliente = scanner.nextLine();

        System.out.print("Informe o saldo: ");
        saldo = scanner.nextDouble();


        // exibir a mensagem conta crida
        System.out.println(
                "Olá ," + nomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        // fechar scanner

        scanner.close();

    }

}
