package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitor1 = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor1.nextInt();
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite o segundo valor: ");
        int valor2 = leitor2.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1);

        } else if (valor2 > valor1) {
            System.out.println(valor2);

        } else {

            System.out.println("Os numeros sao iguais");
        }
    }
}