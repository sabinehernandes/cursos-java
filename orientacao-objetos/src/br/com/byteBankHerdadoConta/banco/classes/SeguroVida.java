package br.com.byteBankHerdadoConta.banco.classes;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
