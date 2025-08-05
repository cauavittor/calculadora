import model.Calculadora;
import view.CalculadoraInput;
import controller.CalculadoraApp;


public class Main {
    public static void main(String[] args) {
        CalculadoraInput calculadoraInput = new CalculadoraInput();
        Calculadora calculadora = new Calculadora();
        CalculadoraApp calculadoraApp = new CalculadoraApp();


        calculadoraApp.init();


    }
}
