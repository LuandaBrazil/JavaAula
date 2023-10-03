package EstruturaRepeticao;

import java.util.concurrent.SynchronousQueue;

public class Exemplo8 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia", "Odirlei", "Jessica", "Thiago"};
        for (int contador = 0; contador < listaProfessores.length; contador++) {

                if (contador == 0) {
                    System.out.println("O numerodo indice do(a) professor(a)" + listaProfessores[contador] + "é zero");
                } else if (contador %2 ==0) {
                        System.out.println("O numero do indice do (a) professora (a) " +
                                listaProfessores[contador] + "é Par");
                    }else {
                    System.out.println("O nome do [indice do (a) professor (a)" + listaProfessores [contador] + "é impar");
                }

            }
        }
    }

