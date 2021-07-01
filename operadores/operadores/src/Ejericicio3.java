import java.util.Scanner;

//Ejercicio 3: Guillermo tiene N dolares. Luis tiene 
//la mitad de lo que posee Guillermo. Juan tiene la mitad de 
//lo que poseen Luis y Guillermo juntos. 
//Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

public class Ejericicio3 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad de dinero que tiene Guillermo");

        guillermo = entrada.nextFloat();
        // Luis tiene la mitad de lo que tiene Guillermo
        luis = guillermo / 2;

        // Juan tiene la mitad de lo que tiene guillermo y luis juntos

        juan = (guillermo + luis) / 2;

        // Imprimir la cantidad de dinero que tiene los 3
        total = guillermo + luis + juan;

        System.out.println("La cantidad de dinero que hay entre los 3: " + total);

    }
}
