import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // To-do checklist: 
        // Importar classe Scanner e Locale
        // Criar objeto Scanner
        // Mostrar texto interativo
        // Declarar variáveis e armazenar valores recebidos dentro delas
        // Exibir mensagem de conta criada com sucesso

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
          
        System.out.println("Por favor, digite o Agência desejada:");
        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite o número da conta desejada:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor inicial que deseja depositar:");
        double saldoConta = scanner.nextDouble();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque\".");


    }
}
