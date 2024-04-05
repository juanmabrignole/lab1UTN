package ejerciciosResueltos;

import java.util.Scanner;

public class tp1Ejercicio01 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horasTrabajadas;
        final int VALOR_HORA = 17000;
        String nombreOperario;
        double sueldoOperario;


        System.out.println("Ingrese el nombre del operario: ");
        nombreOperario = input.nextLine();

        System.out.println("Ingrese la cantidad de horas trabajadas por: " + nombreOperario);
        horasTrabajadas = Integer.parseInt(input.nextLine());

        sueldoOperario = horasTrabajadas * VALOR_HORA;

        System.out.println("El sueldo que debe cobrar el operario " +  nombreOperario + " - " + " es: " + sueldoOperario);

        input.close();
    }
}
