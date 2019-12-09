import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        texto = texto.toLowerCase();

        List<String> frase = Arrays.asList(texto.split(" "));

        frase.stream().distinct().sorted(String::compareTo).forEach(System.out::println);
    }
}
