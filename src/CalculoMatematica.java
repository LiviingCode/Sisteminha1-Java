import java.util.Scanner;
public class CalculoMatematica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String mensagem = """ 
                Escolha uma das opções abaixo:
                1.  Calcular área do quadrado
                2. Calcular área do círculo 
                """;
        System.out.println(mensagem);
            int opcao = leitor.nextInt();

        if( opcao == 1){
            System.out.println("Digite as dimensões do quadrado: ");
            double n1 = leitor.nextDouble();
            double n2 = leitor.nextDouble();
            double result = n1*n2;
            System.out.println("A área do seu quadrado é: " + result);
            }

        else if (opcao == 2) {
            System.out.println("Digite o raio do circulo: ");
            double nraio = leitor.nextDouble();
            double resultcirculo = 3.14 * Math.pow(nraio,2);
            System.out.println("A área do seu circulo é: " + resultcirculo);
        }

    }
}
