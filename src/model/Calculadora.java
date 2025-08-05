package model;

public class Calculadora {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int soma(int number1, int number2) {
        return number1 + number2;

    }

    public int diminuir(int number1, int number2) {
        return number1 - number2;

    }

    public int multiplicação(int number1, int number2) {
        return number1 * number2;
    }

    public double divisao(int number1, int number2) {
        return (double) number1 / (double) number2;

    }

    public int potenciacao(int number1, int elev) {
        int resultado = 1;
        for (int i = 0; i < elev; i++){
            resultado *= number1;
        }
        return resultado;
    }
}

