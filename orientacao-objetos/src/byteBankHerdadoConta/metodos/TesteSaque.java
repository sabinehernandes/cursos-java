package byteBankHerdadoConta.metodos;

import byteBankHerdadoConta.classes.Conta;
import byteBankHerdadoConta.classes.ContaCorrente;
import byteBankHerdadoConta.classes.SaldoInsuficienteException;

public class TesteSaque {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);
        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("O saldo após a transação é de R$" + conta.getSaldo());
    }
}
