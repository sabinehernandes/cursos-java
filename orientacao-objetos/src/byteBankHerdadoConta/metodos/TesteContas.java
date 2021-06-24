package byteBankHerdadoConta.metodos;

import byteBankHerdadoConta.classes.ContaCorrente;
import byteBankHerdadoConta.classes.ContaPoupanca;
import byteBankHerdadoConta.classes.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(1001, 10001);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(2002, 20002);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);
        System.out.println("O saldo da conta corrente após a transferência é de R$" + cc.getSaldo());
        System.out.println("O saldo da conta poupança após a transferência é de R$" + cp.getSaldo());
    }

}
