import java.util.Scanner; //ToDos (TD): 1. Importar classe scanner
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("Digite o número do Usuário: "); //TD 2. exibir mensagens para nosso usuario
        int numero = inputUsuario.nextInt();
        inputUsuario.nextLine(); //encontrei um erro, pesquisei sobre o fato de que nextInt e nextDouble nao consomem o breakline, aparentemente isso resolve o problema e faz com que a execução do scanner para o valor agencia receba uma string vazia

        System.out.println("Digite o número da Agência: "); //TD 3. obter pela scanner os valores digitados no terminal
        String Agencia = inputUsuario.nextLine();

        System.out.println("Digite o Nome Completo: ");
        String NomeCliente = inputUsuario.nextLine();

        System.out.println("Digite o Saldo: ");
        double saldo = inputUsuario.nextDouble();
        inputUsuario.nextLine();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        //TD 4. exibir a mensagem conta criada


    }
}
