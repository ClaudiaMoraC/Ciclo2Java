import javax.swing.JOptionPane;

//Estructura
//Condicional es donde se evalua una condicion 

// if(){
//     instruccion1

// }
// else{

//     instruccion2
// }

public class condicionales {

    public static void main(String[] args) {

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if (numero == dato) {// !=->Desigualdad, > Mayor, < Menor, >= Mayor igual, <= Menor igual

            JOptionPane.showMessageDialog(null, "El numero es igual a 5 : ");
        } else {

            JOptionPane.showMessageDialog(null, "El numero es diferente de 5 ");
        }

    }
}
