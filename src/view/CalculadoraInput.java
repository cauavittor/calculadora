package view;

import model.Calculadora;

import java.util.Scanner;

public class CalculadoraInput {
    private int number1;
    private int number2;


    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void lerNvalido(Scanner scanner) {

        Calculadora calculadora = new Calculadora();

        System.out.print("Digite um número válido: ");
        number1 = scanner.nextInt();
        System.out.print("Digite um outro número válido: ");
        number2 = scanner.nextInt();


    }

    public int lerOperacaoValida(Scanner scanner) {


        System.out.println("Escolha o número referente a operção desejada ");

        System.out.println("--------------------");
        System.out.println("OPERAÇÕES");
        System.out.println("--------------------");

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potênciação");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.println("Escolha um número referente VÁLIDO para as operações listadas abaixo");
            return lerOperacaoValida(scanner);
        } else {
            return choice;
        }
    }


}
