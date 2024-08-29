package academy.devdojo.variaveis;

/*
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário, sendo os valores da porcentagem
serão
*30%
*15%
*5%
A cada vez que você calcular guarde o resultado em uma variável
Imprima o resultado e reutilize a variável que guarda o resultado
para o novo cálculo, repetindo o salário
*/
public class CalculoPorcentagemReutilizavel {
    public static void main(String[] args){
        double salario = 5000.00;
        double porcentagemReutilizavel = salario * 30 / 100;

        System.out.println("O valor de 30% de " + salario + " é " + porcentagemReutilizavel);

        porcentagemReutilizavel = salario * 15 / 100;
        System.out.println("O valor de 15% de " + salario + " é " + porcentagemReutilizavel);

        porcentagemReutilizavel = salario * 5 / 100;
        System.out.println("O valor de 5% de " + salario + " é " + porcentagemReutilizavel);
    }
}
