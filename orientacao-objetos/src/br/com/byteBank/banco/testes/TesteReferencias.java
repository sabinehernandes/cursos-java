package br.com.byteBank.banco.testes;

import br.com.byteBank.banco.classes.Conta;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("O saldo da primeiraConta é de R$" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        //Imprime 300
        System.out.println("O saldo da segundaConta é de R$" + segundaConta.saldo);

        segundaConta.saldo += 100;
        //Imprime 400
        System.out.println("O saldo da segundaConta é de R$" + segundaConta.saldo);

        //Imprime 400, pois ambas variáveis se referenciam a um único objeto que foi somado +100
        System.out.println("O saldo da primeiraConta é de R$" + primeiraConta.saldo);

        //Teste para afirmar a lógica da OO, ou seja, são a mesma conta
        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }
    }
}
