package br.com.byteBankHerdado.banco.classes;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;

    }
//    Não é necessário escrever esses métodos pois ao invocar o método registra(Funcionario funcionario) o polimorfismo garante que será atribuída a bonificação especificada dentro da classe
//    public void registra(Gerente gerente) {
//        double bonificacao = gerente.getBonificacao();
//        this.soma += bonificacao;
//    }
//
//
//
//    public void registra(EditorVideo ev) {
//        double bonificacao = ev.getBonificacao();
//        this.soma += bonificacao;
//
//    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
