package byteBank.classes;

public class Conta {
    public double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;

    }
}
