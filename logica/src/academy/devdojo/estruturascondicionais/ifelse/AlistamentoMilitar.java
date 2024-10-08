package academy.devdojo.estruturascondicionais.ifelse;/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
*/

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("alistamento obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("deseja se alistar? ");
        }
    }
}
