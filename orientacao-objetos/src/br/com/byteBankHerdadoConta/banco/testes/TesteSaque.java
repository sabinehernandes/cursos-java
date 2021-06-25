package br.com.byteBankHerdadoConta.banco.testes;

import br.com.byteBankHerdadoConta.banco.classes.Conta;
import br.com.byteBankHerdadoConta.banco.classes.ContaCorrente;
import br.com.byteBankHerdadoConta.banco.classes.SaldoInsuficienteException;

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
