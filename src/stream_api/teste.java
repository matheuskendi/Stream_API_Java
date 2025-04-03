package stream_api;

import java.util.Arrays;
import java.util.List;

public class teste {
    public static void main(String[] args) {

        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra os números maiores que 5 e calcula a soma
        int soma = numeros.stream()
                .filter(num -> num > 5) // Filtra números maiores que 5
                .mapToInt(num -> num)   // Converte para int
                .sum();                // Soma os valores

        // Conta quantos números são maiores que 5
        long quantidade = numeros.stream()
                .filter(num -> num > 5) // Filtra números maiores que 5
                .count();               // Conta os números

        // Calcula a média como int
        int media = soma / (int) quantidade; // Divisão inteira

        // Imprime o resultado
        System.out.println("Média dos números maiores que 5: " + media);
    }
}