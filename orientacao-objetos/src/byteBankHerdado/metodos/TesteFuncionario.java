package byteBankHerdado.metodos;

import byteBankHerdado.classes.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("Sabine Hernandes");
        f1.setCpf("000.000.000-00");
        f1.setSalario(3000);

        System.out.println(f1.getNome());
        System.out.println(f1.getBonificacao());

    }
}
