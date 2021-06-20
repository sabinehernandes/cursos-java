package byteBankComposto.metodos;

import byteBankComposto.classes.Cliente;
import byteBankComposto.classes.Conta;

public class TestaBanco {

    public static void main(String[] args) {

        //Cria a cliente
        Cliente sabine = new Cliente();
        sabine.nome = "Sabine Hernandes";
        sabine.cpf = "000.000.000-00";
        sabine.profissao = "Programadora";

        //Cria a conta
        Conta contaSabine = new Conta();
        contaSabine.deposita(1000);

        //Associa a cliente Sabine à conta contaSabine
        contaSabine.titular = sabine;
        //Imprime Cliente@7c75222b, que é a referência para o objeto
        System.out.println(contaSabine.titular);
        //Imprime Sabine Hernandes
        System.out.println(contaSabine.titular.nome);

    }

}
