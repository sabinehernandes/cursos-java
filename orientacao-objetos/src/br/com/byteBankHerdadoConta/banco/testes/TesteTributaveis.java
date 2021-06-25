package br.com.byteBankHerdadoConta.banco.testes;

import br.com.byteBankHerdadoConta.banco.classes.CalculadoraImposto;
import br.com.byteBankHerdadoConta.banco.classes.ContaCorrente;
import br.com.byteBankHerdadoConta.banco.classes.SeguroVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1001, 11111);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.registra(cc);
        calculadora.registra(seguro);

        //Imprime 43 (42 do seguro de vida + 1% de R$100 depositados)
        System.out.println(calculadora.getTotalImposto());
    }
}
