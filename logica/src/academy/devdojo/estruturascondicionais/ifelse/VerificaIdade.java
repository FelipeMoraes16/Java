package academy.devdojo.estruturascondicionais.ifelse;/*
Receba uma idade como entrada
Se idade for maior que 18 imprima "Adulto"
Senão imprima "Ainda Não é Adulto"
*/

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 19;

        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda Não é Adulto");
        }
    }
}
