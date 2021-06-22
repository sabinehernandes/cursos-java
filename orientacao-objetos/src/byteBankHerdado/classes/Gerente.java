package byteBankHerdado.classes;

//Gerente herda da classe Funcionario
public class Gerente extends FuncionarioAutenticavel {

        public double getBonificacao() {
            return super.getSalario();
    }

}
