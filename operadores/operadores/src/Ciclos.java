import java.util.Scanner;

// ciclo while

// while(condicion){
//     instrucciones

// }

public class Ciclos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int i = 1, contador;
        // int i=10;

        System.out.print("Digite cuantos numeros quiere por pantalla: ");
        contador = entrada.nextInt();
        while (i <= contador) {// Mientras que esta condicion sea verdadera

            System.out.println(i);
            i++;
            // i--; Decremento

        }

    }
}
