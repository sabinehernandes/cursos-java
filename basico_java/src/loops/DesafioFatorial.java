package loops;

public class DesafioFatorial {

    public static void main(String[] args) {

        int fatorial = 1;
        for (int numero = 1; numero < 11; numero++) {
            fatorial *= numero;
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
