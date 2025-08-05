package controller;

import model.Calculadora;
import view.CalculadoraInput;

import java.util.Scanner;
import java.util.SortedMap;

public class CalculadoraApp {




    public void init(){

        Calculadora calculadora = new Calculadora();
        CalculadoraInput calculadoraInput = new CalculadoraInput();

        Scanner scanner = new Scanner (System.in);

        System.out.println("--------------------");
        System.out.println("CALCULADORA");
        System.out.println("--------------------");

        calculadoraInput.lerNvalido(scanner);



        int operacaoValida = calculadoraInput.lerOperacaoValida(scanner);

        switch (operacaoValida){
            case 1:
                System.out.println(calculadora.soma(calculadoraInput.getNumber1(), calculadoraInput.getNumber2()));
                break;

            case 2:
                System.out.println(calculadora.diminuir(calculadoraInput.getNumber1(), calculadoraInput.getNumber2()));
                break;

            case 3:
                System.out.println(calculadora.multiplicação(calculadoraInput.getNumber1(), calculadoraInput.getNumber2()));
                break;

            case 4:
                System.out.println(calculadora.divisao(calculadoraInput.getNumber1(), calculadoraInput.getNumber2()));
                break;

            case 5:
                System.out.println(calculadora.potenciacao(calculadoraInput.getNumber1(), calculadoraInput.getNumber2()));
                break;
        }

        end(scanner);


    }

    public void end(Scanner scanner){
        System.out.println("Deseja continuar? S/N");
        char resposta = scanner.next().charAt(0);
        String respostaS = String.valueOf(resposta);
        if (respostaS.equals("S") || respostaS.equals("s")){
             init();
        }
        else {
            System.out.println("Fim.");
        }
    }

}
