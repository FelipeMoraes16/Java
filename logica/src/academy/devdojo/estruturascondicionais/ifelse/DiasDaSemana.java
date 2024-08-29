package academy.devdojo.estruturascondicionais.ifelse;

/*
Receba um número inteiro do usuário e imprima o dia da semana correspondente
Sendo 1 segunda-feira
*/
public class DiasDaSemana {
    public static void main(String[] args) {
        int numero = 0;
        String diaDaSemana = "";

        if (numero == 1) {
            diaDaSemana = "segunda-feira";
        } else if (numero == 2) {
            diaDaSemana = "terça-feira";
        } else if (numero == 3) {
            diaDaSemana = "quarta-feira";
        } else if (numero == 4) {
            diaDaSemana = "quinta-feira";
        } else if (numero == 5) {
            diaDaSemana = "sexta-feira";
        } else if (numero == 6) {
            diaDaSemana = "sábado";
        } else if (numero == 7) {
            diaDaSemana = "domingo";
        } else {
            diaDaSemana = "dia inválido";
        }

        System.out.println(diaDaSemana);
    }
}
