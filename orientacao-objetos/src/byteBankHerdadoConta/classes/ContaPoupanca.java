package byteBankHerdadoConta.classes;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        //Chamada dos construtores da classe mãe
        super(agencia, numero);
    }

    public void deposita(double valor) {
        super.saldo += valor;
    }
}
