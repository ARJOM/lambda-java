import java.util.*;

public class App2 {

    public static void main(String[] args) {
        Random gerador = new Random();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 30; i++){
            numeros.add(gerador.nextInt(31));
        }

        System.out.println("Crescente");
        numeros.stream().sorted(Integer::compareTo).forEach(System.out::println);

        System.out.println("Decrescente");
        numeros.stream().sorted(Comparator.comparing(Integer::byteValue).reversed()).forEach(System.out::println);

        System.out.println("Únicos");
        numeros.stream().distinct().forEach(System.out::println);

    }
}
