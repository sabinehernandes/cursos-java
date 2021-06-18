package condicionais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExemploCondicionalIdade {

    public static void main(String[] args) throws IOException {
        System.out.println("Teste de condicionais: idade");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite sua idade: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idade = Integer.parseInt(st.nextToken());

        System.out.println("Digite seu número de acompanhantes: ");
        st = new StringTokenizer(br.readLine());
        int quantidadePessoas = Integer.parseInt(st.nextToken());

        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Seja bem-vinde!");
            } else {
                System.out.println("Você não tem 18 anos e só pode entrar com 2 acompanhantes ou mais.");
            }
        }
    }
