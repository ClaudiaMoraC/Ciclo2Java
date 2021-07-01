
//Ejercicio: 
//1.Hacer un prgrama que calcule e imprima la suma de  3 calificaciones

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // 1.

        float nota1, nota2, nota3, suma;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las 3 notas:");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3;// Sumamos las 3 notas

        System.out.println("\nLa suma es: " + suma);

        // 2. Hacer un programa que calcule e imprima
        // imprima el salario semanal de un empleado a partir de sus horas semanales
        // trabajadas y de su salario por hora.

    }
}
