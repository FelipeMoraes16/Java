package academy.devdojo.estruturascondicionais.ifelse;/*
Ate 1903.98 = ISENTO
1903.99 ate 2826.65 = 7,5%
2826.66 ate 3751.05 = 15%
3751.06 ate 4664.68 = 22,5%
Acima 4664.68 = 27,5%
*/

public class ImpostoDeRenda {
    public static void main(String[] args) {
        float salario = 2000.00F;
        float calculoPorcentagem = 0F;
        String porcentagem = "";

        if (salario <= 1903.98) {
            porcentagem = "ISENTO";
        } else if (salario >= 1903.98 && salario <= 2826.65) {
            porcentagem = "7,5%";
            calculoPorcentagem = salario * 0.075F;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            porcentagem = "15%";
            calculoPorcentagem = salario * 0.15F;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            porcentagem = "22,5%";
            calculoPorcentagem = salario * 0.225F;
        } else {
            porcentagem = "27,5%";
            calculoPorcentagem = salario * 0.275F;
        }

        if (calculoPorcentagem == 0F) {
            System.out.println(porcentagem);
        } else {
            System.out.println(porcentagem + " valor do imposto é " + calculoPorcentagem);
        }

    }
}
