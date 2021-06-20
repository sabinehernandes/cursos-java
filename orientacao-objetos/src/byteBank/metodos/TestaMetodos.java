package byteBank.metodos;

import byteBank.classes.Conta;

public class TestaMetodos {

    public static void main(String[] args) {

        //Criação da conta
        Conta contaSabine = new Conta();
        contaSabine.saldo = 100;

        Conta contaEmily = new Conta();
        contaEmily.deposita(1000);

        //Depósito
        contaSabine.deposita(50);
        System.out.println("O saldo após o depósito é de R$" + contaSabine.saldo + "\n");

        //Saque
        boolean conseguiuRetirar = contaSabine.saca(20);
        System.out.println("O saldo após o saque é de R$" + contaSabine.saldo);
        System.out.println("Saque realizado? " + conseguiuRetirar + "\n");

        //Transferência
        boolean sucessoTransferencia = contaEmily.transfere(300, contaSabine);
        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("O saldo da Emily é R$" + contaEmily.saldo);
            System.out.println("O saldo da Sabine é R$" + contaSabine.saldo);
        } else {
            System.out.println("Transferência não realizada");
        }
    }
}
