package academy.devdojo.variaveis;

/*
Crie uma classe que calcule uma determinada porcentagem de um dado salário
Criar uma classe
Aceitar um valor de entrada para o salário
Definir o valor da porcentagem (perguntar quanto?) = 30%
Calcular a porcentagem
*/
public class CalculoDePorcentagem {
    public static void main(String[] args){
        float salario = 2500.00F;
        float porcentagem = 30F;
        float porcentagemDoSalario = salario * porcentagem / 100;

        System.out.println("The percentage of " + porcentagem + " of " + salario + " is " + porcentagemDoSalario);
    }
}
