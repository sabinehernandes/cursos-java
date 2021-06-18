package byteBank.metodos;

import byteBank.classes.Conta;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo inicial da primeiraConta é de R$" + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("O saldo da primeiraConta após o depósito é de R$" + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("O saldo inicial da segundaConta é de R$" + segundaConta.saldo);
    }
}
