package byteBankHerdadoConta.classes;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        //Chamada dos construtores da classe mãe
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
