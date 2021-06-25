package br.com.byteBankHerdado.banco.testes;

import br.com.byteBankHerdado.banco.classes.ControleBonificacao;
import br.com.byteBankHerdado.banco.classes.Designer;
import br.com.byteBankHerdado.banco.classes.EditorVideo;
import br.com.byteBankHerdado.banco.classes.Gerente;
import byteBankHerdado.classes.*;

public class TesteReferencias {

    public static void main(String[] args) {

//        Não é mais possível criar um funcionário pois a classe é abstrata
//        Funcionario funcionario1 = new Funcionario();
//        funcionario1.setNome("Luciana");
//        funcionario1.setSalario(2000.0);

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Juliana");
        gerente1.setSalario(5000.0);

        Designer designer1 = new Designer();
        designer1.setNome("Jessica");
        designer1.setSalario(2000.0);

        EditorVideo editorvideo1 = new EditorVideo();
        editorvideo1.setNome("Vitor");
        editorvideo1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        //Bonificação gerente = 5000
        controle.registra(gerente1);
        System.out.println("O bônus do gerente é de R$" + gerente1.getBonificacao());

        //Bonificação editor = 150
        controle.registra(editorvideo1);
        System.out.println("O bônus do editor de vídeo é de R$" + editorvideo1.getBonificacao());

        //Bonificação designer = 200
        controle.registra(designer1);
        System.out.println("O bônus do designer é de R$" + designer1.getBonificacao());;

        //Soma dos bônus = 5350
        System.out.println("A soma de todos os bônus é de R$" + controle.getSoma());

    }
}
