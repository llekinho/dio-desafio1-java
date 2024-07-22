import java.util.Scanner;
import java.util.SortedMap;

public class AppBanco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        conta.setNumConta(scanner.nextInt());
        System.out.println("Digite o numero da agencia: ");
        conta.setAgencia(scanner.next());
        System.out.println("Digite o nome do cliente: ");
        conta.setNomeCliente(scanner.next());
        System.out.println("Digite o saldo: ");
        conta.setSaldo(scanner.nextFloat());

        conta.exibirConta();
    }
}