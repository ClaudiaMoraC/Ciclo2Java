import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.print("Número incorrecto: ");

        }

        else {
            System.out.println("Tabla del " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }

        }

    }
}
