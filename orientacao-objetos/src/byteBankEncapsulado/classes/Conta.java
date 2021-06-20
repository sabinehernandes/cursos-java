package byteBankEncapsulado.classes;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    //Pega o saldo
    public double getSaldo() {
        return this.saldo;
    }

    //Pega o número
    public int getNumero() {
        return this.numero;
    }

    //Altera o número, que deve ser setado dentro do () como uma nova variável
    //A variável temporária e o atributo têm o mesmo nome (numero) mas são diferentes pois estamos usando o this.numero
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
