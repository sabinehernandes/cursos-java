package variaveis;

import java.security.spec.RSAOtherPrimeInfo;

public class Variaveis {

    public static void main(String[] args) {

        System.out.println("Olá, esse é um novo conteúdo!");

        //Variáveis inteiras: números inteiros, sem casas decimais. Por exemplo:

        int idade;
        idade = 23;
        System.out.println("A idade é: " + idade);

        int soma;
        soma = 20 + 10;
        System.out.println("A soma é: " +  soma);

        //Variáveis double: números com casas decimais. Por exemplo:

        double salario;
        salario = 2500.85;
        System.out.println("O salário é: " + salario);

        double operacao;
        operacao = 3.14 / 2;
        System.out.println("O resultado da operação 3.14 / 2 é igual a: " + operacao);

        int divisaoInt;
        divisaoInt = 5 / 2;
        //O resultado será 2, pois é uma variável int
        System.out.println("O resultado da divisão é: " + divisaoInt);

        double divisaoDouble;
        divisaoDouble = 5 / 2;
        //O resultado será 2, pois apesar de ser uma variável double, o input foi sem as casas decimais
        System.out.println("O resultado da divisão é: " + divisaoDouble);

        double divisaoDoubleNova;
        divisaoDoubleNova = 5.0 / 2;
        //O resultado será 2.5, pois o input foi feito com as casas decimais
        System.out.println("O resultado da divisão é: " + divisaoDoubleNova);

        //Conversão de variáveis

        double remuneracao;
        remuneracao = 2500.85;
        int valor = (int) remuneracao;
        //O resultado é 2500
        System.out.println("A remuneração é: " + valor);

    }
}
