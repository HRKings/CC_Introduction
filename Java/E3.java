import java.util.*;


public class E3 {

    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Recebe o numero que sera usado
        int number = scan.nextInt();

        // Usa a funcao para calcular o fatorial
        System.out.println("O fatorial e: " + fatorial(number));

    }

    public static int fatorial(int n){
        // Variavel temporaria
        int res = 1;

        // Multiplica de 2 a N
        for(int i = 2; i <= n; i++)
            res *= i;

        // Retorna a resposta
        return res;
    }

}