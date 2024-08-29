package academy.devdojo.estruturascondicionais.ifelse;/*
Eu, como administrador do sistema, gostaria de permitir que os próprios
usuários cadastrassem o nome de usuário (login) no sistema para agilizar
o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem , <nome do usuário> cadastrado com sucesso
Senão o sistema deverá mostrar o erro "Usuário inválido"
*/

public class CadastroDeLogin {
    public static void main(String[] args) {
        String usuario = "Felipe";

        if (usuario.isEmpty() || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {
            System.out.println("Erro: Usuário inválido");
        } else {
            System.out.println(usuario + " cadastrado com sucesso");
        }
    }
}
