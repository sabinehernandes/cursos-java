package pilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            // O | equivale a fazer outro try catch
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String mensagem = ex.getMessage();
            System.out.println("Exception " + mensagem);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu erro!");
//        Equivale à:
//        ArithmeticException excecao = new ArithmeticException("Erro!");
//        throw excecao;
        //System.out.println("Fim do metodo2");
    }
}
