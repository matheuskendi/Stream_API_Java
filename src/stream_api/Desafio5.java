package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio5 {
    public static void main(String[] args) {

        //Lista dos numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Consumer
        Consumer<List<Integer>> mediaDosNumerosMaior5 = numero ->{
            int soma = (int)numeros.stream()
                    .filter(num -> num > 5)
                    .mapToInt(num -> num) // Converte para int (caso necessário)
                    .average()//Faz o calculo da media
                    .orElse(0);//Define o valor como 0 caso não tenha alguma variavel

            System.out.println(soma);
        };

        mediaDosNumerosMaior5.accept(numeros);
    }

}
