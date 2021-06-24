package byteBankHerdadoConta.classes;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas criadas é de " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta nº " + this.numero + " e agência nº " + this.agencia);
    }

    public abstract void deposita(double valor);
//    {
//        this.saldo += valor;
//    }

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("O saque não ocorreu pois seu saldo é de R$" + this.saldo + " e o valor a ser sacado é de R$ " + valor);
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
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

    public static int getTotal() {
        return Conta.total;
    }
}
