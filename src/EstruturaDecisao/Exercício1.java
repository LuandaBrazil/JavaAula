package EstruturaDecisao;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        String usuario;
        String password;
        System.out.println("Digite o nome do usuário: ");
        Scanner user = new Scanner(System.in);
        usuario = user.nextLine();
        System.out.println("Digite a senha: ");
        Scanner senha = new Scanner(System.in);
        password = user.nextLine();
        if (user.equals("admin") && senha.equals("senha123")) {

            System.out.println("login bem-sucedido");
        } else {

            System.out.println("Nome de usuario ou senha incorretos");
        }
    }
}