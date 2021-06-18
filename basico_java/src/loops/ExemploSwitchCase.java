package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExemploSwitchCase {

    public static void main(String[] args) throws IOException {

        System.out.println("Teste de switch case: mês");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o número do mês: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mes = Integer.parseInt(st.nextToken());

        switch (mes) {
            case 1:
                    System.out.println("O mês é Janeiro");
                    break;
                case 2:
                    System.out.println("O mês é Fevereiro");
                    break;
                case 3:
                    System.out.println("O mês é Março");
                    break;
                case 4:
                    System.out.println("O mês é Abril");
                    break;
                case 5:
                    System.out.println("O mês é Maio");
                    break;
                case 6:
                    System.out.println("O mês é Junho");
                    break;
                case 7:
                    System.out.println("O mês é Julho");
                    break;
                case 8:
                    System.out.println("O mês é Agosto");
                    break;
                case 9:
                    System.out.println("O mês é Setembro");
                    break;
                case 10:
                    System.out.println("O mês é Outubro");
                    break;
                case 11:
                    System.out.println("O mês é Novembro");
                    break;
                case 12:
                    System.out.println("O mês é Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        }
    }
