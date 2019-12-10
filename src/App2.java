import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App2 {

    public static void main(String[] args) {
        Random gerador = new Random();

        List<Integer> numeros = new Random().ints(30, 1, 101).boxed().collect(Collectors.toList());



//        for (int i = 0; i < 30; i++){
//            numeros.add(gerador.nextInt(31));
//        }

        System.out.println("Original:");
        System.out.println(numeros);

        System.out.println("Crescente");
        System.out.println(numeros.stream().sorted().collect(Collectors.toList()));

        System.out.println("Decrescente");
        System.out.println(numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println("Únicos");
        System.out.println(numeros.stream().distinct().sorted().collect(Collectors.toList()));
    }
}
