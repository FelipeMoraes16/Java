package academy.devdojo.estruturascondicionais.ifelse;

/*
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final
*/
public class CalculadoraImpostoCondicional {
    public static void main(String[] args) {
        float salario = 4000.00F;
        float imposto = 0F;
        String qualImposto = "";

        if (salario > 4500) {
            imposto = salario * 0.3F;
            qualImposto = "30%";
        } else {
            imposto = salario * 0.15F;
            qualImposto = "15%";
        }

        System.out.println("O valor de " + qualImposto + " é " + imposto);
    }
}
