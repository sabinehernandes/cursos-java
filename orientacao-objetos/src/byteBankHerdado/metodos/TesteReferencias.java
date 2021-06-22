package byteBankHerdado.metodos;

import byteBankHerdado.classes.ControleBonificacao;
import byteBankHerdado.classes.EditorVideo;
import byteBankHerdado.classes.Funcionario;
import byteBankHerdado.classes.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Juliana");
        gerente1.setSalario(5000.0);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Luciana");
        funcionario1.setSalario(2000.0);

        EditorVideo editorvideo1 = new EditorVideo();
        editorvideo1.setNome("Vitor");
        editorvideo1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        //Bonificação gerente = 5250
        controle.registra(gerente1);
        System.out.println("O bônus do gerente é de R$" + gerente1.getBonificacao());

        //Bonificação funcionário = 100
        controle.registra(funcionario1);
        System.out.println("O bônus do funcionário é de R$" + funcionario1.getBonificacao());

        //Bonificação editor = 225
        controle.registra(editorvideo1);
        System.out.println("O bônus do editor de vídeo é de R$" + editorvideo1.getBonificacao());

        //Soma dos bônus = 5575
        System.out.println("A soma de todos os bônus é de R$" + controle.getSoma());

    }
}
