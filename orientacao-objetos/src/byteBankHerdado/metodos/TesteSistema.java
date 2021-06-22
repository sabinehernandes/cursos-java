package byteBankHerdado.metodos;

import byteBankHerdado.classes.Administrador;
import byteBankHerdado.classes.Designer;
import byteBankHerdado.classes.Gerente;
import byteBankHerdado.classes.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setSenha(2222);

        Administrador adm1 = new Administrador();
        adm1.setSenha(2221);

        SistemaInterno auth = new SistemaInterno();
        auth.autentica(gerente1);
        auth.autentica(adm1);
    }
}
