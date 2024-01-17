public class Condicional {
    public static void main (String[] args) {
        int ano = 2022;
        boolean incluido = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lançamentos que estão curtindo");
        } else {
            System.out.println("Filme que vale a pena assistir");
        }

        if (incluido == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }
        else{
            System.out.println("não liberado - deve pagar");
        }
    }
}
