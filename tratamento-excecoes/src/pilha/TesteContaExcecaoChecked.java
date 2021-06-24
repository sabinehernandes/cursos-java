package pilha;

public class TesteContaExcecaoChecked {

    public static void main(String[] args) {

        Conta conta = new Conta();
        try {
            conta.deposita();
        } catch (MinhaExcecao excecao) {
            System.out.println("Tratamento do erro");
        }

    }
}
