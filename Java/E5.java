import java.util.*;

public class E5 {

    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Recebe o numero que sera usado
        String input = scan.nextLine();

        // Usa a funcao para verificar se e um palindromo
        if(isReverse(input))
            System.out.println("E um palindromo");
        else
            System.out.println("Nao e um palindromo");

    }

    public static boolean isReverse(String s){
   
        // Instancia da classe StringBuilder com S de parametro
        StringBuilder sb = new StringBuilder(s);

        // Retorn se a string S e igual ao reverso dela mesma (usando a StringBuilder para reverter a string) desconsiderando espacos
        return s.replace(" ", "").contentEquals(sb.reverse().toString().replace(" ", ""));

    }

}