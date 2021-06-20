package byteBankEncapsulado.metodos;

import byteBankEncapsulado.classes.Cliente;
import byteBankEncapsulado.classes.Conta;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente sabine = new Cliente();
        //conta.titular = sabine;
        conta.setTitular(sabine);
        sabine.setNome("Sabine Hernandes");

        //Imprime Sabine Hernandes e equivale ao sout(conta.titular.nome) quando os atributos da classe não estão privados
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programadora");
        //Equivale a:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programadora");

    }
}
