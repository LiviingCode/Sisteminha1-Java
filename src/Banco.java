import java.text.DecimalFormat;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        String nome = "Vanusa";
        String conta = "Corrente";
        double saldo = 2200.00;
        DecimalFormat df = new DecimalFormat(".#");;
        int op = 0;

        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\n Nome do cliente: " + nome );
        System.out.println("\n Tipo de conta: " + conta );
        System.out.println("\n Saldo Inicial: " + df.format(saldo));
        System.out.println("*********************************");

        String menu = """ 

               ********* Digite sua Opção ************
                1 - Consultar Saldo
                2 - Tranferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (op != 4){
            System.out.println(menu);
            op = leitura.nextInt();
            if (op == 1){
                System.out.println("O Saldo atualizado é: " + df.format(saldo));
            } else if (op == 2){
                System.out.println("Qual o valor da transferência: ");
                double valor = leitura.nextDouble();
                    if (valor > saldo){
                         System.out.println("Saldo insuficiente");
                            } else {
                                saldo -= valor;
                    }
            } else if (op == 3){
                System.out.println("Qual o valor depositado: ");
                double deposito = leitura.nextDouble();
                saldo +=deposito;
            } else if (op != 4){
                System.out.println("Opção inválida");
            }
        }

}
}
