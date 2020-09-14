import java.util.*;


public class E2 {

    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Recebe o numero que sera usado
        int number = scan.nextInt();

        // Usa a funcao para calcular a soma dos primeiros n numeros
        System.out.println("A soma e: " + nSum(number));

    }

    public static int nSum(int n){
        // Variavel temporaria
        int res = 0;

        // Soma os numeros de 0 a N
        for(int i = 0; i <= n; i++)
            res += i;

        // Retorna o resultado
        return res;
    }

}