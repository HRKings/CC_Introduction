import java.util.*;


public class E1 {

    public static void main(String[] args) {
        
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Variavel temporaria para armazenamento do numero e Lista dinamica para armazenar todos os valores
        int number = 0;
        List<Integer> numbers = new ArrayList<>();

        // Enquanto o valor for maior que zero, prosseguir
        while(number >= 0){
            number = scan.nextInt();

            // Se o numero for maior que zero, adicionar a lista
            if(number >= 0)
                numbers.add(number);
        }

        // Organiza a lista do menor para o maior
        numbers.sort(Comparator.naturalOrder());

        // Mostra o primeiro numero da lista (O menor no caso)
        System.out.println("O menor numero e: " + numbers.get(0));

    }

}