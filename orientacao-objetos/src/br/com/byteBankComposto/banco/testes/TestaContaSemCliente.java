package br.com.byteBankComposto.banco.testes;

import br.com.byteBankComposto.banco.classes.Cliente;
import br.com.byteBankComposto.banco.classes.Conta;

public class TestaContaSemCliente {

    public static void main(String[] args) {

        Conta contaEmily = new Conta();

       /* //Imprime null
       System.out.println(contaEmily.titular);

        contaEmily.titular.nome = "Emily Durães";
        // Imprime erro exception in thread "main" java.lang.NullPointerException
        System.out.println(contaEmily.titular.nome);*/

        //Imprime corretamente o nome Emily Durães
        contaEmily.titular = new Cliente();
        contaEmily.titular.nome = "Emily Durães";
        System.out.println(contaEmily.titular.nome);
    }
}
