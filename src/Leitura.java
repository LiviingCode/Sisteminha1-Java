import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
    }
}
