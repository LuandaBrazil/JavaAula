package EstruturaRepeticao;

public class Exemplo3 {
    public static void main(String[] args) throws InterruptedException{
        String[] nomeCarros = {"Fusca", "Uno", "Opala", "Corsa"};
        for (String cadaCarro : nomeCarros) {

            System.out.println(cadaCarro);
            Thread.sleep(1000);
        }
    }
}