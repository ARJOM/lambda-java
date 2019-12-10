import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
//        texto = texto.toLowerCase();

        Arrays.stream(texto.split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
