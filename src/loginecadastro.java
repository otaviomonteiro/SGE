
import java.util.Scanner;

public class loginecadastro {
    public static void main(String[] args) {

        System.out.println("CADASTRO DE USUARIO E SENHA");
        Scanner entrada = new Scanner(System.in);

        String senha = "null";

        boolean cadastro = false;
        while (cadastro == false)
        {

            System.out.println("Digite o seu nome completo:");
            String nome = entrada.nextLine();


            StringBuilder ultimo = new StringBuilder("_");

            for (int i = nome.lastIndexOf(" ") + 1; i <= nome.length(); i++) {
                if (i < nome.length()) {
                    ultimo.append(nome.charAt(i));
                }
            }

            String login = nome.charAt(0) + ultimo.toString();
            if (nome.length() >=8) {

                System.out.println("Seu nome é: " + nome);
                System.out.println("Seu login é: " + login);
                cadastro = true;
            } else {
                System.out.println("Erro! Tente novamente");
                break;
            }


            boolean validacao = false;

            while (validacao == false) {

                System.out.println("Digite uma senha:");
                senha = entrada.nextLine();

                if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")) {
                    System.out.println("Senha cadastrada com sucesso!");
                    validacao = true;
                } else {
                    System.out.println("Senha inválida");
                }
            }


            boolean doLogin = false;

            while (doLogin == false) {

                System.out.println("Insira seu login:");
                String vLogin = entrada.nextLine();

                System.out.println("Insira sua senha:");
                String vSenha = entrada.nextLine();

                if (vLogin.equals(login) && vSenha.equals(senha)) {
                    System.out.println("Login realizado com sucesso!");
                    doLogin = true;
                } else {
                    System.out.println("Login ou senha inválidos");
                }

            }
        }






    }
}