import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while (nota !=-1){
            System.out.println("Digite sua avaliação do filme ou -1:  ");
            if(nota !=-1) {
                nota = leitura.nextDouble();
                media += nota;
                totalDeNotas++;
            }
        }
        System.out.println("media de avaliações " + media/totalDeNotas);
    }
}
