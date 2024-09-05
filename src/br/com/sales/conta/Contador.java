package br.com.sales.conta;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int firstNumber = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int secondNumber = scan.nextInt();

        try{
            int occurrences = checkNumber(firstNumber, secondNumber);
            for(int i = 1; i <= occurrences; i++) {
                System.out.println("Número " + i);
            }
        } catch(Exception e) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        }
    }

    public static class ParametrosInvalidosException extends Exception {};

    static int checkNumber(int first, int second) throws ParametrosInvalidosException {
        if(first > second) throw new ParametrosInvalidosException();
        return second - first;
    }
}
