package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio4 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Consumer<Integer> numeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
