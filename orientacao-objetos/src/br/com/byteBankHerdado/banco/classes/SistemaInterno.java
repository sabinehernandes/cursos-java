package br.com.byteBankHerdado.banco.classes;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa1) {
        boolean autenticou = fa1.autentica(this.senha);
        if (autenticou) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
