package academy.devdojo.estruturascondicionais.switchcase;

/*
Como gerente eu gostaria que meus usuários pudessem
digitar o tipo da conta e o sistema imprima qual a porcentagem de juros
que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações
Os tipos das contas são
CONTA_POUPANÇA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
Caso a conta não exista imprima "CONTA_INEXISTENTE"
*/

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String tipoConta = "CONTA";

        switch(tipoConta){
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA_INEXISTENTE");
        }
    }
}
