package byteBankEncapsulado.metodos;

import byteBankEncapsulado.classes.Conta;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1001, 24226);
        //Ao rodar, retorna "Estou criando uma conta nº 24226 e agência nº 1001"

        Conta conta2 = new Conta(1001, 24227);

        Conta conta3 = new Conta(1001, 24228);

        System.out.println("O total de contas criadas é de " + Conta.getTotal());
    }
}
