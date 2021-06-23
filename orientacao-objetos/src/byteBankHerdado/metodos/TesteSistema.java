package byteBankHerdado.metodos;

import byteBankHerdado.classes.*;

public class TesteSistema {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setSenha(2222);

        Administrador adm1 = new Administrador();
        adm1.setSenha(2221);

        Cliente cliente1 = new Cliente();
        cliente1.setSenha(2220);

        SistemaInterno auth = new SistemaInterno();
        auth.autentica(gerente1);
        auth.autentica(adm1);
        auth.autentica(cliente1);
    }
}
