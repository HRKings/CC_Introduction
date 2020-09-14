import java.util.*;
import java.lang.String;

public class E4 {

    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Recebe o numero que sera usado
        int number = scan.nextInt();

        // Usa a funcao para calcular o inverso das potencias de 3
        System.out.print("1 ");
        cube(number);

    }

    public static void cube(int n){

        // Mostra o inverso das potencias de 3 de 1 a N
        for(int i = 1; i < n; i++)
            System.out.print("1/" + String.format("%.0f", Math.pow(3, i)) + " ");

    }

}