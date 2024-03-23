import java.util.Scanner; //Declaração para puxar a biblioteca de scanner

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Criando um objeto Scanner para conseguir puxar as informações do usuário.

        System.out.println("Seja bem-vindo ao Banco Bygah.");
        System.out.println("-----------------------------");
        System.out.println("Por favor, digite o seu nome para iniciar: ");
        String nome = scanner.nextLine(); //Abrindo o console para o usuário.
        System.out.println("Por favor, digite a sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite a sua conta: ");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite um saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e o seu saldo no valor de R$ " + saldo + " já está disponível para saque.");

    }
}
