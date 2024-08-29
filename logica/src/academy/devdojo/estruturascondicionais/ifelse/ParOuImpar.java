package academy.devdojo.estruturascondicionais.ifelse;/*
dado um determinado número inteiro
imprima se ele é ímpar ou par
*/

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 1;

        if (numero % 2 == 0) {
            System.out.println("o número " + numero + " é PAR");
        } else {
            System.out.println("o número " + numero + " é ÍMPAR");
        }
    }
}
