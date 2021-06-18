package condicionais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class ExemploCondicionalCalculadoraIR {

    public static void main(String[] args) throws IOException {
        System.out.println("Calculadora de Imposto de Renda");

        double salario;
        double aliquota = 0.0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite seu salário: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        salario = Integer.parseInt(st.nextToken());

        boolean categoriaA = salario >= 1903.99 && salario <= 2826.65;
        boolean categoriaB = salario >= 2826.66 && salario <= 3751.05;
        boolean categoriaC = salario >= 3751.06 && salario <= 4664.68;
        boolean categoriaD = salario >= 4664.68;


        if (categoriaA) {
            aliquota = 142.80;
            salario = salario - aliquota;
            System.out.println("A dedução no IR é de 7.5%, no valor de R$"
                    + aliquota + ". O salário líquido é de " + salario);

        } else if (categoriaB) {
            aliquota = 354.80;
            salario = salario - aliquota;
            System.out.println("A dedução no IR é de 15%, no valor de R$"
                    + aliquota + ". O salário líquido é de R$" + salario);

        } else if (categoriaC){
            aliquota = 636.13;
            salario = salario - aliquota;
            System.out.println("A dedução no IR é de 22.5% no valor de R$"
                    + aliquota + ". O salário líquido é de R$" + salario);

        } else if (categoriaD) {
            aliquota = 869.36;
            salario = salario - aliquota;
            System.out.println("A dedução no IR é de 27%, no valor de R$"
                    + aliquota + ". O salário líquido é de R$" + salario);
        } else {
            System.out.println("O salário no valor de R$" + salario + " é isento do IR");
        }
    }
}
