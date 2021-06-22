package byteBankHerdado.classes;

//EditorVideo herda da classe Funcionario
public class EditorVideo extends Funcionario {

        public double getBonificacao() {
            return super.getBonificacao() + 100;
    }

}
