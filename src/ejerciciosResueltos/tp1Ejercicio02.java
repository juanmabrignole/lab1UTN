package ejerciciosResueltos;

import java.util.Scanner;

public class tp1Ejercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int auxiliar;

        System.out.println("Ingrese el primer número: ");
        primerNumero= Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el segundo número: ");
        segundoNumero = Integer.parseInt(input.nextLine());

        System.out.println("El primer número ingresado es: " + primerNumero + " y el segundo número ingresado es: " + segundoNumero);

        auxiliar = primerNumero;
        primerNumero = segundoNumero;
        segundoNumero = auxiliar;

        System.out.println("El primer número ingresado es: " + primerNumero + " y el segundo número ingresado es: " + segundoNumero);

        input.close();
    }

}
