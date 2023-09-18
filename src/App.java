import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Hola");

        System.out.println("Ingrese su numero 1");
        int numero = Integer.parseInt(shell.readLine());

        System.out.println("\nIngrese su numero 2");
        int numero2 = Integer.parseInt(shell.readLine());

        int addition = numero + numero2;
        int resta = numero - numero2;
        int multi = numero * numero2;
        float division = Float.valueOf(numero) / Float.valueOf(numero2);

        System.out.println("\nLa suma de " + numero + " y " + numero2 + " es igual a: " + addition);
        System.out.println("\nLa resta de " + numero + " y " + numero2 + " es igual a: " + resta);
        System.out.println("\nLa mult de " + numero + " y " + numero2 + " es igual a: " + multi);
        System.out.println("\nLa divi de " + numero + " y " + numero2 + " es igual a: " + division);
    }

    public static Console shell = System.console();
}