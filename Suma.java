import java.util.Scanner;
public class Suma {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingresa un numero: ");
        double num = scanner.nextDouble();

        System.out.print("Ingresa un numero: ");
        double nume = scanner.nextDouble();

        System.out.print("Ingresa un numero: ");
        double numer = scanner.nextDouble();

        System.out.print("Ingresa un numero: ");
        double numero = scanner.nextDouble();

        double resultado = num + nume + numer + numero;
        System.out.print("tu suma es: " +resultado);

    }
}