package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 9, 20);

        numeros.stream()
                .filter(num -> num > 10)
                .forEach(num -> System.out.println(num));

    }
}
