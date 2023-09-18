import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner shell = new Scanner(System.in);

        System.out.println("Hola");

        System.out.println("Ingrese su numero 1");
        int numero1 = shell.nextInt();

        System.out.println("\nIngrese su numero 2");
        int numero2 = shell.nextInt();

        int addition = numero1 + numero2; // Suma
        int subtraction = numero1 - numero2; // Resta
        int multiplication = numero1 * numero2; // Multiplicación
        float division = (float) numero1 / numero2; // División

        // Operaciones básicas
        System.out.println("\nOperaciones Básicas:");
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a: " + addition);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a: " + subtraction);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual a: " + multiplication);
        System.out.println("La división de " + numero1 + " y " + numero2 + " es igual a: " + division);

        // Comparadores lógicos
        System.out.println("\nComparadores Lógicos:");
        System.out.println(numero1 + " es mayor que " + numero2 + ": " + (numero1 > numero2));
        System.out.println(numero1 + " es menor que " + numero2 + ": " + (numero1 < numero2));
        System.out.println(numero1 + " es igual a " + numero2 + ": " + (numero1 == numero2));
        System.out.println(numero1 + " es diferente de " + numero2 + ": " + (numero1 != numero2) + "\n");

        shell.close();
    }
}
