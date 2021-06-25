package br.com.byteBankHerdado.banco.testes;

import br.com.byteBankHerdado.banco.classes.Funcionario;
import br.com.byteBankHerdado.banco.classes.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

//        Não é mais possível criar um funcionário pois a classe é abstrata
//        Funcionario f1 = new Funcionario();
        Funcionario f1 = new Gerente();
        f1.setNome("Sabine Hernandes");
        f1.setCpf("000.000.000-00");
        f1.setSalario(3000);

        System.out.println(f1.getNome());
        System.out.println(f1.getBonificacao());

    }
}
