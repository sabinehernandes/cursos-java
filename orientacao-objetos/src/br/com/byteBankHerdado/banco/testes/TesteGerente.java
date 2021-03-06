package br.com.byteBankHerdado.banco.testes;

import br.com.byteBankHerdado.banco.classes.Gerente;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Emily Durães");
        g1.setSalario(5000);
        g1.setCpf("111.111.111-11");

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g1.getCpf());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

    }
}
