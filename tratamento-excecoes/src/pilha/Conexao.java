package pilha;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo a conexão");
        //throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

//    public void fecha() {
//        System.out.println("Fechando a conexão");
//    }

    @Override
    public void close() {
        System.out.println("Fechando a conexão");

    }
}